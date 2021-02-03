import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork34 {
    public static void main(String[] args) {
        String strMain = "my name is Den,Den is great!";
        String[] arrSplit = strMain.split("\\s");
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);

            for (int j = 0; j < arrSplit.length; j++) {


                Pattern pattern = Pattern.compile(strMain);


                Matcher matcher = pattern.matcher(strMain);
                int count = 0;
              while (matcher.find())
                    count++;

               //   while (matcher.find())
                 //     if (strMain.equals(arrSplit[i]))
                //  count++;
                System.out.println("встречается:" + count);
            }
        }
    }
}
