package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists()) {
            if (file.delete()) {  // boolean 값으로 받는다.
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A");
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
                // 만약 하위 폴더가 존재한다면 폴더 삭제 실패한다.
                // 하위 폴더부터 순차적으로 삭제해야 상위 폴더 또한 삭제가 가능해진다.
                // 하위 폴더 삭제하고 싶을 경우 폴더 경로 작성해주어야 한다.
            }else{
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }

        if(deleteFolder(folder)){
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        }else{
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        }
    }

    // 프로그래밍을 통해서 폴더 선택 시 모든 하위 폴더들 함께 삭제하는 코드 만들어보기
    // 별도의 메서드 만들기
    public static boolean deleteFolder(File folder){
        // 지금 받은 폴더가 directory 가 맞는지 확인해보기
        if(folder.isDirectory()){
            for(File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
