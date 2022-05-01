//java.lang 패키지에 있는 Wrapper 클래스 복습
//String형의 데이터 10과 20을 정수와 실수형으로 변환하여 덧셈을 하는 프로그램 작성 
public class WrapperClassTest {
    public static void main(String[] args) {
        String data1 = "10";
        String data2 = "20";

        //parseInt(), parseDouble() : String형 데이터를 기본 데이터형으로 반환
        System.out.println(">>>>> parseInt()와 parseDouble() 사용");
        System.out.print("data1 + data2 = ");
        System.out.println((Integer.parseInt(data1)+Integer.parseInt(data2)));    //30
        System.out.print("data1 + data2 = ");
        System.out.println((Double.parseDouble(data1)+Double.parseDouble(data2))); //30.0
    }
}
