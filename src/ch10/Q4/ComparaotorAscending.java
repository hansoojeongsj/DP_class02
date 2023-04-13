package ch10.Q4;

import java.util.Comparator;
// 오름차순
public class ComparaotorAscending implements Comparator{

    @Override
    public int compare(Object a, Object b) {
        // 원칙: 정렬 주체(List)는 음수가 리턴되면 그대로 두고, 양수가 리턴되면 위치를 서로 바꾼다.
        return ((String)a).compareTo((String)b);  // String 클래스의 compareTo()를 이용해서 크기 비교를 함
        // (a - b)를 실행 / String에 괄호해줘야 -> .의 우선순위가 가장 높기 때문
        // a가 작을 때는 음수가 리턴됨, a가 클 때는 양수가 리턴됨
        // a가 더 클 때 위치를 서로 바꾼다. => 큰 걸 뒤로 보낸다. => 오름차순
    }
    
}
