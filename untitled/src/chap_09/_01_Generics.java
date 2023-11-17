package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        // 다양한 타입의 객체를 지원하는 클래스나 인터페이스, 메소드를 정의하는 방법
        // 똑같은 동작을 하는 클래스나 메소드를 여러 번 정의할 필요 없이 한 번 정의한 후
        // 제네릭스를 활용해주면 된다.

        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};


        // 제네릭스 사용 X 메서드
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------------");

        // 제네릭스 사용 메서드
/*
        printAnyArray(iArray);
        printAnyArray(dArray);
        // 제네릭스에서 제공하는 것은 객체이므로
        // 기본 자료형인 int, double 은 제네릭스 타입으로 바로 사용 불가
        // -> 감싸주는 wrapper 클래스를 이용해야 한다.
*/


        printAnyArray(sArray);

        Integer[] IArray = {1, 2, 3, 4, 5};
        Double[] DArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        printAnyArray(IArray);
        printAnyArray(DArray);

    }

    // 제네릭스 사용 메서드
    // T : Type
    // 아래 T 부분에서 쌍만 맞춰준다면 T 가 아닌 원하는 값을 넣어줘도 되지만, 일반적으로 T를 사용한다.
    // K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        // 어떤 타입이 들어와도 다 처리할 수 있어야 한다.
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    // < > : 다이아몬드 기호, 하나의 메서드를 가지고 같은 동작을 수행하는 서로 다른 메서드를
    // 중복적으로 코드 작성할 필요 없이 한번에 처리 할 수 있다.


    // 제네릭스 사용 X 메서드

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

