import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

     public class HomeWork32 {
     public static void main(String[] args) {

        Random random1 = new Random();
        for (int k = 0; k < 100; k++) {
            int number = random1.nextInt(1000);
            String str = Integer.toString(number);

            StringBuilder builder = new StringBuilder();
               builder.append(str).append("\s");
                  String result = builder.toString();
                System.out.print( result);

                  String regex="[1-9]\\d";

       //      Pattern pattern = Pattern.compile(regex);
       //     Pattern.matches(regex,result);

         //   Matcher matcher = pattern.matcher(result);
             String val= result.replaceAll("[1-9]\\d+","-1");
       //     System.out.println(""+val);
           // System.out.println("pattern.matcher(str).matches() = " + matcher.matches());
        //    for (int i = 0; i <result.length() ; i++) {

            }
           }
        }

