package ios;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		//File ��ü dir ����
		
		//���� ��θ� �Ű������� dir����
		
		//dir�� �̿��Ͽ� ���� ������ ���� ����� ���ڿ� �迭 fileList�� �����ϰ�
		//ȭ�鿡 ���
		
		File dir ;
		
		dir = new File(".");
		
		String[] fileList = dir.list();
		
		for (String temp : fileList){
			System.out.println(temp);
		}
		
		
		
		
		
		
		
	}

}
