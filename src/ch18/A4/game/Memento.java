package ch18.A4.game;

import java.io.*;
import java.nio.file.*;
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
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

  // 과일을 추가한다(wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 과일을 얻는다(wide interface)
    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

    // 파일에 저장
    public static boolean saveToFile(String filename, Memento memento) {
        StringBuilder sb = new StringBuilder();

        // 소지금
        //memento.money 돈의 액수 얻어짐. format하면 %d에 들어가고 StringBuilder에 append함.
        sb.append(String.format("%d", memento.money));
        sb.append("\n");

        // 과일
        for (String f: memento.getFruits()) {
            sb.append(f);
            sb.append("\n");
        }

        // 쓰기, File에 String 써라
        try { 
            Files.writeString(Path.of(filename), sb, 
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    // 파일로부터 생성, 파일에 있는 내용 읽어서 Mememto 생성
    public static Memento loadFromFile(String filename) {
        try {
            // 읽기, File에 있는 내용 읽어들여라
            List<String> lines = Files.readAllLines(Path.of(filename));
            if (lines.size() == 0) { 
                System.out.println("Empty file");
                return null;
            }

            // 소지금
            int money = 0;
            try {
                money = Integer.parseInt(lines.get(0)); // string을 정수로, 그 후 money에 담아둠.
            } catch (NumberFormatException e) {
                System.out.println("Format error: " + e);
                return null;
            }

            // 생성, 여기까지가 돈을 memento 객체에 담는 과정
            Memento memento = new Memento(money);

            // 과일
            for (int i = 1; i < lines.size(); i++) {
                memento.addFruit(lines.get(i));
            }
            return memento;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null; // 제대로 객체 생성이 되지 않았다
        }
    }
}
