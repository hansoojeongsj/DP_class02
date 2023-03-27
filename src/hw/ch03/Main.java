package hw.ch03;

public class Main {
    public static void main(String[] args){
        System.out.println("20210833 한수정");
        
        AbstractDisplay s = new HansooJeongDisplay("한수정","20210833",3);
        s.display(10);


        s.display(5);

    }
    
}
