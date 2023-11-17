package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        // 부모 클래스의 무언가를 자식 클래스에서 사용하는 것

        SpeedCam speedCam = new SpeedCam();
        FactoryCam factoryCam = new FactoryCam();

        factoryCam.recordVideo();
        System.out.println("--------------");
        speedCam.takePicture();
    }
}
