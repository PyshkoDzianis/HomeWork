
import java.util.*;


  public class HomeWork34 {


      public static void main(String[] args) {

          String str = "one cat two cat three cat";
          String[] strArr = str.split("\\s");
          System.out.println("checking string:"+str);
             ArrayList<String> wordsList = new ArrayList<>();
             ArrayList<Integer> numberEncounter = new ArrayList<>();


          for (int i = 0; i < strArr.length; i++) {
              String word = strArr[i];
              word = word.toLowerCase();
              if (wordsList.contains(word)) {
                  int position = wordsList.indexOf(word);
          Integer number = numberEncounter.get(position);
            int number_int = number.intValue();
                  number_int++;
                  number = new Integer(number_int);
                  numberEncounter.set(position, number);
              } else {
                  wordsList.add(word);
                  numberEncounter.add(new Integer(1));
              }
          }
              for (int i = 0;i < wordsList.size(); i++) {
                  System.out.println(i + "\t" + wordsList.get(i) + "\t"
                          + numberEncounter.get(i));

              }
          }

      }


