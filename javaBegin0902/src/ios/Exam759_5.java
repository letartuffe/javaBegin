package ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Exam759_5 {

	public static void main(String[] args) {
		ObjectEX oe = null;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		String fileName = "object.ser";
		
		try {
			oe  = new ObjectEX("Kim");
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(oe);//객체 직렬화			
			System.out.println("객체 직렬화 완료!");
			
			System.out.println("---------------");
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			ObjectEX oe2 = (ObjectEX)ois.readObject();	
			System.out.println(oe2);
			System.out.println("객체 역직렬화 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {	if(fos!=null) fos.close();
					if(oos!=null) oos.close();	
			} catch (IOException e) {e.printStackTrace();
			}	
		}		
	}

}

class ObjectEX implements Serializable {
	private String name;

	public ObjectEX(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[고객명 : " + name + "]";
	}
	
}