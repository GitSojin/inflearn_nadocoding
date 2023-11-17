package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber;
    static int counter = 0;

    static boolean canAutoReport = false;
    // static 을 붙이게 되면 클래스 변수라고 한다.
    // 클래스로부터 만들어지는 모든 객체에 똑같이 적용된다.

/*
    BlackBox(){
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }
*/
/*
    BlackBox(String modelName, String resolution, int price, String color){
        this();     // 기본 생성자 동작 먼저 수행 후 아래 동작 수행

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;

    }
*/

    //클래스 내에서 메서드를 만들 수도 있다.
    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // 영상 저장
    // 1. 일반 영상
    // 2. 이벤트 영상
    int getVideoFileCount(int type){
        if(type==1){
            return 9;
        }else if(type==2){
            return 1;
        }else {
            return 10;
        }

    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record(){
        record(true,true,5);
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;    // this 가 붙으면 클래스 내의 인스턴스 변수
    }
    // static 없이 메서드 정의하면 객체마다 가지는 인스턴스 값이 달라서 다르게 동작할 수 있다.
    // static 붙으면 매번 같은 동작을 수행하게 된다.

    // Getter : 값을 가져오는 메서드
    // Setter : 값을 설정하는 메서드
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if(price<100000){
            this.price = 100000;
        }else{
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
