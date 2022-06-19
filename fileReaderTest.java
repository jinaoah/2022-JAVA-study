//FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램 작성
import java.io.*; 

public class fileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("c:\\windows\\system.ini"); //FileReader: 파일 입력 클래스
            int c;
            while((c=fin.read())!= -1){
                System.out.print((char)(c)); //문자로 출력해야하므로 형 변환
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("에러남");
        }
    }
}