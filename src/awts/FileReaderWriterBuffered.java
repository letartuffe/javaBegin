package ios;

import java.io.*;
public class FileReaderWriterBuffered {


	public static void main(String[] args) {
		
		String str = "파일리더라이트버퍼트.txt";
		String fileName = "FileReaderWriterBuffered.txt"; 
		
		FileWriter fw = null ;
		FileReader fr = null;
		BufferedWriter  bw = null ;
		BufferedReader br = null ;

		
		try {
			
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
			fw.close();
			
			
			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			int readChar ;
			
			while(  (  readChar = br.read() ) != -1   ){
				System.out.print((char)readChar) ;
			}
			
			br.close();
			fr.close();
			//System.out.println(fo.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {

					if (fw != null) fw.close() ;
					if (bw != null) fw.close() ;
					if (br != null) fw.close() ;
					if (fr != null) 	fr.close() ;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}		
		
	}//main

}
