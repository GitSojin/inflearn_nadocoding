package chap_08.camera;


// 부모클래스에서는 추상적으로 제목만 있었는데 자식 클래스에서 구현을 해줌으로써
// FactoryCam 은 객체를 만들 수 있게 되었다.

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    // 1. 인터페이스 변수 만들기
    // 2. setter 을 통해 값 넣어주기
    public Detectable detector;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public Reportable reporter;

    @Override
    public void showMainFeature(){
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
