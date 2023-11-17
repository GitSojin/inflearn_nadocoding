package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드 있으면 +1
        // 망고 주스 있으면 +1
        // 또는 아이스 아메리카토 +1

        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if(hallabongAde) {
            System.out.println("한라봉에이드+1");
        } else if (mangoJuice) {    // else if는 여러 번 사용 가능
            System.out.println("망고주스+1");
        } else {    // else문이 없을 때 어떤 조건도 만족하지 못한다면 어떤 것도 출력되지 않는다.
            System.out.println("아아+1");
        }
        System.out.println("커피 주문 완료#1");
    }
}
