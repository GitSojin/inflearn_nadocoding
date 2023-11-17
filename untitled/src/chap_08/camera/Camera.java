package chap_08.camera;


//일반적으로 추상 클래스는 추상 메서드를 함께 정의한다.
public abstract class Camera {
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상 메서드는 선언만 해주고, 상속하는 자식 클래스에서 이 메서드를 구현해주어야 한다.
    public abstract void showMainFeature();
}
