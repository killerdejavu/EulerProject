import java.util.Scanner;

/**
 * Created by Manan on 25-06-2015.
 */
public class zoomCar_2 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int diff_array[] = new int[n-1];
        for (int i = 0; i < diff_array.length; i++) {
            diff_array[i] = arr[i] - arr[i+1];
        }


        int numberOfQueries = s.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            int l = s.nextInt();
            int r = s.nextInt();

            int max_diff=0;
            int diff_sum=0;

            for(int j=l;j<r;j++){
                if(diff_array[j]>max_diff){
                    max_diff = diff_array[j];
                }
                if(diff_array[j] + diff_sum <0){
                    diff_sum=0;
                }else{
                    diff_sum = diff_sum + diff_array[j];
                }

                if(diff_sum>max_diff){
                    max_diff = diff_sum;
                }

            }
            System.out.println(max_diff);
        }

    }
}
