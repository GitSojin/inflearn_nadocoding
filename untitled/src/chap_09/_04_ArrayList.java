package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        // 많은 데이터를 쉽고 편리하게, 효과적으로 관리하기 위해서 자바에서 제공해주는 클래스 모음
        // 배열과는 달리 원하는 만큼 데이터를 추가 및 삭제 등이 가능하다.
        // 대표적으로 세 가지가 있다.
        // List, Set, Map
        // List -> ArrayList, LinkedList

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("김소진");
        list.add("김럭키");
        list.add("장나무");
        list.add("823915");
        list.add("진");

        // 데이터 조회
        // ArrayList 도 조회를 index 를 통해 한다.
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------");

        // 데이터 삭제 ( 823915 )
        list.remove("823915");
//        System.out.println(list.get(4));      삭제되면서 땡겨져서 index 4의 값은 비게 됨
        System.out.println(list.get(3));    // 진
        System.out.println(list.size());    // 4

        System.out.println("-----------------");

        list.remove(list.size()-1);
        System.out.println(list);

        System.out.println("-----------------");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("-----------------");

        // 변경
        list.set(0, "김소진님");
        System.out.println(list.get(0));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("김럭키"));

        System.out.println("-----------------");
        // 포함되어 있는가?
        if(list.contains("장나무")){
            System.out.println("수강 신청 성공");
        }else{
            System.out.println("수강 신청 실패");
        };

        System.out.println("-----------------");

        // 모든 데이터 삭제
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println("-----------------");

        // 새로 리스트 목록 작성
        list.add("김소진");
        list.add("김럭키");
        list.add("장나무");
        list.add("823915");
        list.add("진");


        // 정렬
        Collections.sort(list);
        for (String s:list) {
            System.out.print(s + " ");
        }
        System.out.println("-----------------");
    }
}
