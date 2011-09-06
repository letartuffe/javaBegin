package ios;

import java.io.*;

public class ObjectCustomerRead {

	public static void main(String[] args) {
		
		ObjectCustomer oc;
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		String fileName = "object.ser";
		
		try {

			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			System.out.println(ois.readObject());
			System.out.println("역직렬화 완료");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
		
				try {
					if(fis !=null) fis.close();
					if(ois !=null) ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

}
