package ios;

import java.io.*;

public class ObjectCustomerMain {
	public static void main(String[] args) {
		ObjectCustomer oc;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		String fileName = "object.ser";
		
		try {
			oc  = new ObjectCustomer("Kim", 10);
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(oc);//��ü ����ȭ			
			System.out.println("��ü ����ȭ �Ϸ�!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {	if(fos!=null) fos.close();
					if(oos!=null) oos.close();	
			} catch (IOException e) {e.printStackTrace();
			}	
		}		
	}
}





