package chap_07;

public class _18_enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL

        ResolutionEnum resolution = ResolutionEnum.HD;
        System.out.println(resolution);

        resolution = ResolutionEnum.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
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

        resolution = ResolutionEnum.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("----------------");

        for (ResolutionEnum myRes : ResolutionEnum.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
            System.out.println(myRes + " : " + myRes.ordinal());
        }

        System.out.println("----------------");

        for (ResolutionEnum myRes : ResolutionEnum.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum ResolutionEnum{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    ResolutionEnum(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}