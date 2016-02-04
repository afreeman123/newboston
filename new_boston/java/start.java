class apples {
  public static void main(String args[]){
    //Compund interest formula: A=P(1+R)^n where n = no. of years
    //P = current amount, R =  interest
    double amount;
    double principal = 10000;
    double rate = 0.01;

    for(int day=1;day<=20;day++) {
      //Math.pow times the 2 parameters together
      amount = principal * Math.pow(1 + rate, day);
      System.out.println(day + "  " + amount);
    }

  }
}
