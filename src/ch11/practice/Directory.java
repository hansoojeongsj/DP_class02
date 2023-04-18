package ch11.practice;

import java.util.ArrayList;
import java.util.List;

// composite(그릇)에 해당되는 클래스
public class Directory extends Entry {
    private String name;

    // 자기 내용물들을 관리하는 리스트
    private List<Entry> directory = new ArrayList<>(); // Entry는 부모 타입임, ArrayList<Entry> 생략가능

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    // 자기 내용물들의 size를 다 합치는 일을 함
    public int getSize() {
        int size = 0; // size 초기화

        // 확장된 for 문 (집합체:원소), 사이즈 얻고 더해줌. 현재 디렉터리에 있는 자식들 사이즈 다 더해짐. 
        for (Entry entry: directory) {
            size += entry.getSize(); // 재귀적 호출
        }
        return size;
    }

    @Override
    // 자기 내용물들의 printList를 호출함
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 자기것 출력

        for (Entry entry: directory) { // 자식들 출력 // Entry 자식들 다 출력가능 꺼낼때, 담을 떄 모두 entry임
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
