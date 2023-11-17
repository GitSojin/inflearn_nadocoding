package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        System.out.println("출력");
        // 사용자 입력
        // Scanner
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("혈액형을 입력하세요.");
        String bloodType = sc.next();
        System.out.println("키를 입력하세요.");
        // int height = Integer.parseInt(sc.next());
        // sc.next() 메서드는 항상 String 으로 반환 받기 때문에 int 값으로 바꿔주어야 한다.
        int height = sc.nextInt();
        System.out.println("몸무게를 입력하세요");
        //double weight = Double.parseDouble(sc.next());
        double weight = sc.nextDouble();

        System.out.println("입력하신 정보는 다음과 같습니다.");
        System.out.println("이름 : " + name);
        System.out.println("혈액형 : " + bloodType);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
         */

        /*
        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next();
        System.out.println("언어 : " + lang);

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next();
        System.out.println("기분 : " + feeling);
        // sc.next 는 띄어쓰기를 기준으로 값을 각각 받는다.
        // 자바를 배웠어요 라고 입력할 경우 언어 : 자바를 / 기분 : 배웠어요 가 출력된다.
        // 만약 띄어쓰기가 아닌 한 줄 전체를 값으로 받고자 할 경우 sc.nextLine() 으로 값을 받아야 한다.
         */

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.nextLine();
        System.out.println("언어 : " + lang);

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);

        // 혹은 sc.next() 함수를 사용하고자 한다면 입력을 받는 값들 사이에
        // sc.nextLine() 코드를 입력해주면 불필요한 값들을 삭제 처리해주기도 한다.

        System.out.println("이름이 뭐에요?");
        String name = sc.next();

        sc.nextLine();

        System.out.println("몇살이에요?");
        int age = sc.nextInt();
        System.out.println("이름 : " + name + ", 나이 : " + age);

    }
}
