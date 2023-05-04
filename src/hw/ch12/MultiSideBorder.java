package hw.ch12;

public class MultiSideBorder extends Border{
    private char ch;
    private int num;

    public MultiSideBorder(Display display, char ch, int num){
        super(display);
        this.ch = ch;
        this.num = num;
    }
    
    @Override
    public int getColumns() {
      // 문자 수는 내용물 양쪽에 좌우 장식 문자만큼 더한 것
      return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
      //행 수
      return display.getRows();
    }

    @Override
    public String getRowText(int row) {
      return borderNum() + display.getRowText(row) + borderNum();
    }
    
    
    public String borderNum() {
        String bs = "";
        for (int i = 0; i < num; i++) {
            bs += ch;
        }
        return bs;
    }
    
}