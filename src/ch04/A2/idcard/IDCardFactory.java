package ch04.A2.idcard;


import java.util.Hashtable;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Hashtable manager = new Hashtable<>(); // 연습문제 4-2하면서

    protected synchronized Product createProduct(String owner) {
        manager.put(serial,owner); // 연습문제 4-2하면서
        manager.get(serial); // 연습문제 4-2하면서

        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
