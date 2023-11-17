package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자( Escape Sequence, Escape Character, Special Character )

        System.out.println("자바가\n너무\n재밌어요");
        // \n은 줄바꿈

        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t\t8000원");

        //만약 역슬래시를 그대로 적고싶다면 역슬래시를 두 번 작성해주기
        System.out.println("C:\\Program Files\\Java");

        //""는 어떻게 넣을까? -> " 앞에 \를 하나 넣어줄 것
        System.out.println("단비가\"냐옹\"하고 울었어요");
        //작은따옴표의 경우 역슬래시 안 넣어도 된다.
    }
}
