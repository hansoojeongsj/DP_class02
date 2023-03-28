package ch04.practice.framework;

public abstract class Product {
    // 컴파일 오류 (문제4-3)
    //public abstract Product(String name);
    //생성자 부모쪽에서 생성한다고 해서 자식쪽으로 내려가지 않음(생성자는 상속되지 않음)
    
    public abstract void use();
}
