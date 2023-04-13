package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서 (오름차순)
        // list: 전략을 이용하는 컨텍스트
        // Comparator: 전략 객체
        list.sort( new ComparaotorAscending() /* 미구현 */ );
        System.out.println(list);

        // 사전순으로 큰 순서 (내림차순)
        list.sort( new ComparatorDesending()/* 미구현 */ );
        System.out.println(list);
    }
}
