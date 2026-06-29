import java.util.ArrayList;
import java.util.Scanner;

public class UnionOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];

        System.out.print("Enter elements of first array: \n");
        for(int i = 0; i < n1; i++){
            System.out.print("arr1[" + i + "]: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];

        System.out.print("Enter elements of second array: \n");
        for(int i = 0; i < n2; i++){
            System.out.print("arr2[" + i + "]: ");
            arr2[i] = sc.nextInt();
        }

        System.out.print("\nFirst array: [");
        for(int i = 0; i < n1; i++){
            System.out.print(" " + arr1[i] + " ");
        }
        System.out.print("]");

        System.out.print("\nSecond array: [");
        for(int i = 0; i < n2; i++){
            System.out.print(" " + arr2[i] + " ");
        }
        System.out.print("]");

        ArrayList<Integer> unionArr = new ArrayList<>();

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(unionArr.isEmpty() || unionArr.getLast() != arr1[i]){
                    unionArr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(unionArr.isEmpty() || unionArr.getLast() != arr2[j]){
                    unionArr.add(arr2[j]);
                }
                j++;
            }
        }

        while(j < n2){
            if(unionArr.isEmpty() || unionArr.getLast() != arr2[j]){
                unionArr.add(arr2[j]);
            }
            j++;
        }

        while(i < n1){
            if(unionArr.isEmpty() || unionArr.getLast() != arr1[i]){
                unionArr.add(arr1[i]);
            }
            i++;
        }

        System.out.print("\nUnion Array : " + unionArr);
    }
}
