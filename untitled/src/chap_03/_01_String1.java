package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());    //대문자 변환
        System.out.println(s.toLowerCase());    //소문자로 변환

        //포함 관계
        System.out.println(s.contains("Java"));     //포함된다면 true, 미포함시 false
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));  //첫번째 위치가 0부터 시작
        System.out.println(s.indexOf("C#"));    //포함되지 않는다면 -1 반환
        System.out.println(s.indexOf("and"));   //같은 문자가 있을 경우 처음 위치 정보
        System.out.println(s.lastIndexOf("and"));   //마지막 위치 정보
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하면 true(아니면 false)
        System.out.println(s.endsWith("."));    //이 문자열로 끝나면 true(아니면 false)
    }
}
