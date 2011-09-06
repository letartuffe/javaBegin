package str;

public class StringCompare {

	public static void main(String[] args) {
		String a = "a";
		String b = new String("a");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println("-----------");
		System.out.println(a.hashCode());
		a = "java";
		System.out.println(a.hashCode());
		
	}

}
