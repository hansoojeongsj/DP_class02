package hw.ch05.framework;

public abstract class Factory {
    // 제품 생산 시의 큰 흐름을 결정 => 템플릿 메소드
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    //추상메소드는? 자식이 구체적인 생산 방법을 결정한다. => factory method
    //protected abstract Product createProduct(String owner);  // 선언만
    protected Product createProduct(String owner) {
        //구현
        return null;
    }


    protected abstract void registerProduct(Product product);
}