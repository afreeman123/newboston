class apples {
  public static void main(String args[]){
    System.out.println(average(45,46,32,89,67));
  }

  //... = an elipse which means you dont know how many of that type you will
  //be using as parameters
  public static int average(int...numbers) {

    int total = 0;
    for (int x:numbers) {
      total += x;
    }

    return total/numbers.length;

  }

}
