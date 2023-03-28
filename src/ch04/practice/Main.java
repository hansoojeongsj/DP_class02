package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 1. 신분증 생산 (직접)
        Product id01 = new IDCard("hsj");
        id01.use();


        //Product id = new IDCard(); // 인자있는 생성자 있으니까, 이거 호출하면 오류..

        //2. 신분증 생산 (공장 통해서)
        Factory f = new IDCardFactory();
        Product id02 = f.create("hsj");
        id02.use();


    }
}
