public class MergeSort {
    public static void main(String[] args){
        int [] arr = {1, 3, 2, 3, 1};

        System.out.print("Before merge sort : ");
        System.out.print(arr);

        mergeSort( arr,0,arr.length -1);

        System.out.print("After merge sort: ");
        System.out.print(arr);
    }

    // 1 3 2 5 7 9

    static void mergeSort(int [] arr, int low, int high){
        if(low == high){
            return;
        }
    }

    static void merge(){

    }
}

