
import java.util.Random;

public class HomeWork31  {


    public static void main(String[] args) {

       int arr[];
        arr = new int [100];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 1000);

        String str = "";
        for (int value : arr) {
            str = String.format("%s%s\s", str, value);
        }
        System.out.println(str);

        }
     }





