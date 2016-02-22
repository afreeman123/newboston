public class tuna {
  private int hour;
  private int minute;
  private int second;

  public void setTime(int h, int m, int s) {
    //if it meets the condition before ? the do the thing before :
    //else do thing after :
    hour = ((h>=0 && h<24) ? h:0);
    minute = ((m>=0 && m<60) ? m:0);
    second = ((s>=0 && s<60) ? s:0);
  }

  //military time method
  public String toMilitary() {
    //"%02d:%02d:%02d" means return the string calling the method in the format
    //2dp:2dp:2dp
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public String toString() {
    return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12:hour%12) , minute, second, (hour < 12 ? "AM":"PM"));
  }
}
