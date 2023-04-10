package hw.ch04.car;
import hw.ch04.framework.Product;
import hw.ch04.framework.Factory;

import java.util.Vector;
import java.util.Iterator;

public class CarFactory extends Factory {
    //private int serial = 100;
    private Vector<String> modelNames = new Vector <String>(); 

    protected synchronized Product createProduct(String modelName) {
        
        return new Car_SooJeongHan(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(product.getModelName());
    }
    public void printAllModelNames() {
        Iterator it = modelNames.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
