

public class SummativeSums {

    public static void main(String[] args) {
        int[] arrayA = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arrayB = {999, -60, -77, 14, 160, 301};
        int[] arrayC = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Array Sum: " + ArrayTotal(arrayA)) ;
        System.out.println("Array Sum: " + ArrayTotal(arrayB)) ;
        System.out.println("Array Sum: " + ArrayTotal(arrayC)) ;

          }

    //creating static method to sum arrays
    public static int ArrayTotal(int[] array) {
        int total = 0;
        for (int x = 0; x < array.length; x++) {
            total += array[x];
        }
        return total;
     }


}
