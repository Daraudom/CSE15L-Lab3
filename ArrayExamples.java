

public class ArrayExamples {
  public static void main(String[] args) {
    int[] intArray1 = {1, 2, 3, 4, 5, 6, 7};
    ArrayExamples.reverseInPlace(intArray1);
    for (int i: intArray1) { System.out.println(i);}
  }

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] correctResult = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      correctResult[i] = arr[arr.length - i - 1];
     }
    for (int i = 0; i < arr.length; i++){
      arr[i] = correctResult[i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    int lowestCount = 0;
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { 
        sum += num; 
      }
      if (num == lowest) {
        lowestCount++;
      }
    }
    return sum / (arr.length - lowestCount);
  }


}

