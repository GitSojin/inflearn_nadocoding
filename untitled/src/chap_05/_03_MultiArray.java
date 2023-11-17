package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 ( 2차원 배열 )

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        System.out.println(seats[1][1]);    // B2 접근

        // 2차원 배열
        // 첫 줄 3칸, 둘째 줄 4칸, 셋째 줄 5칸
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        System.out.println(seats2[0][2]);
    }
}
