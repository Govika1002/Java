import java.util.Scanner;

class q4{
    public static void main(String args[])
    { 
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        double Score = scan.nextDouble();
        scan.nextLine();
        String Department = scan.nextLine();
        System.out.println("My Name is " +Name);
        System.out.println("My Score is " +Score/10);
        System.out.println("My Department is " +Department);
    }
}