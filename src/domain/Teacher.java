package domain;

public class Teacher extends People{
     private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String getPeopleType() {
        return "teacher";
    }
}
