package chap_12.clean;

public class Room {
    public int number = 1;  // 방 번호
    // 청소 하는 메서드
    // 전달값으로 어떤 직원이 청소하는지 받기
    synchronized public void clean(String name){
        // synchronized 를 앞에 붙여줌으로써 동시에 같은 변수 접근 불가 (동기화)
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
