package binarySearchTreeAssignment;

public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree<Integer> tree= new BinarySearchTree<Integer>();
		tree.add(50);
		tree.add(40);
		tree.add(30);
		tree.add(45);
		tree.add(60);
		tree.add(90);
		tree.add(80);
		tree.add(100);
		tree.add(110);
		
		tree.printSideways();
		BinarySearchTree<Integer> reversed=tree.reverse();
		reversed.printSideways();
		
		System.out.println("Height of tree: "+tree.height());
		System.out.println("All tree paths");
		tree.printPaths();
	}

}
