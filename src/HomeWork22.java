import java.io.OptionalDataException;
import java.util.Scanner;

public class HomeWork22 {
    public static void main(String[] args) {
        int[] array1 = new int[31];
        int[] array2 = new int[30];
        int[] array3 = new int[28];
        //   int a= array3.length;
      //  System.out.println(a);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter month:");
        int month = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter day:");
        int day = sc2.nextInt();

        int result=1;
        switch (month) {

            case 2:
                result = array3.length;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = array1.length;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = array2.length;
                break;
            default:
                System.out.println("not a number of month");
                break;
        }

        System.out.println( day<=result?"right date":"date is wrong" );

        }

        }



