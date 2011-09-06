package ios;

import java.io.File;

public class FileEX {

	public static void main(String[] args) {
		//File 객체 dir 선언
		File dir;
		
		//현재 경로(위치)를 매개변수로 dir 생성
		dir = new File(".");
		
		//dir을 이용하여 현재 폴더의 리스트를
		//문자열 배열 fileList에 저장하고
		String[] fileList = dir.list();
				
		//화면에 출력
		for(String temp : fileList){
			System.out.println(temp);
		}
	}

}




















