package ch10.practice;

public class Main {
    // 메인 메소드 써줘야함
    public static void main(String[] args){

        // 바위
        Hand h1 = Hand.ROCK; // 어느 클래스에 있는 상수(ROCK)인지
        System.out.println(h1.toString());

        // 가위
        Hand h2 = Hand.getHand(1);
        System.out.println(h2);
        
        // 보자기
        Hand h3 = Hand.getHand(2);
        System.out.println(h3);

        // h1(바위)과 h2(가위) 중 누가 이기나 해보기
        if(h1.isStrongerThan(h2)) {
            System.out.println("h1이 h2보다 세다");
        }else if(h1.isWeakerThan(h2)){
            System.out.println("h1이 h2보다 약하다");
        }else{
            System.out.println("무승부이다.");
        }
    }


}
