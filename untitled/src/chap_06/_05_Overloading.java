package chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 이름이 같은 메소드를 여러 개 만드는 것
        // 이름이 같아도 매개변수 자료형이나 갯수가 다르면 이름이 같은 메서드 만들 수 있다.
        // 반환형이 다른 것으로는 메소드 오버로딩을 할 수 없다.
    }
}
