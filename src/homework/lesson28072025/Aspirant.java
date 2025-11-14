package homework.lesson28072025;

import inheritance.S;

public class Aspirant extends Student {
    String sinceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sinceWork) {
        super(firstName, lastName, group, averageMark);
        this.sinceWork = sinceWork;
    }

    void print(){
        System.out.println(firstName);
    }

    @Override
    public double getScholarship() {
        return averageMark==5?200:180;
    }

    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов",
                "Group1", 4.5);
        Aspirant aspirant1 = new Aspirant("Petr", "Petrov",
                "Group2", 5, "Work1");

        Student aspirant2 = new Aspirant("Petr", "Sidorov",
                "Group2", 4.8, "Work2");
        Student[] students ={student,aspirant1,aspirant2};
        for(Student s:students){
            System.out.println(s.lastName +" "+ s.getScholarship());
        }

    }
}
