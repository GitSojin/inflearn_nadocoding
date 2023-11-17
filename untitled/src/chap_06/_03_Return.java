package chap_06;

public class _03_Return {
    // 호텔 전화번호
//    public static void 의 경우는 반환값이 없는 메서드
//    반환값이 있을 경우 void 자리에 반환하고자 하는 값의 자료형을 넣어주면 된다.
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 어딘가";
    }

    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }

    // 호텔 주소
    // 호텔 액티비티
    public static void main(String[] args) {
        //반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);
        System.out.println("호텔 주소 : " + getAddress());
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
