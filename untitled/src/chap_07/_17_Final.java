package chap_07;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        // 선언과 동시에 초기화하고, 값을 바꿀 수 없게 된다.

        // Enum
        // 열거형
        // 상수들의 묶음

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
        // switch - case 문과 잘 사용된다.
        switch (resolution){
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.ordinal());
            //ordinal : 열거형 상수가 정의된 순서
        }

        System.out.println();
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}
