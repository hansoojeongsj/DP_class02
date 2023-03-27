package hw.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close(); //선언만 함. 하위 클래스가 채워줄 것

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display(int times) { //구상 메소드(추상의 반대), 큰 틀을 제공, 템플릿 메소드
        open();
        for (int i = 0; i < times; i++) { //하드 코딩 (과제:숫자 5를 인자로 받을 수 있게 수정하라)
            print();
        }
        close();
    }//메소드가 구현은 되어 있는데, 사용하는 다른 메소드들은 선언만
}
