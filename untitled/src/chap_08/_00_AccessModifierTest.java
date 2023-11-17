package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";        default 는 같은 패키지 내에서만 접근 가능
        // 다른 패키지는 public 말고는 안되는걸 볼 수 있음.
        // protected 의 경우 자식 클래스라면 다른 패키지이더라도 접근 가능하지만 아니므로.
    }
}
