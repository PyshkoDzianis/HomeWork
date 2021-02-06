import java.util.Scanner;

public class HomeWork24 {
       public static void main(String[] args) {
        int r;
        int i = 0;
              Scanner sc=new Scanner(System.in);
           System.out.println("Enter your number: ");
           int number=sc.nextInt();
        do {
            r = (int) (Math.random() * 101);
            i++;
        }
        while (number != r) ;
        System.out.println("колличество попыток:" + i);

    }
}
