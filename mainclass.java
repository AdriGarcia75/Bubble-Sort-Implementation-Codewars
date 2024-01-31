public class Solution{
    public static long maxProduct(int[] numbers, int sub_size){
        long sum = 1;
        //not really needed but told to make the bubble sort implementation
        int temp = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 1; j < (numbers.length - i); j++){
                if (numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 1; i <= sub_size; i++){
            sum *= numbers[(numbers.length - i)];
        }
        return sum;
    }
}
