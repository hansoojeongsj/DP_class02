package ch02.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties(); // 어댑터 생성
        try {
            //f.readFromFile("file.txt");

            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.setValue("name", "hsj");
            f.setValue("age", "20");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} // [workspace] 명에서대괄호에서 오류발생 이름 바꿔주기 걍  workspace이걸로

