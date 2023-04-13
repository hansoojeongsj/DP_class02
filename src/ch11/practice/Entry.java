package ch11.practice;

public abstract class Entry { // 추상클래스
    // 이름을 얻는다
    public abstract String getName(); // 추상 메소드

    // 크기를 얻는다 
    public abstract int getSize();

    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 // 비슷한거 반복..? : 메소드 오버로딩
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
