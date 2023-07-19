import java.util.Scanner;

public class PowerFunction {
    static int power(int a, int b, int c){
        if(b==0){
            return 1;
        }
        int p= power(a,b/2, c );
        if(b%2 == 0){
            return Math.abs((p*p)%c);
        }else {

            return Math.abs((p*p*a)%c);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(power(a,b,c));


    }
}
