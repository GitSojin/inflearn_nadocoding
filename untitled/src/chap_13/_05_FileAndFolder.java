package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // 폴더 속에 여러 파일과 폴더 생성 가능
        // 파일과 폴더 구분
        String folder = ".";        // . 은 현재 위치 경로를 의미한다.
        // 절대 경로 : 폴더&파일 위에 마우스 우클릭 - copy Path - absolutely... 클릭
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file:filesAndFolders.listFiles()) {   // 모든 폴더와 파일 정보 가져올 수 있음
            if(file.isFile()){
                System.out.println("(파일)" + file.getName());
            }else if(file.isDirectory()){
                System.out.println("(폴더)" + file.getName());
            }
        }
    }
}
