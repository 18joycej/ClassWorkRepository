package queues;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircLinkedUnbndQueue<String> queue=new CircLinkedUnbndQueue<String>();
		queue.enqueue("Hello");
		queue.enqueue("There");
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		queue.enqueue("Friend");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
	}

}
