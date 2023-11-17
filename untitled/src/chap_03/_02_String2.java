package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환

        // and를 ,로 변환해보기
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        // 시작 위치부터 끝 위치 <직전>까지

        //공백 제거
        s = "              I love Java.           ";
        System.out.println(s);
        System.out.println(s.trim());   //앞뒤로 불필요한 공백 삭제해준다.

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));  //concat을 통해 문자열 이어서 작성할 수 있다.
    }
}
