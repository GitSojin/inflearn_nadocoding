package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set
        // 중복을 허용하지 않는다.
        // 순서 지정 X
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");
        System.out.println("총 구매 상품 수 : " + set.size());
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        if(set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("-----------------");

        // 삭제
        set.remove("삼겹살");
        System.out.println(set.contains("삼겹살"));

        System.out.println("-----------------");

        // 전체 삭제
        set.clear();
        if(set.isEmpty()){
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("-----------------");

        // 세트 : 중복 허용 X, 순서 보장 X
        HashSet<Integer> intSet = new HashSet<>();
//        HashSet<Integer> intSet = new LinkedHashSet<>();    // 순서 보장 원할 경우
        intSet.add(1);
        intSet.add(3);
        intSet.add(2);
        intSet.add(1);

        for (int i : intSet) {
            System.out.println(i);
        }
    }
}
