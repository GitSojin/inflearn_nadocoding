package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 리스트는 중복 데이터를 허용한다.
        // LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("김소진");
        list.add("김럭키");
        list.add("장나무");
        list.add("823915");
        list.add("진");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-----------------");

        // ArrayList 의 경우 add 를 통해 데이터를 추가할 경우 맨 마지막 데이터 다음에 추가가 된다.
        // 리스트의 맨 처음에 데이터 추가
        list.addFirst("삐약이");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        list.addLast("야옹이");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        list.add(2,"꿀벌이");
        for (String s : list) {
            System.out.println(s);
        }


    }
}
