
import java.util.*;

public class question05 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = S.nextInt();
        int mid = (num/2) + 1;
        for (int i=1; i<=num; i++){
             if(i<=mid - 1){
                System.out.print((mid - i) + " ");
             }
             else if (i == mid){
                System.out.print(mid + " ");
             }
             else{
                System.out.print((num - (i - mid - 1)) + " ");
             }
            }
    }   
}
