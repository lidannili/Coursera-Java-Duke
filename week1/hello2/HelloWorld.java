import edu.duke.*;

public class HelloWorld {
	/**
	 * Read file of ways to say hello and print each line of the file
	 */
	public void sayHello(){
		URLResource rs = new URLResource("http://www.dukelearntoprogram.com/java/somefile.txt"); 
		for (String word : rs.words()) {
			System.out.println(word);
		}
	}
}
