
import java.util.Vector;

public class SeatMate{

		
	public static void main(String[] args) {

		String[] list1 = {"�賲��", "������", "������", "������", "����ȫ", "��â��", "������", "������"};
		String[] list2 = {"����ȫ", "�輺��", "�輱��", "������", "�Ѽ���", "����ö", "�迵��", "������", 
						  "��μ�", "�̼���", "������"};

		
		Vector vList = new Vector();
		for(int i=0 ; i<list1.length ; i++){
			vList.add(list1[i]);
		}
		
		Vector vec = new Vector();
		for(int i=0 ; i<list1.length ; i++){
			int num = (int)(Math.random()*vList.size());
			vec.add(vList.get(num));
			vList.remove(num);
			vList.trimToSize();

		}
		
		for(int i=0 ; i<vec.size() ; i++){
			System.out.print(vec.get(i) + " ");
//			if((i+1)%3==0){
//				System.out.println();
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n================================================");

		vList = new Vector();
		for(int i=0 ; i<list2.length ; i++){
			vList.add(list2[i]);
		}
		
		vec = new Vector();
		for(int i=0 ; i<list2.length ; i++){
			int num = (int)(Math.random()*vList.size());
			vec.add(vList.get(num));
			vList.remove(num);
			vList.trimToSize();

		}
		
		for(int i=0 ; i<vec.size() ; i++){
						
				System.out.print(vec.get(i) + " ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
