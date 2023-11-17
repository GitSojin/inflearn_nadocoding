package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        // 때로는 프로그램에 의해서가 아닌 코더가 원해서 에러를 발생시킬 수도 있다.

        int age = 17;
        try{
            if(age<19){
                // System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                // 일부로 에러를 발생시키는 것이 throw
                // 새로운 Exception 객체를 만들어준다.
                // 이 문장을 가지는 새로운 예외를 발생시킨다.
                // 여기서 던지면 catch 에서 받아서 에러를 발생시키게 된다.
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");
            }else{
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
