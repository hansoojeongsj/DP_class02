package hw.ch14;

public class Main {
    public static void main(String[] args) {
        Support support = new PrimeNumberSupport("한수정");

        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);


        // 사슬 형성 
        alice.setNext(support).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 다양한 트러블 발생
        for (int i = 1; i < 101; i += 1) {
            alice.support(new Trouble(i));
        }
    }
}
