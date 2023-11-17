package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 배열의 index 값은 0부터 시작

/*
        배열 선언 첫 번째 방법
        String[] coffees = new String[4];   // String 자료형을 갖는 크기 4의 배열

        배열 선언 두 번째 방법
        String coffees[] = new String[4];
 */

/*
        String[] coffees = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";
*/

        String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i=0; i<4; i++){
            System.out.println(coffees[i] + " 하나 주세요");
        }
    }
}
