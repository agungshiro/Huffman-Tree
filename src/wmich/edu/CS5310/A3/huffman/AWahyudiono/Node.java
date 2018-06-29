package wmich.edu.CS5310.A3.huffman.AWahyudiono;

/**
 * Node Class, Represent the tree nodes
 * @author agung
 *
 */

public class Node {
	
	private char data;	// Node Data
	private float freq;	// Node Frequency 
	private Node left;	// Left child node
	private Node right;	// Right child node
	
	/**
	 * Constructor
	 * @param data , set char as node data
	 * @param freq , set integer value for the frequency of the data
	 */
	public Node(char data,float freq) {
		
		// set data
		this.data = data;
		
		// set frequency
		this.freq = freq;
	}
	
	/**
	 * Set child left node
	 * @param n, node instance
	 */
	public void setLeft(Node n) {
		this.left = n;
	}
	
	/**
	 * set child right node
	 * @param n, node instance
	 */
	public void setRight(Node n) {
		this.right = n;
	}
	
	/**
	 * get node data
	 * @return char of node data
	 */
	public char getData() {
		return this.data;
	}
	
	/**
	 * get frequency data
	 * @return integer frequency of node data
	 */
	public float getFreq() {
		return this.freq;
	}
	
	/**
	 * get left child
	 * @return, left child node instance 
	 */
	public Node getLeft() {
		return this.left;
	}
	
	/**
	 * get right child
	 * @return, right child node instance
	 */
	public Node getRight() {
		return this.right;
	}

}
