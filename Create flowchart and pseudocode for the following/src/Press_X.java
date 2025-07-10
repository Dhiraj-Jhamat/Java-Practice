import java.util.Scanner;

public class Press_X {
    public static <Global> void main(String[] args) {
        System.out.println("Keep Entering Numbers");
        System.out.println("Enter X to stop: ");
        Scanner sc = new Scanner( System.in );
        boolean flag=true;
        while (flag){
            String input= sc.next();
            if ( input.equalsIgnoreCase( "x" ) ){
                break;
            }
        }

    }
}


/* String Comparison Problem
In Java, == checks for reference equality, not content equality.*/