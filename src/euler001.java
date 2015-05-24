import java.util.Scanner;

/**
 * Created by Manan on 24-05-2015.
 */
public class euler001 {

    private static int MAX_LIMIT=10000001;
    public static int MAX_ARRAY_VALUE=MAX_LIMIT/3 + MAX_LIMIT/5;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int arr[] = new int[MAX_ARRAY_VALUE];
        arr[0]=0;
        for (int i=1;i<MAX_ARRAY_VALUE;i++){
            arr[i]=arr[i-1]+lesser((int)Math.ceil(((arr[i-1]+1)/3.0))*3,(int)Math.ceil(((arr[i-1]+1)/5.0))*5);
        }


        while (test>0){
            int temp = scanner.nextInt();
            for (int i=1;i<101;i++)
            {
                System.out.println(arr[i]);
            }
           test--;
        }
    }

    private static int lesser(int a, int b) {
        if(a<=b) return 3;
        else return 5;

    }
}
