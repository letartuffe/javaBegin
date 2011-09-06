package str;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// 
		//String a = new String(); 아래와 같음
		String a = "Hellow";
		a += "hi!" ;
		
		
		
		//String만 아래와 같이 만들수 있음. 다른건 안됨
		//StringBuffer c = "Goodbye" ;
		
		StringBuffer b = new StringBuffer();
		b.append("Goodbye");
		
		System.out.println(b);
		
		//아래는 안됨. String 에 StringBuffer가 안들어감
		//a = b;
		
		
		a = b.toString();
		
		
		
		

	}

}
