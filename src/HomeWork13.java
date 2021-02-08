import java.util.Scanner;



import java.util.Scanner;

    public class HomeWork13 {
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
              System.out.println("введите первое число:");
                int a= sc.nextInt();
                   Scanner sc1=new Scanner(System.in);
                 System.out.println("введите второе число:");
                int b=sc1.nextInt();
            Scanner sc2=new Scanner(System.in);
              System.out.println("введите третье число:");
                int c=sc2.nextInt();
            sc.close();
               int min = a;
            if (min > b) {
                min = b;
            }
                 if (min > c) {
                min = c;
            }
                System.out.println("минимальное=" + min);
              int max = a;
          if (max < b) {
                max = b;
            }
              if (max < c) {
                max = c;
         }
            System.out.println("максимальное=" + max);
                double sum;
                   sum=(double)(a+b+c)/3;
            System.out.println("среднее арифметическое"+sum);
        }
    }


