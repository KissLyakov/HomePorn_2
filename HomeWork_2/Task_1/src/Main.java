public class Main {
    public static void main(String[] args) {
        Student Num1 = new Aspirant("Иван","Иванов","Крови",1.1);
        System.out.printf("Аспирант %s %s из группы %s. Средняя оценка %.1f  %n", Num1.firstName, Num1.lastName, Num1.group, Num1.averageMark);

        System.out.println("Массив: ");
        Student[] students = new Student[2];
        students[0] = new Student("Пётр","Петров","КС-122", 5.0);
        students[1] = new Aspirant("Александр","Александров","ИКС-320",4.5);
        for (int i = 0; i < 2; i++) {
            System.out.printf("Учащийся %s %s из группы %s. Средняя оценка %.1f. Стипендия: %.0f. %n", students[i].firstName, students[i].lastName, students[i].group, students[i].averageMark, students[i].getScholarship());

        }

    }
}


