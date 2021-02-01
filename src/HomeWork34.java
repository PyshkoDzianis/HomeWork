import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork34 {
    public static void main(String[] args) {
        String strMain = "Hellow ,World!,I am Happy ,World!";
        String[] arrSplit = strMain.split("\s");
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);

            int length = strMain.length();
            for (int j = 0; j <length; j++) {
                Pattern pattern = Pattern.compile("" + strMain);

                Matcher matcher = pattern.matcher(""+j);
                int count = 0;

                while (matcher.find())
                    if (strMain.equals(arrSplit[j]))
                    count++;
                System.out.println(word+"встречается:"+count);
            }
        }
    }
}
