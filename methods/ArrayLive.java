//livecoding task!

//BIG IDEA: creating and traversing an array

public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];
    for (int i=0; i<size; i++)
    {
      data[i]=r.nextInt(maxValue);
    }

    return data;
  }



  public static void printArray( int[] data )
  {
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i] + " ") ;
    }
    System.out.println("");
  }