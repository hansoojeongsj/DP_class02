package hw.ch14;

public class PrimeNumberSupport extends Support {
  public PrimeNumberSupport(String name) {
    super(name);
  }
  @Override
  protected boolean resolve(Trouble trouble) {
    int troubleNumber = trouble.getNumber();
    if (isPrimeNumber(troubleNumber)) {
        return true;
    }
    return false;
  }

  private boolean isPrimeNumber(int number) {
    if (number < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    
    return true;
  }
}