
import java.util.*;


  public class HomeWork34 {


      public static void main(String[] args) {

          String str = "one cat two cat three cat";
              String[] strArr = str.split("\\s");
           ArrayList<String> wordsList = new ArrayList<String>();

              int numberCount = 1;

              for(int i = 0; i<strArr.length;i++)

              {
                  for (int j = i + 1; j < strArr.length; j++) {
                      if (strArr[i].equals(strArr[j]))
                          numberCount++;
                  }

                  System.out.println(strArr[i] + " : " + numberCount);
                  numberCount = 1;
              }
              }

          }


