package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties(); // 어댑터 생성
        try {
            //f.readFromFile("file.txt");

            f.setValue("Year", "2023");
            f.setValue("bornYear", "2002");
            f.setValue("StudentId", "20210833");
            f.setValue("Name", "HanSoojeong");
            f.setValue("Location", "Seoul");
            f.writeToFile("HanSooJeong.txt");
            System.out.println("HanSooJeong.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} // [workspace] 명에서대괄호에서 오류발생 이름 바꿔주기 걍  workspace이걸로


