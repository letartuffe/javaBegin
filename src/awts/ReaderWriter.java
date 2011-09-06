package ios;
import java.io.*;
public class ReaderWriter {

	public static void main(String[] args) {

		String str = "저장할 문장";
		String fileName = "readerWriter.txt";
		
		FileWriter fw = null;
		
		try {
			
			
			fw = new FileWriter(fileName);
			fw.write(str);
			fw.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {

					if (fw != null) 	fw.close() ;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		FileReader fo = null;
		
		try {
			fo = new FileReader(fileName);
			
			int readChar ;
			
			while(  (  readChar = fo.read() ) != -1   ){
				System.out.print((char)readChar) ;
			}
			
			fo.close();
			//System.out.println(fo.toString());
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (fo != null) 	fo.close() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		
		
		
		}//main

}
