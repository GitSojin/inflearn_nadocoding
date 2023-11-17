package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        // 04 강의 내용 + ..
        // finally 에서 열어뒀던 파일을 닫는 동작을 많이 하는데, 이를 실습해보자.
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // try-catch 문도 내부에 중첩될 수 있다.
            // 여기서 바로 writer1.close() 해주면
            // close 할 때 발생할 수 있는 예외에 대해 처리 안해줬다고 오류 발생한다.
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        // 근데 만약 매번 파일을 열고 닫고, close 를 신경쓰는 게 귀찮을 수도 있다.
        // 이를 자동으로 해주는 방법이 있다.
        System.out.println("--------------");

        try(MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("빵이 먹고싶어요.");
        }catch (Exception e){
            e.printStackTrace();
        }
        // 따로 close 안해줬는데도 정상적으로 close 메서드를 자동호출해준다.
        // try with resources
        // try 구문 내에서 사용할 리소스, 파일 객체 같은 것을 괄호 속에서 정의하게 되면
        // 자동으로 try-catch 구문 빠져나올 때
        // close 를 호출해준다.
        // 한 가지 조건이 있는데, AutoCloseable 인터페이스를 구현해야만 한다!!
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}