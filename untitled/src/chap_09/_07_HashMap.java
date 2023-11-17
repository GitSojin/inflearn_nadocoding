package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> map = new LinkedHashMap<>();
        // 순서 보장하고자 하는 경우는 위와 같이 코드 작성해주기

        // 데이터 추가
        map.put("김소진",10);
        map.put("김럭키",5);
        map.put("장나무",3);
        map.put("823915",15);

        System.out.println("총 고개 수 : " + map.size());
        System.out.println("-----------------");

        // 조회
        System.out.println("김소진님의 포인트 : " + map.get("김소진"));
        System.out.println("김럭키님의 포인트 : " + map.get("김럭키"));
        System.out.println("-----------------");

        // 확인
        if(map.containsKey("823915")){
            int point = map.get("823915");
            map.put("823915", ++point);
            System.out.println("823915님의 누적 포인트 : " + map.get("823915"));
        }else{
            map.put("823915",1);
            System.out.println("823915님 신규 등록 ( 포인트 1 )");
        }
        System.out.println("-----------------");

        // 삭제
        map.remove("823915");
        System.out.println(map.get("823915"));
        System.out.println("-----------------");

        // 전체 삭제
        map.clear();
        System.out.println(map);

        System.out.println("-----------------");

        map.put("김소진",10);
        map.put("김럭키",5);
        map.put("장나무",3);
        map.put("823915",15);

        // Key 확인
        for (String key : map.keySet()){
            System.out.println(key);
        }
        // key 값 중복 X, 순서 보장 X
        System.out.println("-----------------");
        for(int value : map.values()){
            System.out.println(value);
        }

        // key, value 함께 확인
        for (String key : map.keySet()){
            System.out.println("고객 이름 : " + key + "\t\t포인트 : " + map.get(key));
        }
        System.out.println("-----------------");


    }
}
