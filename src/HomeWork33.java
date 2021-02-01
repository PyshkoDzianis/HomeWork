import java.util.Scanner;


public class HomeWork33 {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
            System.out.println("введите ваше имя :");
      Scanner age=new Scanner(System.in) ;
          System.out.println("введите ваш  возраст:");

       String template="Your name %s,%s ";
           System.out.println(String.format(template,"den","37"));
              System.out.println(String.format(template,"name","age"));
        String formatedLine=String.format(template,name,age);
            System.out.println(formatedLine);
    }


}