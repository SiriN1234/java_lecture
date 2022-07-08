import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
	public static void main(String[] args) {
		
		// 선언
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// 데이터 넣기
		for(int i = 100; i <= 105; i++) {
			al.add(i);
		}
		for(int i = 1; i <= 5; i++) {
			al.add(i);
		}
		
		// 결과 출력
		System.out.println(al);
		
		// 데이터 제거
		al.remove(3); // 인덱스로 제거
		System.out.println(al);
		
		// 값으로 지우기 위해서 값으로 인덱스를 얻어보자
		// 해당 값으로 지우기
//		System.out.println(al.indexOf(5));
//		al.remove(al.indexOf(5));
//		System.out.println(al);
//		
//		System.out.println("크기 : " + al.size());
//		al.add(100);
//		System.out.println("크기 : " + al.size());
//		
//		
//		for(int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		Iterator iter1 = al.iterator();
		while(iter1.hasNext()) {
			System.out.println("이터레이터로 찍은 원소 : " + iter1.next());
		}
		
		int index = al.indexOf(5);
		System.out.println(index);
		
		al.remove(5); // 오버로딩에 의해서 인덱스로 지우기
		al.remove(Integer.valueOf(5)); // 오버로딩에 의해서 값으로 지우기
		System.out.println(al);
		
		
		
		
	}

}
