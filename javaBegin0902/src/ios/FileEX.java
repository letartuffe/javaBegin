package ios;

import java.io.File;

public class FileEX {

	public static void main(String[] args) {
		//File ��ü dir ����
		File dir;
		
		//���� ���(��ġ)�� �Ű������� dir ����
		dir = new File(".");
		
		//dir�� �̿��Ͽ� ���� ������ ����Ʈ��
		//���ڿ� �迭 fileList�� �����ϰ�
		String[] fileList = dir.list();
				
		//ȭ�鿡 ���
		for(String temp : fileList){
			System.out.println(temp);
		}
	}

}




















