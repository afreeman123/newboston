class apples {
  public static void main(String args[]){
    //multidimensional array
    int firstarray[][] = {{8,9,10,11},{12,13,14,15}};
    //can have different lengths
    int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};

    System.out.println("This is the first array");
    display(firstarray);

    System.out.println();
    
    System.out.println("This is the second array");
    display(secondarray);
  }

  public static void display(int x[][]) {
    //loop for rows
    for(int row=0;row<x.length;row++) {
      //loop for columns
      for(int column=0;column<x[row].length;column++) {
        //print row
        System.out.print(x[row][column] + "\t");
      }
      //create new line after printing row
      System.out.println();
    }
  }
}
