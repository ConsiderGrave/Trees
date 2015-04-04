public class Tree {
	Node root;
	public void insert(Node a){
		if (root == null){
			root = a;
		} else {
			if (a.value <= root.value){
				root.left = a;
			} else {
				root.right = a;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node v = new Node(100);
		Node s = new Node(24);
		Node c = new Node(50);
		Tree b = new Tree();
		b.insert(c);
		b.insert(v);
		b.insert(s);
		System.out.println(b.root.value);
		System.out.println(b.root.left.value);
		System.out.println(b.root.right.value);
	}

}
