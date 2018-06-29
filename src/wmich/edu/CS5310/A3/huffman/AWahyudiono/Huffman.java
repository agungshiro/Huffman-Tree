package wmich.edu.CS5310.A3.huffman.AWahyudiono;

import java.util.PriorityQueue;

/**
 * Create a Huffman tree using Java Util Priority Queue 
 * @author agung
 *
 */

public class Huffman {
	
	private int size;
	
	/**
	 * Constructor
	 * @param c, char array of character or message
	 * @param f, int array of frequency of each character
	 */
	public Huffman(char[] c, float[] f) {
		
		// get size of data
		this.size = c.length;
		
		// Instantiage Priority Queue class 
		PriorityQueue<Node> pq = new PriorityQueue<Node>(this.size, new Compare());
		
		for(int i = 0; i < this.size; i++ ) {
			
			// Create a leaf node for each pair of data and frequency
			// This node is a single node that doesnt't have child node
			Node node = new Node(c[i], f[i]);
			
			// set both child node (left and right) to null
			node.setLeft(null);
			node.setRight(null);
			
			// add node into min heap data structure using Priority queue
			pq.add(node);
			
		}
		
		// Create root node
		Node root = null;
		
		// Polling the data from min heap / priority queue
		// starting to build the Huffman tree. 
		// This looping will do  while size of queue larger than 1
		// peek-ing is to get the min data without removing from heap
		// poll-ing is to remove the min data from heap
		while (pq.size() > 1) {
			
			// Polling a node (with min freq) from priority queue (min heap)
			Node nodeA = pq.peek(); 
			pq.poll(); 
			
			// Polling another node (with min freq) from priority queue (min heap)
			Node nodeB = pq.peek();
			pq.poll();
			
			// create a node as a parent node with the data = '-' (no-data)
			// and the freq = Summation of nodeA's and nodeB's freq
			Node nodeX = new Node('-',(nodeA.getFreq() + nodeB.getFreq()));
			
			// set nodeA as the Left leafNode of current/new node
			nodeX.setLeft(nodeA);
			
			// set nodeB as the Right leafNode of current/new node
			nodeX.setRight(nodeB);
			
			// Set this new node as current root
			root = nodeX;
			
			// add this new created node to the Priority queue again
			pq.add(nodeX);
		}
		
		// Print the code of each character
		printCode(root,"");
	}
	
	/**
	 * Method to print the code
	 * @param n, Node instance (the root node)
	 * @param s, string which is 0 or 1
	 */
	public void printCode(Node n, String s) {
		
		// If it's a leaf node ( which is has no children ), and the data is letter
		if(n.getLeft() == null && n.getRight() == null && Character.isLetter(n.getData())) {
			// print out the data
			System.out.println(n.getData() + ":" + s);
			return;
		}
		
		// add the code with 0 if the process traversing to the left child node
		printCode(n.getLeft(), s + "0");
		
		// add the code with 1 if the process traversing to the right child node
		printCode(n.getRight(), s + "1");
	}

}
