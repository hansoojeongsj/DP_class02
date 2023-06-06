package ch21.A1;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "Printer"); // Print원본 생성

        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");

        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");
    }
}
