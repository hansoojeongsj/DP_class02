package hw.ch10;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("최승훈", "20230418",175));
    list.add(new Student("한수정", "20210833",165));
    list.add(new Student("박소이", "20210824",185));
    list.add(new Student("심현수", "20220824",180));
    list.add(new Student("권효윤", "20190726",175));

    // 사전순으로 작은 순서 (오름차순)
    System.out.println("학번: 20210833, 이름: 한수정");
    list.sort( new ComparaotorAscending() );
    System.out.println("** (1) 정렬 결과 (오름차순)");
    System.out.println(list);

    // 사전순으로 큰 순서 (내림차순)
    list.sort( new ComparatorDesending() );
    System.out.println("** (2) 정렬 결과 (내림차순)");
    System.out.println(list);
  }
}
