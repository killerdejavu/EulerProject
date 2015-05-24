import java.util.Scanner;

/**
 * Created by Manan on 24-05-2015.
 */
public class euler002 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        long arr[] = new long[90];
        arr[0]=1;
        arr[1]=1;

        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        int test = scanner.nextInt();
        while (test>0){
            long sum=0;
            long n = scanner.nextLong();
            for (int i=1;arr[i]<=n;i++){
                if(arr[i]%2==0){
                    sum+=arr[i];
                }
            }
            System.out.println(sum);
            test--;
        }

    }
}
