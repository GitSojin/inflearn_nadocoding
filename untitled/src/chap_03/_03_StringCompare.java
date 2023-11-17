package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); //대소문자를 비교하기 때문에 false 출력
        System.out.println(s2.equalsIgnoreCase("python"));  //대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        //문자열 비교 심화
        s1 = "1234";    //벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234");    //서로 다른 곳을 참조하게 되므로 == 비교 시 false
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);   //false

        //equals는 참조하는 곳의 내용을 비교한다.
        //==는 둘의 참조가 같은지를 비교한다.

        // 꼭 기억하자!! 내용을 비교하고 싶다면, equals를 사용하자!!
    }
}
