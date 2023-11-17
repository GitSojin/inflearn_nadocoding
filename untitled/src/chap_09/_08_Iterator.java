package chap_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        // 컬렉션 프레임워크에서 배운 리스트나 세트와 같은 데이터를 순회
        // 데이터 확인하다 필요 없을 경우 바로 삭제도 가능

        List<String> list = new ArrayList<>();
        list.add("김소진");
        list.add("(알 수 없음)");
        list.add("김럭키");
        list.add("(알 수 없음)");
        list.add("장나무");
        list.add("(알 수 없음)");
        list.add("삐약이");
        list.add("(알 수 없음)");
        list.add("야옹이");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-----------------");

        it = list.iterator();   // 커서를 처음 위치로 이동
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------");

        it = list.iterator();   // 커서를 처음 위치로 이동
        while (it.hasNext()){
            String s = it.next();
            if (s.contains("알 수 없음")){
                it.remove();        //데이터 삭제
            }else{
                System.out.println(s);
            }
        }

        System.out.println("-----------------");

        it = list.iterator();   // 커서를 처음 위치로 이동

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------");

        HashSet<String> set = new HashSet<>();
        set.add("김소진");
        set.add("김럭키");
        Iterator<String> itSet = set.iterator();
        while(itSet.hasNext()){
            System.out.println(itSet.next());
        }

        System.out.println("-----------------");


    }
}
