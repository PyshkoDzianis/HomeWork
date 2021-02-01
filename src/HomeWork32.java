import java.util.Random;

     public class HomeWork32 {

    public static void main(String[] args) {

       Random random = new Random();
      for (int i = 0; i < 100; i++) {
           int number = random.nextInt(1000);

           String str1 = ("" + number);

         String[] arrSplit = str1.split("\s", 100);
           for (int k = 0; k < arrSplit.length; k++) ;


             System.out.print("" + arrSplit[k]);
               System.out.print(" ");
               for (int ch = 10; ch < 100; ch++) ;
              str1.replaceAll("ch", "-1");
              System.out.println("Result:" + str1);

        }
    }
}