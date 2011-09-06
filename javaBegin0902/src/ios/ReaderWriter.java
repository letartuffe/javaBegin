package ios;

import java.io.*;

public class ReaderWriter {

	public static void main(String[] args) {
		String str = "FileWriter로 저장될 문장입니다.~";
		String fileName = "readerWriter.txt";
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(str);
			fw.close();			
		
			System.out.println("-------------------");
			fr = new FileReader(fileName);
			int input = 0;
			while( (input=fr.read()) != -1){
				System.out.print((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {	if(fw!=null) fw.close();
					if(fr!=null) fr.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}

}







