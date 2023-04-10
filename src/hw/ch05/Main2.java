package hw.ch05;

import hw.ch05.idcard.IDCardFactoryHanSoojeong2;

public class Main2 extends Thread {
  public static void main(String[] args) {
    System.out.println("<<20210833 한수정>>");
    
      System.out.println("Start.");
      new Main2("최승훈").start();
      new Main2("한수정").start();
      new Main2("심현수").start();
      System.out.println("End.");
  }

  @Override
  public void run() {
      IDCardFactoryHanSoojeong2 obj = IDCardFactoryHanSoojeong2.getInstance();
      System.out.println(getName() + ": obj = " + obj);
  }

  public Main2(String name) {
      super(name);
  }
}

