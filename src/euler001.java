import java.util.Scanner;

/**
 * Created by Manan on 24-05-2015.
 */
public class euler001 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long test = scanner.nextLong();

        while (test>0){
            long number = scanner.nextLong();
            long result = function(number);
            System.out.println(result);
            test--;
        }
    }

    private static long function(long number) {
        long x_3=(int) Math.ceil(number/3.0)-1;
        long x_5=(int) Math.ceil(number/5.0)-1;
        long x_15=(int) Math.ceil(number/15.0)-1;

        long answer = 3*(x_3 * (x_3+1))/2 + 5*(x_5 * (x_5+1))/2 - 15*(x_15 * (x_15+1))/2;
        return answer;
    }
}
