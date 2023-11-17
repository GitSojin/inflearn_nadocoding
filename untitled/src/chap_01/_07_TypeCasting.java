package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
//        int score = 93 + 93.8;  정수형에 실수형 넣으려고 하니까 오류 발생

//        int to float, double
        int score = 93;
        System.out.println(score);  //93
        System.out.println((float)score);   //93.0
        System.out.println((double)score);  //93.0

//        float, double to int
        float score_f = 93.3F;
        double score_d = 93.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //정수 + 실수 연산
        score = 93 + (int)98.8;
        System.out.println(score);

        score_d = 93 + 98.8;        //자동으로 실수형 변환 됨
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;    //191 -> 191.0
        // int -> long -> float -> double (작은 범위 -> 큰 범위일 때)자동 형 변환 이루어진다.
        System.out.println(score);

//      int convertedScoreInt = score_d;      큰 범위 -> 작은 범위일 경우 자동 형 변환 안 이루어진다.
        int convertedScoreInt = (int)score_d;   //직접 형 변환 해주어야 한다.
        System.out.println(convertedScoreInt);

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        Double d1 = Double.valueOf("12.2");
        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        float f1 = Float.parseFloat("93.3");
        System.out.println(f1);
        double d = Double.parseDouble("98.8");
        System.out.println(d);


    }
}
