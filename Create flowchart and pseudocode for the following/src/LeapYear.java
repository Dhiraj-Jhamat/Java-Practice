
public class LeapYear{
    public static void main(String[] args) {
        int year=1900;
        System.out.println(find(year));


    }
    static boolean find(int yr){
        if ( yr%4==0 ){
            if ( yr%100!=0 || yr%400==0 ){
                return true;
            }
        }
        return false;
    }


}
