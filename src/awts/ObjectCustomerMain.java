package ios;

import java.io.*;
public class ObjectCustomerMain {

	public static void main(String[] args) {
		
		ObjectCustomer oc;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		String fileName = "object.ser";
		
		try {

			oc = new ObjectCustomer("±èº¹µ¿", 33);
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(oc);
			System.out.println("°´Ã¼ Á÷·ÄÈ­ ¿Ï·á");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
		
				try {
					if(fos !=null) fos.close();
					if(oos !=null) oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
		
	}
}
