package chap_11;

import chap_08.detector.FireDetector;

import java.io.FileWriter;
import java.io.IOException;

/*
public class _07_Throws {
    public static void main(String[] args) {
        writeFile();
    }

    // 파일에다가 어떤 내용을 쓰는 동작을 하는 메서드를 만들어보자.
    // 진짜 파일 관련한 클래스 사용 ( 지금은 몰라도 됨. )
    // 지금은 일단 FileWriter 를 이용해서 FileWriter 객체를 만드는 것까지 해보자.

    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter("test.txt");
            // 만약 에러가 발생하면
            throw new IOException("파일 쓰기에 실패했어요.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
        }
    }
}
*/

// writeFile 메소드 내에서 문제가 발생하면 이 메소드를 호출한 메인 메서드 내에서 처리하도록 해보자.

public class _07_Throws {
    public static void main(String[] args) {
        try{
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 처리할게요.");
        }
    }

    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요.");
    }
}
