package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.callServiceCenter();
        BlackBox.callServiceCenter();
    }
}
