import java.util.Scanner;

public class q9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income > 7000)
        {
            System.out.println("Scholarship is granted");
        }
        else
        {
            System.out.println("Not eligible for scholarship");
        }

    }
    
}
