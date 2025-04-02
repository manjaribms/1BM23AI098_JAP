import java.util.Scanner;
public class enumerate {
    public enum dayofweek
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        public boolean isworkday()
        {
            return(this!=SATURDAY&& this!=SUNDAY);


        }


    }
    public static void main(String[] args)
    {
        System.out.println("is monday a workday?"+dayofweek.MONDAY.isworkday());
        System.out.println("is saturday a workday?"+dayofweek.SATURDAY.isworkday());
    }

}
