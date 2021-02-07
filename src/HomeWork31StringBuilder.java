import java.util.Random;

public class HomeWork31StringBuilder {
    public static void main(String[] args) {
        Random random1 = new Random();
        for (int k = 0; k < 100; k++) {
            int number = random1.nextInt(1000);
            String str =  Integer.toString(number);

            StringBuilder builder = new StringBuilder();
               builder.append(str).append("\s");
                 String result = builder.toString();
                     System.out.print("" + result);
        }
    }
}