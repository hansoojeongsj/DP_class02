package ch10.practice;

public interface Strategy {
    public abstract Hand nextHand(); // 리턴 타입은 Hand임
    public abstract void study(boolean win); // true, false라 boolean
}
