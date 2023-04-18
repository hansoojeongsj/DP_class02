package ch11.practice;

public class Main {
    public static void main(String[] args) {
        
        //Entry root = new Directory("root"); // 부모타입 선언
        Directory root = new Directory("root"); // 자식타입 선언, Directory만 add가지고 있음.

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 컴파일러 입장에선 변수의 타입이 실제 들어간 객체보다 중요함
        //((Directory)root).add(bin); // .의 우선 순위가 가장 높아서 () 묶어줘야 함
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi",100));
        bin.add(new File("latex",200));

        System.out.println(root.getSize());

        root.printList(null);
    }
}
