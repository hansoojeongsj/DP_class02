package hw.ch12;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();

        System.out.println("20210833 한수정");
        
        md.add("학번: 20210833");
        md.add("이름: 한수정");
        md.add("핸드폰 번호: 010-4116-3758");

        Display d1 = new UpDownBorder(new FullBorder(md),'=');

        Display d2 = new MultiSideBorder(d1, '*',3);
        d2.show();

    }
}
