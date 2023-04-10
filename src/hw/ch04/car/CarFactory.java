package hw.ch04.car;
import hw.ch04.framework.Product;
import hw.ch04.framework.Factory;

import java.util.Vector;
import java.util.Iterator;

public class CarFactory extends Factory {
    private int serial = 100;
    private Vector<String> modelNames = new Vector<>(); 

    protected synchronized Product createProduct(String modelName) {
        
        return new Car_SooJeongHan(modelName, serial++);
    }

    @Override
    protected void registerProduct(Product product) {

    }
    protected void printAllModelNames() {
        //modelNames에 저장되어 있는 모델 이름들을 하나씩 끄집어내와서 출력한다.
        Iterator modelName = modelNames.iterator();
        
		while (modelName.hasNext()) {
			Product modelNames = (Product)modelName.next(); // 다음 책을 얻어온다.
			System.out.println(modelNames);
	    }	
    }
}
