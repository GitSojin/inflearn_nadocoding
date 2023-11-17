package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        // or 연산은 ||이다.
        // 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);
        // and 연산은 &&이다.
        // 모두 true일 경우에만 true

        // 연속적으로 1 < 2 < 3 과 같은 방식으로는 작성할 수 없다.
        // ( 1 < 2 ) && ( 2 < 3 ) 과 같이 작성 가능
        System.out.println(!true);  //false
    }
}
