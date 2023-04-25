package hw.ch11;


// leaf node에 해당됨
public class File extends Entry {
  private String name;
  private int size;
  private String date;
  private String author;

  public File(String name, String date, int size, String author) {
    this.name=name;
    this.date=date;
    this.size=size;
    this.author=author;
  }

  @Override
  public String getName() {
      return name;
  }

  @Override
  public String getDate() {
      return date;
  }
  @Override
  public String getAuthor() {
      return author;
  }
  @Override
  public int getSize() {
      return size;
  }

  @Override
  protected void printList(String prefix) {
      System.out.println(prefix + "/" + this);
  }
  public int getCount(){
    return 1;
  }
}
