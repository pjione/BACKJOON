package class1;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1008
      /*  double num1 = in.nextInt();
        double num2 = in.nextInt();
        System.out.println(num1/num2);*/

        //1330
      /*  long a = in.nextInt();
        long b = in.nextInt();

        String result = a > b ? ">" : a < b ? "<" : "==";

        System.out.println(result);*/

        //11720
        int n = in.nextInt();
        in.nextLine();
        String n2 = in.nextLine();
        String[] split = n2.split("");

        int sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);

    }

}