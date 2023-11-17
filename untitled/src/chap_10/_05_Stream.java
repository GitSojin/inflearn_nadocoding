package chap_10;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림
        // 데이터가 흐른다.
        // 많은 데이터에서 원하는 조건에 따라 필터링을 통해 데이터를 걸러낼 수 있다.
        // 베열이나 파일에서 만들 수도 있고, 컬렉션, 리스트에서 만들 수도 있다.

        // 스트림 생성

        // 정수형 배열에서 만들어보기
        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        // Arrays.stream(scores);
        // 위와 같이 작성하면 스트림이 만들어진 것이다
        // Alt + Enter 를 통해 import 해주기
        // Ctrl + Alt + V 를 통해 객체로 받아올 수 있다.
        IntStream scoreStream = Arrays.stream(scores);

        // 문자열 배열에서 만들어보기
        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);
        // 제네릭을 써서 만들어진다.

        // 리스트로 만들어보기
        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java");
        // Arrays 를 통해 편하게 리스트 생성 및 초기화 할 수 있다.
        langList = Arrays.asList("python", "java");

        Stream<String> langListStream = langList.stream();

        // Stream.of 를 통해 ( ~ ) 값들을 가지는 스트림을 만들 수 있다.
        Stream<String> langListOfStream = Stream.of("javascript", "c", "c++", "c#");


        // 스트림 사용
        // 중간 연산 ( Intermediate Operation ) : 여러 번 사용 가능하다.
        // filter, map, sorted, distinct, skip...
        // 최종 연산 ( Terminal Operation ) : 한 번만 사용할 수 있다.
        // count, min, max, sum, forEach, anyMatch, allMatch...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x>=90 ).forEach(x-> System.out.println(x));
        System.out.println("-----------");
        Arrays.stream(scores).filter(x -> x>=90 ).forEach(System.out::println);
        // 위와 같이 작성하면 자동으로 앞에 있는 데이터가 넘어가서 출려된다.
        System.out.println("-----------");

        // 90 점 이상인 사람의 수
        int count = (int)Arrays.stream(scores).filter(x -> x>=90).count();
        System.out.println(count);
        System.out.println("-----------");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x>=90).sum();
        System.out.println(sum);
        System.out.println("-----------");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x>=90).sorted().forEach(System.out::println);
        System.out.println("-----------");


        // 문자열로 처리해보기!
        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("-----------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x->x.contains("java")).forEach(System.out::println);
        System.out.println("-----------");

        // 네 글자 이하의 언어를 정렬해서 출력
        Arrays.stream(langs).filter(x->x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-----------");

        // 네 글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x->x.length()<=4).filter(x->x.contains("c")).forEach(System.out::println);
        System.out.println("-----------");

        // 네 글자 이하의 언어 중에서 c 라는 글자가 포함되는 언어가 하나라도 있는지 여부
        boolean anyMatch = Arrays.stream(langs).filter(x->x.length()<=4).anyMatch(x->x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-----------");

        // 4글자 이하의 언어 중 c 라는 글자 포함하는 언어 뒤에 어려워요 라는 글자 함께 출력
        // map
        Arrays.stream(langs).filter(x->x.length()<=4)
                .filter(x->x.contains("c"))
                .map(x->x+" 어려워요")
                .forEach(System.out::println);
        System.out.println("-----------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        Arrays.stream(langs).filter(x->x.contains("c"))
                .map(String::toUpperCase)       // 앞에서 넘어오는 데이터 대문자로 변환
                .forEach(System.out::println);
        System.out.println("-----------");

        // 가공된 데이터를 리스트로 저장하고 싶을 때
        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartWithC = Arrays.stream(langs).filter(x -> x.contains("c"))
                .map(String::toUpperCase)       // 앞에서 넘어오는 데이터 대문자로 변환
                .collect(Collectors.toList());

        langListStartWithC.stream().forEach(System.out::println);
        System.out.println("-----------");
        System.out.println(langListStartWithC);
        System.out.println("-----------");

    }
}
