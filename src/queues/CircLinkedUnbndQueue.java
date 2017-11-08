package queues;
import support.LLNode;
public class CircLinkedUnbndQueue<T> implements UnboundedQueueInterface<T>{

	protected LLNode<T> rear;
	
	public CircLinkedUnbndQueue() {
		rear=null;
	}
	public T dequeue() throws QueueUnderflowException {
		LLNode<T> temp=null;
		if (rear==null){
			throw new QueueUnderflowException("This queue is empty.");
		}
		else if(rear.getLink()==rear){
			temp=rear;
			rear=null;
			return temp.getInfo();
		}
		else {
			temp=rear.getLink();
			rear.setLink(rear.getLink().getLink());
			return temp.getInfo();
		}
	}
	public void enqueue(T element) {
		if(rear==null){
			rear=new LLNode<T>(element);
			rear.setLink(rear);
		}
		else{
			LLNode<T> temp=new LLNode<T>(element);
			temp.setLink(rear.getLink());
			rear.setLink(temp);
			rear=temp;
		}
	}	
	public boolean isEmpty(){
		if(rear==null) return true;
		else return false;
	}
}