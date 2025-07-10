import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println( "Enter two Numbers" );
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter First Number: " );
        long num1 = sc.nextInt();
        System.out.println( "Enter Second Number: " );
        long num2 = sc.nextInt();
        long num = num1 > num2 ? num2 : num1;
        for (long i = num - 1; i > 0; i--) {
            if ( num1 % i == 0 && num2 % i == 0 ) {
                System.out.println( "HCF is: " + i );
                ;
                break;
            }


        }
        int j = 2;
        int i=2;
        long temp1=num1, temp2=num2;
        while (true) {

            if ( temp1 < temp2 ) {
                temp1=num1*i;
                i++;
                if ( temp1 == temp2 ) {
                    System.out.println("LCM is: "+ temp2 );
                    break;
                }
            } else {
                temp2=num2*j;
                j++;
                if ( temp1 == temp2 ) {
                    System.out.println("LCM is: "+ temp1 );
                    break;
                }

            }

        }
    }
}
// hELLO