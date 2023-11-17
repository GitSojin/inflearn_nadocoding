package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때
        // Buffer : 데이터를 한 곳에서 다른 곳으로 보낼 때 잠시 머무르는 곳

/*
        // 파일 쓰기
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            // 뒤에 true 넣어주면 빌드 할 때마다 문장 덮어쓰지 않고 내용 추가된다.

            // finally 구문에서 bw.close() 해줘야 하는데 이거 자동으로 해주는게
            // try() 에서 () 내부에 객체 선언 부분 넣어주는 것이다.
            // try 구문 끝날 때 자동으로 bw.close() 해준다.
            bw.write("1. 이제 거의 끝이 보여요.");
            bw.newLine();   // 줄바꿈
            bw.write("2. 여기까지 오신 여러분들 정말 대단해요.");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
