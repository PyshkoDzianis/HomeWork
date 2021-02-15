  package domain;


  import java.util.function.Consumer;

  public class User {
      static public User create(Consumer<UserBuilder> buildingFunction) {
      return new User().build(buildingFunction);
  }

      private String name;
      private int age;

      public String getName() {
          return name;
      }

      public int getAge() {
          return age;
      }

      private User() {

      }

      private User build(Consumer<UserBuilder> buildingFunction) {
          buildingFunction.accept(new UserBuilder() {

              @Override
              public UserBuilder withName(String name) {
                  User.this.name = name;
                  return this;
              }

              @Override
              public UserBuilder withAge(int age) {
                  User.this.age = age;
                  return this;
              }
          });

          if (name == null || name.isEmpty()) {
              throw new IllegalStateException("the name must not be null or empty");
          }

          if (age <= 0) {
              throw new IllegalStateException("the age must be > 0");
          }

          return this;
      }
  }

  interface UserBuilder {

      UserBuilder withName(String name);

      UserBuilder withAge(int age);
  }