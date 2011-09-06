package str;

public class StringBufferTest {

	public static void main(String[] args) {
		String a = "Hello";
		a += " Hi";
		
		//StringBuffer라서 객체를 만들지 않고
		//이렇게 값을 대입해서 사용할 수 없음.
		//StringBuffer c = "Goodbye";
		//그래서 이렇게 객체를 만들어서 사용
		StringBuffer b = new StringBuffer();
		b.append("Good bye");
		
		System.out.println(b);
		
		//a = b;
		a = b.toString();
	}

}






