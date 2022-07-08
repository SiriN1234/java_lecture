import java.io.IOException;

//키보드로 입력받은것이 인트로 변환하면 무엇인지 파악하기
public class ex1 {

	public static void main(String[] args) {
		try {
			System.out.println("타이핑을 쳐주세요.");
			int i = System.in.read();
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		//A = 65    B=66    Z =90   a=97  z=122
		//0 = 48    1=49
		//  \n = 13
		//가 = 234   갸=234   걔=234
		// 알파벳은 1바이트로 표현되는 크기의 데이터인데 한글은 인코딩에 따라2 또는 3바이트로 표현된다.
		// 그래서 올바른 값을 저장, 일기 못하고있다.
	}
}
