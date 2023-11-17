package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그외 : 장학금 대상 아님

        //If-else문
        int ranking = 1;
        if(ranking==1){
            System.out.println("전장");
        }else if(ranking==2){
            System.out.println("반장");
        }else if(ranking==3){
            System.out.println("반장");
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완#1");

        //Switch Case문
        ranking=2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
//                break;
//                만약 break 없고 만족하는 case 지날 경우, 다음 case 문도 쭉 실행된다.
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조화 완료#2");
    }
}
