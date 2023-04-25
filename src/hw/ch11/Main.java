package hw.ch11;

public class Main {
  public static void main(String[] args) {
      
      System.out.println("(20210833, 한수정)");
      Directory root = new Directory("MyDocuments","20230401", "SooJeongHan"); 

      Directory bin = new Directory("MyData","20230401","SooJeongHan");
      Directory tmp = new Directory("MyPictures","20230401","SooJeongHan");
      
      root.add(new File("한수정0.doc","20230501", 1000, "SooJeongHan"));
      root.add(bin);
      bin.add(new File("한수정1.doc", "20230501", 2000, "SooJeongHan"));
      bin.add(new File("한수정2.java", "20230501", 3000, "SooJeongHan"));
      bin.add(tmp);

      tmp.add(new File("한수정3.gif", "20230601", 4000, "SooJeongHan"));
      tmp.add(new File("한수정4.jpg", "20230601", 5000, "SooJeongHan"));
      tmp.add(new File("한수정5.png", "20230601", 6000, "SooJeongHan"));

      root.printList("");
  }
}
