package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
            System.out.println("-------");
        }
        System.out.println("도착했습니다.");
        System.out.println();

        System.out.println("~~~~~반복문#2~~~~~");
        //Do While 반복문
        height = 20;
        move = 0;
        do {
            System.out.println("발차기를 계속니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
