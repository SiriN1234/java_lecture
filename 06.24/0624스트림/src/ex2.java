import java.io.IOException;

//대문자Q를 칠때까지 죽지않고 입력된 문자에 해당하는 int 출력
public class ex2 {
	//입력쪽에서 입력된 데이터가 물의흐름처럼 출력쪽에 전달되는데
	// 'A'\n'   2바이트가 전달된 상황이다.
	// 근데 반복문 에서는 1바이트씩 해석하고있다.
	// 1바이트씩 읽고읽기때문에 엔터까지 읽은것
	public static void main(String[] args) {
		int i=0;
		System.out.println("타이핑을 쳐주세요. 대문자Q를 누르면 끝납니다.");
		//엔터키는 \r\n으로 저장된다. 10, 13
		try {
//			while( (i=System.in.read()) != '\n') {//0부터255까지의 숫자 반환. 엔터키 \n은 13
//				System.out.println(i); 
//			}
			while( true) { 	// 4바이트가 들어왔다 치자. abc\n
				i=System.in.read();	//문자하나를 읽어 int로 반환
				if((char)i=='Q') {
					System.out.println("프로그램 종료하겠습니다.");
					return;
				}
				if(	i != '\n' && i != '\r')
					System.out.println(i); 

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	

		System.out.println("반복문 끝");

	}
}
