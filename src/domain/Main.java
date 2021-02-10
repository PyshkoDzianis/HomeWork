package domain;

    public class Main {
   //     private static User<Object> User;

        public static void main(String[] args) {

   //            User<String> user1 = new User<String>("Vasia", 0);
    //            String user1Id = user1.getId();
   //             System.out.println(user1Id);
        Student student1=new Student();
            student1.setName("Vasia");
            student1.setAge(24);
        Student student2=new Student();
            student2.setName("Kolia");
            student2.setAge(23);
        Teacher teacher1=new Teacher();
             teacher1.setName("Olga");
             teacher1.setAge(35);
            People people1=new Student();
            People people2=new Teacher();
            }
            public static void printType(People people){
        System.out.println(" "+people.getPeopleType());
            }
        }






