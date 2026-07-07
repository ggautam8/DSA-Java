import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            else{
                maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            }
        }       // [ 7, 1, 5, 3, 6, 4 ]

        System.out.print("Max profit : " + maxProfit);
    }           // [ 4, 6, 3, 5, 1, 2 ]
}
