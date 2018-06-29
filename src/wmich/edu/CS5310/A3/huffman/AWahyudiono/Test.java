package wmich.edu.CS5310.A3.huffman.AWahyudiono;

public class Test {

	public static void main(String[] args) {
		
		char[] data = { 'a','b','c','d','e','f','g',
						'h','i','j','k','l','m','n',
						'o','p','q','r','s','t','u',
						'v','w','x','y','z'};
        float[] freq = {0.073f,0.009f,0.030f,0.044f,0.130f,0.028f,0.016f,
        				0.035f,0.074f,0.002f,0.003f,0.035f,0.025f,0.078f,
        				0.074f,0.027f,0.003f,0.077f,0.063f,0.093f,0.027f,
        				0.013f,0.016f,0.005f,0.019f,0.001f
        				};
        
        Huffman h = new Huffman(data,freq);
        
	}

}
