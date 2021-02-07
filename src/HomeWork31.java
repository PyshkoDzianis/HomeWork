
import java.util.Random;

public class HomeWork31  {


    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
           int number = random.nextInt(1000);

            String str1 = ("" + number);

            String[] arrSplit = str1.split("\\s", 100);

            for (int j = 0; j < arrSplit.length; j++)
                System.out.println("" + arrSplit[j]);

          }
       }
    }




