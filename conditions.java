import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(num);
        if (num % 2 == 0)
        {
        System.out.println("THIS IS EVEN");
        }
        else if(num == 1)
        {
            System.err.println("EITA PROTHOM");
        }
        else
        {
            System.err.println("This is ODD");
        }
        System.err.println("AMI LAST LINE,CONDITION CHECK KORA SES");
    }
}
