import java.awt.Color;

public class Editor4 {
    
    /*This client program performs another striking visual effect:
     * it morphs an image into its grescaled version
     * Example: % java Editor4 thor.ppm 50
     */
    public static void main (String[] args) {
		String fileName = args[0];
		int times = Integer.parseInt(args[1]);
			
		Color[][] source = Runigram.read(fileName);	
		Color[][] grayImage = null;	
			
		grayImage = Runigram.grayScaled(source);

		Runigram.setCanvas(source);
		Runigram.morph(source, grayImage, times);	
	}
}
