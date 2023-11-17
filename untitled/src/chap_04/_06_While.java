package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // for 문의 경우 횟수가 정해져 있을 때 사용
        // 그렇지 않은 경우 while문 사용

        int distance = 25;
        int move = 0;
//        while(조건){ }
        while(move<distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            System.out.println("-------");
            move += 3;
        }
        System.out.println("도착하였습니디.");
    }
}
