package ios;

import java.io.*;

public class Exam759_5 {
	
	
	public static void main(String[] args) {
		ObjectEx oc;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		FileInputStream fis = null;
					
		try {
			String fileName = "test.scr";
			
			oc = new ObjectEx("kim");
			
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			//��ü ����ȭ			
			oos.writeObject(oc);
			System.out.println("��ü ����ȭ �Ϸ�");
			
			
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			System.out.println(ois.readObject());
			System.out.println("������ȭ �Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
		
				try {
					if(fos !=null) fos.close();
					if(oos !=null) oos.close();
					if(fis !=null) fis.close();
					if(ois !=null) ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
		
		
	}//main

}

class ObjectEx implements Serializable {
	
	private static String name ;
	private static int age ;
	private static String fileName = "";

	ObjectEx(String n){
		name = n;
	}
	
	public String toString(){
		return "���� : " +name  ;
	}
	
}//class

