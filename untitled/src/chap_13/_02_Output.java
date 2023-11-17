package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("--------- 정수 ---------");
        // 정수에 대해 상세하게 형식화된 출력 방법 학습하기
        // System.out.printf("포맷", 값1, 값2, 값3);
        // 기본적으로 오른쪽 정렬

        System.out.printf("%d%n",1);
        System.out.printf("%d %d %d%n",1,2,3);
        System.out.printf("%d%n",1234);
        System.out.printf("%6d%n",1234);  // 6자리 공간을 확보하고 나서 1234 출력  __1234
        System.out.printf("%06d%n",1234);   // 6자리 공간 확보 후 1234 출력, 빈 공간은 0 출력  001234
        System.out.printf("%6d%n",-1234);   //_-1234
        System.out.printf("%06d%n",-1234);   //0-1234
        System.out.printf("%+6d%n",1234);   //_+1234
        System.out.printf("%,15d%n",1000000000);    //1,000,000,000     세자리마다 콤마 구분
        // 위 숫자에 6자리만 할당하게 되면, 할당한 자릿수는 무시되고 값이 충분한 공간에 출력된다.
        // 할당한 자릿수는 숫자를 출력할 때 최소한의 자릿수를 확보하기 위해 사용된다.
        // 즉, 초과하게 되면 무시한다.
        System.out.printf("%-6d%n",1234);   //1234__    왼쪽정렬

        System.out.println("--------- 실수 ---------");
        System.out.printf("%f%n",Math.PI);
        System.out.printf("%.2f%n",Math.PI);
        System.out.printf("%6.2f%n",Math.PI);   // __3.14
        System.out.printf("%-6.2f%n",Math.PI);  // 3.14__
        System.out.printf("%06.2f%n",Math.PI);  // 003.14
        System.out.printf("%+6.2f%n",Math.PI);  //_+3.14

        System.out.println("--------- 문자열 ---------");
        System.out.printf("%s%n","Java");   // Java ( 일반 출력 )
        System.out.printf("%6s%n","Java");  // __Java ( 6자리 공간 확보, 우측 정렬 )
        System.out.printf("%-6s%n","Java"); // Java__
        System.out.printf("%6.2s%n","Java"); // ____Ja ( 6자리 공간 확보, 우측 정렬, 2글자 출력 )
        System.out.printf("%-6.2s%n","Java");   // Ja____

        System.out.println("--------- 응용 ---------");
        // 여러 문자열을 한꺼번에 출력하기
        System.out.println("이름 영어 수학 평균");
        System.out.println("김럭키 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("김소진 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("장나무 " + 95 + " " + 100 + " " + 97.5);
        // 보기 힘들다. 삐뚤빼뚤 -> 포맷 맞춰줘서 보기 편하게 해보자

        System.out.println("--------- 응용2 ---------");
        System.out.println("이름      영어   수학   평균"); // 공백 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n","김럭키",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","김소진",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","장나무",95,100,97.5);
        // 한글, 영어, 숫자가 필요로 하는 자릿수의 크기가 다르다.
    }
}
