package ch02.practice1;

// 어댑터 (상속 이용함) 
// 어댑터는 항상 다른 인터페이스를 구현함? 제공함? Banner부모 상속
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string); // super는 부모 의미, 여기선 부모 생성자 의미
    }

    @Override
    // 메소드 이름이 변환된다. printWeak 했는데 showWithParen이 하니까
    public void printWeak() { // 12V
        showWithParen(); // 220V, 부모 Banner에게 상속받은
    }

    @Override
    public void printStrong() { 
        showWithAster();
    }
}
