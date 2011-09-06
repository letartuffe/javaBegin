package ios;

import java.io.*;

public class InOutStreamReaderEx {

	public static void main(String[] args) {
		
		String id ;
		String pass ;
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		

		String input = "";
		
		try {
			System.out.print("id : ");
			input = br.readLine() ;
			id = input;
			System.out.print("pass : ");

			input = br.readLine() ;
			pass = input;
			
			System.out.println("id : " + id + "    pass : " + pass);
			
			r.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if (r != null) r.close();
				if (br != null) br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		

	}

}
