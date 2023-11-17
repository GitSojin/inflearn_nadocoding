package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // 간결한 형태의 코드 뭉치
        // 메소드와 비슷하게 동작을 구현한다.
        // 익명메소드와 같이 별도의 이름이 없다.

        // 지금까지의 자바 문법과 다르다.
        // (전달값1, 전달값2, ...) -> { 코드정의 }
        // 접근제어자가 필요 없다 (public..)
        // 이름도 필요가 없다.
        // 람다식 내에서 return 하는 부분이 있으면 자동으로 return 타입을 정의하기 때문에 void 필요 X
        //
    }
    /*
    // 평소 자바 문법대로 만든 메서드
    public void print() {
        String s = "test";
        System.out.println(s);
    }
    // 람다식으로 작성
     () -> {
        String s = "test";
        System.out.println(s);
    }
    // 이대로는 작동 안된다. 지금은 형태만 보기.
     */

    /*
     public void print(String s) {
         System.out.println(s);
     }
     // 위 코드를 아래 람다식과 같이 간결화 할 수 있음
    s -> System.out.println(s)
     */

    /*
    public int add(int x, int y){
        return x + y;
    }

    (int x, int y) -> {return x+y}
    // return 이 포함되면 중괄호 생략 불가

    (x,y) -> x+y
     */
}
