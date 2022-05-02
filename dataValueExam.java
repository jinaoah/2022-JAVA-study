//java.lang.Wrapper클래스 복습
//StringTokenizer클래스의 nextToken()로 문자열 파싱
import java.util.StringTokenizer;
public class dataValueExam {
    public static void main(String[] args) {
        String tmpStr = "hong 용산구 10.5 20.5";
        StringTokenizer parse = new StringTokenizer(tmpStr);

        String name, address;   //파싱한 문자열을 대입할 변수 선언
        double score1, score2;

        name = parse.nextToken();
        address = parse.nextToken();
        //parse객체 : String형이므로 기본 데이터 타입인 double로 형변환
        score1 = Double.parseDouble(parse.nextToken());
        //연습하기! String형 => Wrapper형 => 기본데이터형
        score2 = Double.valueOf(parse.nextToken()).doubleValue();   //Wrapper형.valueOf(String str)

        System.out.println(name+"\t"+address+"\t"+score1+"\t"+score2);
    }
}
