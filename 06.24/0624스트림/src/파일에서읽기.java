
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//이클립스에서는 기본적으로 파일을 참조하는위치가 해당프로젝트 바로 밑이다.
//현재폴더에는 그 파일이 없고 src폴더밑으로 지정해줘야 접근가능
//이것을 우리가 txt파일을 화면에서 읽듯이 똑같이 보이도록 수정
	//1바이트씩 읽지말고 한줄씩 읽으면 된다.
	//한줄씩 읽기위해서 버퍼를 통해 readLine 함수 사용
public class 파일에서읽기 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/reader.txt");
			BufferedReader bf = new BufferedReader(fr);
			
			//1. 문자 하나씩 읽기
//			int i;
//			while(  (i=fr.read()) != -1) {	//끝까지 계속 읽기
//				System.out.println((char)i);//문자로 변환해서 출력
//			}
			
			//2. 한줄씩 읽기
			String thisLine = "";
			while( (thisLine=bf.readLine()) !=null   ) {
				System.out.println(thisLine);
			}
			
			//3. 닫아주기
			bf.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
