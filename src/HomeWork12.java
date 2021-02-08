


import java.util.Scanner;

          public class HomeWork12 {

              public static void main(String[] args) {

                  Scanner sc=new Scanner(System.in);
                  System.out.println("введите число isc:");
                  int isc= sc.nextInt();
                  Scanner sc1=new Scanner(System.in);
                  System.out.println("введите число а:");
                  int a=sc.nextInt();
                  Scanner sc2=new Scanner(System.in);
                  System.out.println("введите число b:");
                  int b=sc.nextInt();
                  sc.close();
                  if (a<b) {
                      if (isc < a)

                          System.out.println(" искомое число в диапозоне 1");
                      else if (isc >= a && isc <= b)

                          System.out.println("искомое число в дапозоне 2");
                      else if (isc > b)

                          System.out.println("искомое число в диапозоне 3");
                  }
                  if(a==b)
                      System.out.println("диапозоны не заданы");
                  if(a>b){
                      if(isc<b)  System.out.println(" искомое число в диапозоне 1");
                      else if (isc >= b && isc <= a)

                          System.out.println("искомое число в дапозоне 2");
                      else if (isc > a)

                          System.out.println("искомое число в диапозоне 3");

                  }
              }
  }
