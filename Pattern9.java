import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:\t");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//         *       
//       * * *     
//     * * * * *   
//   * * * * * * * 
// * * * * * * * * * 