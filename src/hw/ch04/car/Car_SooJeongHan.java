package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_SooJeongHan extends Product{ //Product 상속받음
    private String modelName;
    private int serial;

    public Car_SooJeongHan(String modelName) {  

        //System.out.println(modelName + "의 카드를 만듭니다.");
        this.modelName = modelName;
        //this.serial = serial;
    }
    @Override
    public void use() {  // this: 현재 아이디 객체, +: 문자열 연결
        System.out.println("모델명 "+ this+"인 car를 사용합니다."); // this 문자열 아니라 this.toString() 자동 호출됨
    }

    @Override
    public String toString() {
        return modelName;
    }

    public String getModelName() { 
        return modelName;
    }
    

    public int getSerial() {
        return serial;
    }
}
