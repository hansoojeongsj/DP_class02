package hw.ch05.idcard;
import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;

public class IDCardFactoryHanSoojeong1 extends Factory{
    //3. Singleton 객체 미리 생성
    private static IDCardFactoryHanSoojeong1 singleton = new IDCardFactoryHanSoojeong1();

    // 1. 생성자를 private으로 한다
    private IDCardFactoryHanSoojeong1(){
        
    }

    // 2. 객체를 얻어가는 메소드를 구현 ( static은 static이 접근가능)
    public static IDCardFactoryHanSoojeong1 getInstance(){
        return singleton;
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
