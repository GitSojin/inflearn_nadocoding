package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김소진";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "김럭키";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");


        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요 ? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);  //보다 정밀한 소숫점을 표현하고 싶다면 double을 사용할 것
        System.out.println(f);

        //int i = 1000000000000;  int형이 가질 수 있는 범위 값을 벗어나면 표현 X
        long l = 10000000000l;
        l = 1_000_000_000l;
        System.out.println(l);

        //정수 : int, long
        //실수 : float, double
    }
}
