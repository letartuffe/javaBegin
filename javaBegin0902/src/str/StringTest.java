package str;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java World";
		
		int index = s1.indexOf("a");
		System.out.println("�� ó�� a�� ��ġ : " + index);
		
		index = s1.lastIndexOf("a");
		System.out.println("������ a�� ��ġ : " + index);
		
		char c = s1.charAt(3);
		System.out.println("3��° ��ġ�� ���� : " + c);
		
		index = s1.indexOf("W");//W�� ��ġ���� index�� ����
		String str = s1.substring(index);
		System.out.println(str);
		
		//Wor�� ���
		str = s1.substring(index, index+3);
		System.out.println(str);
		
		System.out.println(s1.length());
		
		//���ڿ��� �������� �����Ͽ� �߶� �迭�� ����
		String[] arr = s1.split(" ");
		for(int i=0 ; i<arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("==============");
		//20110821�� substring�� �̿��Ͽ� 
		//������ ���� �и��Ͽ� ���
		//2011�� 08�� 21��

		System.out.println("==============");
		//�ֹε�Ϲ�ȣ(991122-1234567)�� 
		//������ ������ ������ ��, 
		//������ �Ǵ��Ͽ� ������ ���� ��� ���
		//"����� ����"

		System.out.println("==============");
		//my.image.picture.txt�� Ȯ���ڸ� �����Ͽ�
		//ȭ�鿡 ���
		//"�Է� ������ Ȯ���� : txt" 
	}

}
