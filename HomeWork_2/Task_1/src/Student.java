public class Student {

    String firstName;
    String lastName;
    String group;
    Double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getScholarship(){
        if (averageMark == 5) {
            return 20000;
        } else if (averageMark < 5) {
            return 18000;
        } else {
            return 0;
        }
    }
}
