package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // 예외 처리를 할 때, catch 문 내에서 처리를 한다고 해서 완전히 끝나는 것이 아닐 수도 있다.
        // 실생활을 예로 들면, 택시를 타려고 문을 열었는데 휴무 택시였던 것이다.
        // 휴무 택시이건 아니건 간에 내가 연 택시의 문을 다시 닫는 동작은 필수로 동작해야만 한다.
        // 위와 같이 문제 발생 유무와 상관 없이 무조건 실행해야 하는 문장을 finally 에서 실행한다.
        try{
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        }catch (Exception e){
            System.out.println("1) 문제 발생 : " + e.getMessage());
        }finally {
            System.out.println("택시의 문을 닫는다.");
        }

        // try-catch 문 구성 종류
        // try + catch(s)
        // try + catch(s) + finally
        // try + finally
        System.out.println("--------------");


    }
}
