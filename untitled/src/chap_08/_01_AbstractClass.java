package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 ( Data Abstraction )
        // 몰라도 되는 디테일은 숨기고 꼭 필요한 정보만 공개하는 과정
        // abstract
        // 추상 클래스 ( 아직 완성되지 않은 클래스 )
        // 추상 메소드 ( 추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드 )

//        Camera camera = new Camera();
//        추상 클래스는 객체가 생성될 수 없다.
//        완성되지 않은 클래스이기 때문에 모호한 상태로 객체를 생성할 수 없다.

        // 추상 클래스를 상속한 자식 클래스인 FactoryCam에서는 객체를 만들 수 있다.
        FactoryCam factoryCam = new FactoryCam();
        // 카메라 클래스를 상속한 자식 클래스의 경우 다음과 같이 구현 또한 가능하다.
        // Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}

// 데이터 추상화를 위해서 추상클래스를 만들 수 있는데,
// 추상클래스는 아직 완성되지 않은 클래스이다.
// 추상클래스는 자식 클래스를 가질 수도 있고 가지지 않을 수도 있다.
// 추상클래스에 추상 메서드가 있을 경우 자식 클래스에서 구현을 해야만 사용 가능하다.