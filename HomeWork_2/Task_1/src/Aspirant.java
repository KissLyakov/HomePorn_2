public class Aspirant extends Student {
    boolean scienceWork;

    public Aspirant(String firstName, String lastName, String group, Double averageMark){
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        if (averageMark == 5) {
            return 20000;
        } else if (averageMark < 5) {
            return 18000;
        } else {
            return 0;
        }
    }
}

