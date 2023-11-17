package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17;
        try{
            if(age<19){
//                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            }else{
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (AgeLessThan19Exception e){
            System.out.println("조금 더 성장한 뒤에 오세요");
        }

        catch (Exception e){
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}

class AgeLessThan19Exception extends Exception{
    // Exception 만들어줄 때 상속 해주어야 한다.
    // 참고로 더 세부적인 다양한 Exception 이 있음
    // Alt + Insert 를 통해 Construct 생성자 만들어준다
    // ( 부모 클래스의 생성자가 몇 가지가 있는데, 여기서는 String 받아서 만드는거 해주기
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}