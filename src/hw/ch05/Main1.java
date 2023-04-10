package hw.ch05;

import hw.ch05.idcard.IDCardFactoryHanSoojeong1;

public class Main1 {

  public static void main(String[] args) {
    System.out.println("<<20210833 한수정>>");
    IDCardFactoryHanSoojeong1 factory1 = IDCardFactoryHanSoojeong1.getInstance();
    IDCardFactoryHanSoojeong1 factory2 = IDCardFactoryHanSoojeong1.getInstance();

    if(factory1 == factory2){ 
      System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
    }else{
      System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
    }
  }
}

