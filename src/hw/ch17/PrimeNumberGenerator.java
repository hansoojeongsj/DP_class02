package hw.ch17;
import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
  private Random random = new Random(); 	// 난수 생성기 
  private int number;                   		// 현재 수 

  // 수를 취득한다 
  @Override
  public int getNumber() {
      return number;
  }

  // 수를 생성한다 
  @Override
  public void execute() {
      for (int i = 0; i < 100; i++) {
          number = random.nextInt(100) + 1;
          if (isPrimeNumber(number)){
            notifyObservers();
          }
      }
  }
  private boolean isPrimeNumber(int num) {
    if (num < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
  }
}
