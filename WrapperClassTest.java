//java.lang 패키지에 있는 Wrapper 클래스 복습
//String형의 데이터 10과 20을 정수와 실수형으로 변환하여 덧셈을 하는 프로그램 작성 
public class WrapperClassTest {
    public static void main(String[] args) {
        String data1 = "10";
        String data2 = "20";
        System.out.println("data1 + data2 = "+data1+data2); //1020

        //parseInt(), parseDouble() : String형 데이터를 기본 데이터형으로 반환
        System.out.println(">>>>> parseInt()와 parseDouble() 사용");
        System.out.print("data1 + data2 = ");
        System.out.println((Integer.parseInt(data1)+Integer.parseInt(data2)));    //30
        System.out.print("data1 + data2 = ");
        System.out.println((Double.parseDouble(data1)+Double.parseDouble(data2))); //30.0

        //intValue(), doubleValue() : Wrapper형 데이터 -> 기본 데이터형 
        //intValue를 사용하려면? => data1을 String형에서 Wrapper형으로 
        int num1 = Integer.valueOf(data1);
        int num2 = Integer.valueOf(data2);
        
        System.out.println(">>>>> intValue()와 doubleValue() 사용");
        System.out.println("data + data2 = "+(num1+num2));    //괄호 사용
        
    }
}
