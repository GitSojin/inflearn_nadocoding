package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자 ( 계산 )

        //일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);  //나눗셈의 몫 부분만 출력된다
        System.out.println(2 / 4);  //나눗셈의 결과는 정수이기 때문에 0.5에서 .5부분이 버려지고 0만 출력
        System.out.println(4 % 2);  // %는 나머지 연산이다.
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  //8 or 6 ?    6
        System.out.println((2+2) * 2);  //8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(val++);  //10    출력 이후에 +1

        System.out.println(val);    //11

        System.out.println(++val);  //12    +1 이후에 출력

        val = 10;
        System.out.println(val);
        System.out.println(--val);  //9
        System.out.println(val++);  //출력 이후에 +1이므로 출력값은 9

        //대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);
    }
}
