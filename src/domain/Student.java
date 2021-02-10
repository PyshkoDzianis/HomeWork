package domain;

  public class Student extends People{
          private String spec;

      public String getSpec() {
          return spec;
      }

      public void setSpec(String group) {
          this.spec = group;
      }

      @Override
      public String getPeopleType() {
          return "student";
      }
  }
