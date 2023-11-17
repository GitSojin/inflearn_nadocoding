package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류
        // 컴파일 오류 - 코드에 문제가 있어 실행(빌드)조차 되지 않는다.
        // 런타임 오류 - 컴파일은 되지만 실행하는 과정에서 문제가 발생한다.

        // 런타임 오류 - 에러(error) / 예외(exception)
        // 에러는 작성하는 소스코드 통해 수습 불가 ( 메모리 꽉 차거나.. ) - 발생하기 전에 코드 잘 짜기
        // 예외는 소스코드 수정으로 수습 가능

        // try-catch 문
        // try { 시도하려는 소스 코드 } catch(){ 문제 발생할 경우 실행할 소스 코드 }
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();    // 코드 실행 시 빨갛게 출력되는 부분
            // 어디에서 에러 발생했는지 알려줌
        }
        // 에러가 발생했음에도 아래 코드가 작동한다.
        System.out.println("프로그램 정상 종료");
        System.out.println("-----------");


        try {
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-----------");


        // 형 변환 실패
        try{
            Object obj = "test";
            System.out.println((int)obj);
        }catch (Exception e){
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }
    }
}
