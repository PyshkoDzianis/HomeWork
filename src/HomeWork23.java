

    public class HomeWork23 {
        public static void main(String[] args)
                throws java.io.IOException {
            char let = 's';
            System.out.println("Я загадал букву,отгадайте какую,у вас 5 попыток");
            System.out.println("если вы сдаетесь,нажмите 5");
            int count = 1;
            char letter;

            do {

         //       System.out.println("попытка номер:"+count);
                System.out.print("Введите вашу букву:");

                letter = (char) System.in.read();

              if (letter == '5') {
                   System.out.println("Вы сдались");
               }
                else {
                    if (let == letter) {
                        System.out.println("Вы угадали!");
                    }
                else {
                        System.out.println("Вы не угадали,попробуйте снова");
                    }

               }
                count++;
            }
            while (let != letter&&count<6 &&letter!='5') ;

        }

    }

