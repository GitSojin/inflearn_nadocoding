package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //대입 연산자
        int num = 10;
        num += 2;
        System.out.println(num);    //12
        System.out.println(num+=2); //14    num 자체의 값이 변경됨
        System.out.println(num);    //14
        System.out.println(num+2);  //16    출력값만 변경됨
        System.out.println(num);    //14
    }
}
