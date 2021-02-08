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
            String s="-1";
                  String regex="\\b\\d{1,2}\\b";

           Pattern pattern = Pattern.compile(regex);

             Matcher matcher = pattern.matcher(result);

                String value=matcher.replaceAll(""+matcher.replaceAll(s));

       System.out.println(value);

            }
           }
        }

