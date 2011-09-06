package ios;

import java.io.*;


public class PrintScreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "ps.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);

			ps.println(10);
			ps.println(3.14);
			ps.println('A');
			ps.println(true);
			ps.println("Hello");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			
			
			try {
				if(ps != null) ps.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
	}
}
