package ch18.Sample.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;             // 소지금 
    private List<String> fruits;  // 과일

    // 소지금을 얻는다(narrow interface)
    public int getMoney() {
        return money;
    }

    // 생성자(wide interface)
    Memento(int money) { // 같은 패키지에 있는 클래스만 Mememto 호출 가능
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // 과일을 추가한다(wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit); // fruit 저장할 때 List의 add 호출
    }

    // 과일을 얻는다(wide interface)
    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }
}
