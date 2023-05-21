package hw.ch19;

public class NightMealState implements State{
  private static NightMealState singleton = new NightMealState();

    private NightMealState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (17 <= hour && hour < 20) {
            context.changeState(NightState.getInstance());
        } else if (15 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(야식)");
        context.callSecurityCenter("금고 사용(야식)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야식)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(야식)");
    }

    @Override
    public String toString() {
        return "[야식]";
    }
    @Override
    public void doCCTV(Context context){
      context.recordLog("CCTV: Off");
    }
  
}