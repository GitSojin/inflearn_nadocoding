package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // enhanced for (for-each) 반복문
        // foreach 작성 후 엔터 치면 더 쉽게 작성 가능
        for(String coffee : coffees){
            // coffees라는 배열을 처음부터 끝까지 순회하는데, 그때그때 coffee라는 이름으로 받아오겠다.
            System.out.print(coffee + " 하나, ");
        }
        System.out.println("주세요");
    }
}
