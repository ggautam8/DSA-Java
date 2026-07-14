import java.util.Scanner;

public class PascalTriangle_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter element position (row no., col no.): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // calc (r - 1) C (c - 1)
        int res = 0;
        for(int i = r - 1; i >= c; i--){

        }


        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.print("\n");
        }
    }
}
