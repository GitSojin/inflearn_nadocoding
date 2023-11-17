package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {

        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생
        // 학생은 사람이다. ( Student is a person. )

        // class Teacher extends Person : 선생님
        // 선생님은 사람이다. ( Teacher is a person. )

//        FactoryCam factoryCam = new FactoryCam();
//        Camera factoryCam = new FactoryCam();
//        다형성을 이용하면 부모 클래스로 자식 클래스를 정의할 수 있다.

        // 객체도 배열로 관리할 수 있다.
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }
        // 카메라로 배열을 만들었고, 서로 다른 형태의 객체를 집어넣어 코드 효율성 높일 수 있음

        System.out.println("---------------");

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        // 그럼 부모 클래스로 만들었기 때문에 자식 클래스의 메서드는 호출할 수 없게 되는데,
        // 자바에는 객체가 어떤 클래스의 인스턴스인지 확인하는 instanceof가 있다.
        if (camera instanceof Camera){
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam){
            ((SpeedCam)speedCam).recognizedLicensePlate();
        }
    }
}
