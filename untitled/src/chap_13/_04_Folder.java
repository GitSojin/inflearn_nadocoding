package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";   // A 폴더 밑에 B 폴더 밑에 C 폴더 만들기
        // 위에 안만들어지만 아래와 같이 만들기
        // folderName = "A" + File.separator + "B" + File.separator + "C";
        folder = new File(folderName);
        // folder.mkdir     폴더 생성 실패
        folder.mkdirs();
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }else {
            System.out.println("폴더 생성 실패 (mkdir)");
            // 폴더 만들기 위해서는 상위 폴더 하나 있으면 그 아래 하나 만들 수 있다.
            // 즉 지금 B 폴더가 없고 A 만 있는데 A 밑에 B 밑에 C 만들려고 하니까 실패한 것이다.
            // mkdirs 하면 하위폴더 -> 하위폴더 해서 여러개 한번에 만들 수 있다.
        }
    }
}
