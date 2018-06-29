package wmich.edu.CS5310.A3.huffman.AWahyudiono;

import java.util.Comparator;

/**
 * Compare implement Java Util Comparator
 * Used for Priority Queue
 * It will compare frequency between 2 nodes and return value 1, 0, -1 for 
 * larger, equal or less result respectively.
 * @author agung
 *
 */

public class Compare implements Comparator<Node> {
	
	@Override
	public int compare(Node a, Node b) {
		
		float freqA = a.getFreq();
		float freqB = b.getFreq();
		
		if(freqA < freqB) {
			return -1;
		} 
		
		if(freqA > freqB) {
			return 1;
		}
		
		return 0;
		//return a.getFreq() - b.getFreq();
		
	}

}
