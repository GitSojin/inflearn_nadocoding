package chap_08;

import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상클래스가 미완성된 클래스였다고 하면,
        // 인터페이스는 뼈대만 제공하는 구조이다.
        // extends 상속은 부모를 하나만 가지는 단일 상속만 가능했다.
        // 하지만 여러곳에 나누어져 있는 기능들을 모두 사용해야 할 때, Interface 를 사용 가능하다.


        NormalReporter normalReporter = new NormalReporter();
//        Reportable normalReporter = new NormalReporter(); 와 같이 작성 가능하다.
//        Reportable 인터페이스를 구현함으로써 이 인터페이스를 구현하는 모든 클래스들은
//        이 인터페이스 자체를 통해서 참조 가능하며, 이 인터페이스 내에 있는 똑같은 report 메서드는 항상 구현되고 있음이 보장된다.

        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();


        System.out.println("----------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();
    }
}
