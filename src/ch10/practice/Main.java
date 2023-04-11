package ch10.practice;

public class Main {
    // 메인 메소드 써줘야함
    public static void main(String[] args){
/*
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

        Strategy s1 = new WinningStrategy(100);

        Hand h4 = s1.nextHand();
        System.out.println(h4);
    
        s1.study(true);
        Hand h5 = s1.nextHand();
        System.out.println(h5);
     */
    // 게임 진행
    // 1. 플레이어 생성
        Player p1 = new Player("한수정", new ProbStrategy(111111));
        Player p2 = new Player("박보검", new WinningStrategy(2000));
         
        p2.setStrategy(new ProbStrategy(2222)); // 동적으로 전략이 교체됨.
        
        for(int i=0; i <10000; i++){
        // 2. 게임 시작
            Hand h1 = p1.nextHand();
            Hand h2 = p2.nextHand();

            if( h1.isStrongerThan(h2)){
                System.out.println("Winner: "+p1);
                p1.win();
                p2.lose();
            }else if(h1.isWeakerThan(h2)){
                System.out.println("Winner: "+p2);

                p1.lose();
                p2.win();
            }else{
                p1.even();
                p2.even();
                System.out.println("Even ...");

            }
        }
        System.out.println("Final Result: ");
        System.out.println(p1);
        System.out.println(p2);
    }
}
