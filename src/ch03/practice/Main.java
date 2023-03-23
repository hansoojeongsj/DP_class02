package ch03.practice;

public class Main {
    public static void main(String[] args){
        AbstractDisplay c = new CharDisplay('a');
        c.open();
        c.print();
        c.close();
    
        c.display();

        AbstractDisplay s = new StringDisplay("hsj");
        s.open();
        s.print();
        s.close();

        s.display();
        /*
        AbstractDisplay a;
        a = new CharDisplay('a');
        a.open();
        a.print();
        a.close();
    
        a.display();
        a = new StringDisplay("hsj");
        a.open();
        a.print();
        a.close();
    
        a.display();*/
    }
    
}
