public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  //do not print/return
  public static void bubbleSort(int[] data){
    int i = 0;
    int p = 0;
    int temp = 0;
    boolean x = false;
    while (p < data.length){
      i = 0;
      while (i < data.length-1){
        temp = 0;
        if (data[i] > data[i+1]){
          temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
        i += 1;
      }
      p += 1;
    }
  }

  public static void selectionSort(int[] data){
    int i = 0;
    while (i < data.length){
      int x = i;
      int result = i;
      while (x < data.length){
        if (data[result]>data[x]){
          result = x;
        }
        x += 1;
      }
      int temp = data[i];
      data[i] = data[result];
      data[result] = temp;
      i += 1;
    }
  }
}
