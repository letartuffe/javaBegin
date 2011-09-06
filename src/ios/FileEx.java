package ios;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		//File 객체 dir 선언
		
		//현재 경로를 매개변수로 dir생성
		
		//dir을 이용하여 현재 폴더위 파일 목록을 문자열 배열 fileList에 저장하고
		//화면에 출력
		
		File dir ;
		
		dir = new File(".");
		
		String[] fileList = dir.list();
		
		for (String temp : fileList){
			System.out.println(temp);
		}
		
		
		
		
		
		
		
	}

}
