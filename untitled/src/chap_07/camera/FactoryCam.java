package chap_07.camera;

public class FactoryCam extends Camera{   // 자식 클래스
    // 상속받을 부모 클래스는 하나만 정의할 수 있다.

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }
    // Super 는 부모클래스의 recordVideo 를 수행한 후 아래 동작을 수행하도록,
    // 오버라이딩은 하지만 완전히 뒤바뀌는 것이 아닌 + ~~ 느낌으로 ..


    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 화재 감지");  //오버라이딩
    }

}
