package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
            System.out.println(3/8);


            int[] arr = new int[3];
            arr[5] = 100;

            Object obj = "test";
            System.out.println((int)obj);

        }
        // 위 try 코드의 첫 번째 에러만 따로 처리해주고 싶을 경우,
        // catch 앞에다가 또다른 catch 를 적어준다.
        // catch 뒤 괄호에는 출력문의 java.lang."~~~" <- "~~~"이부분에 있는거 복붙해주기
        // 실행해보면 위 catch 문이 실행되고 아래 Exception e 로는 안넘어간다.

        catch (ArithmeticException e){
            // 만약 한 번에 여러 예외를 처리하고 싶을 경우 catch (Arith~~ | Array~~ e){~~}
            System.out.println("잘못 계산하셨습니다.");
        }

        // 두 번째 예외 따로 처리해주기
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스를 잘못 설정하셨습니다.");
        }

        // 세 번째 예외 따로 처리해주기
        catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다.");
        }

        catch (Exception e){
            // Exception 은 다른 모든 예외 클래스의 조상 클래스
            // 어떤 문제가 발생했을 때, 해결하는 방법은 한가지가 아니다.
            // 예외 또한 발생하는 종류에 따라 해결 방법이 다르다.

            System.out.println("그 외의 모든 에러는 여기서 처리됩니다. -> " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
