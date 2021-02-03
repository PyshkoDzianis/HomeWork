import java.util.Scanner;


public class HomeWork33 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
               System.out.println("введите ваше имя :");
                   String name=sc1.nextLine();

            Scanner sc2=new Scanner(System.in) ;
                System.out.println("введите ваш  возраст:");
                   String age= sc2.nextLine();
       String template="hello %s,%s ";

               String formatedLine=String.format(template,name,age);
           System.out.println("Hello"+formatedLine);

    }

}