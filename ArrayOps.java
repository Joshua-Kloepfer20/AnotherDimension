public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr) {
    int highest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > highest) {
        highest = arr[i];
      }
    }
    return highest;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = sum(matrix[i]);
    }
    return arr;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = largest(matrix[i]);
    }
    return arr;
  }
  public static int sum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += sum(arr[i]);
    }
    return sum;
  }
  public static int[] sumCols(int[][] matrix) {
    int[] arr = new int[matrix[0].length];
    int sum = 0;
    for (int i = 0; i < matrix[0].length; i++) {
      sum = 0;
      for (int j = 0; j < matrix.length; j++) {
        sum += matrix[j][i];
      }
      arr[i] = sum;
    }
    return arr;
  }
  public static boolean isRowMagic(int[][] matrix) {
    int[] sum = sumRows(matrix);
    for (int i = 1; i < matrix.length; i++) {
      if (sum[0] != sum[i]) {
        return false;
      }
    }
    return true;
  }
  public static boolean isColMagic(int[][] matrix) {
    int[] sum = sumCols(matrix);
    for (int i = 1; i < matrix.length; i++) {
      if (sum[0] != sum[i]) {
        return false;
      }
    }
    return true;
  }

}
