    import java.util.Arrays;
    import java.util.Scanner;

    /**
     * Created by Manan on 25-06-2015.
     */
    public class zoomCar_1 {
        public static void main(String args[]){
            Scanner scannerObject = new Scanner(System.in);

            int k = scannerObject.nextInt();
            int n = scannerObject.nextInt();

            int arr[] = new int[n];

            for (int i =0;i<arr.length;i++){
                arr[i] = scannerObject.nextInt();
            }

            Arrays.sort(arr);


            int unfairness = 1000000002;

            for(int i=0;i<n-k+1;i++){
               // System.out.println(arr[i] + " " + arr[i+k-1]);
                if(arr[i+k-1]-arr[i]<unfairness){
                    unfairness=arr[i+k-1]-arr[i];
                }
            }

            System.out.println(unfairness);
        }
    }
