
   import java.util.Scanner;

    public class HomeWork14 {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
              System.out.println("введите первое число:");
           int thirst = sc.nextInt();

                Scanner sc1 = new Scanner(System.in);
            System.out.println("введите второе число:");
         int second = sc1.nextInt();
                sc.close();
                double deliter;
             deliter = thirst * 0.1;
                if (thirst - deliter <= second && second <= thirst + deliter)
                    System.out.println("числа близки");
              else
                if(thirst-deliter>second^second>thirst+deliter)
                    System.out.println("числа различаются");

            }
        }

