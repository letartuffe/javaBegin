//int형 변수 visitCount를 선언하고 0으로 초기화
//if문을 이용하여, 첫방문이면 환영메세지 출력
//visitCount가 1보다 크면 재방문 메세지 출력
//메세지 출력후 visitCount 1증가
//else if 이용하여 만번째 방문 메세지 출력

public class CountIF1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int visitCount = 9999;
		if (visitCount < 1){
			System.out.println("처음오셨어요 환영합니다.");
		}else if(visitCount == 9999){
			System.out.println("축하합니다. 만번째 방문입니다. 감사합니다.");
		}else{
			System.out.println("다시오셨군요 감사합니다.");
		}
		System.out.printf("%d번 오셨어요.\n", ++visitCount);
	}
}
