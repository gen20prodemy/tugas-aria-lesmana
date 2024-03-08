package array;

public class ArrayOperation {

    public static int arraySum(int[] input){//total array integer 1 dimensi
        int sum = 0;

        for (int j : input) sum += j;

        return sum;
    }
    public static int[] arraySum2D(int[][] input){//total array integer 2 dimensi
        int[] sum = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                sum[i] += input[i][j];
            }
        }
        return sum;
    }
    public static int[] arrayReverse(int[] input) {//fungsi mereverse array

        int[] revArr = new int[input.length];
        int j = input.length-1;
        for (int i : input) {
            revArr[j] = i;
            j--;
        }
        return revArr;
    }
    public static int[][] arrayReverse2D(int[][] input) {//fungsi mereverse array 2d

        int[][] revArr = new int[input.length][];
        int j = input.length-1;
        for (int[] i : input) {
            int[] ii=arrayReverse(i);
            revArr[j] = ii;
            j--;
        }
        return revArr;
    }

}
