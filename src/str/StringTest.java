package str;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Java World";
		
		int index = s1.indexOf("a");
		System.out.println("��ó�� a�� ��ġ: "+index);
		
		index = s1.lastIndexOf("a");
		System.out.println("��ó�� a�� ��ġ: "+index);
		
		char c = s1.charAt(3);
		System.out.println("3��° ��ġ�� ����: "+c);
		
		//W�� ��ġ���� index�� ����
		index = s1.lastIndexOf("W");
		
		
		String str = s1.substring(index);
		System.out.println(str);
		
		//Wor�� ����ϱ�.
		str = s1.substring(5,8);
		System.out.println(str);
		

		str = s1.substring(index,index+3);
		System.out.println(str);
		
		System.out.println(s1.length());
		
		//���ڿ� �߶� �迭�� ����.
		String[] arr = s1.split(" ");
		
		for (int i =0;i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		//20110821�� �Է��ؼ� ����Ϸ� ����.
		//2011�� 08�� 21�� �� ���
		
		String today = "20110821";
		System.out.println(today.subSequence(0, 4)+"�� "+today.subSequence(4, 6)+"�� "+today.substring(6)+"��");
		
		System.out.println("========================");
		
		
		
		
	}
}
