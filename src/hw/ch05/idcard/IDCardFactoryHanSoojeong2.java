package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryHanSoojeong2 extends Factory {
    private static IDCardFactoryHanSoojeong2 singleton = null;

    private IDCardFactoryHanSoojeong2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryHanSoojeong2 getInstance() {
        if (singleton == null) {
            singleton = new IDCardFactoryHanSoojeong2();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
