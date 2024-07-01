import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Activity6_4 {
    public static void main(String[] args) {
        // Create 3 Student objects with appropriate data and varied number of choices
        HashMap<Integer, String> dylanChoices = new HashMap<>();
        dylanChoices.put(1, "AI");
        dylanChoices.put(2, "Web");
        dylanChoices.put(3, "IoT");

        // Student 2: Yuan Ming
        HashMap<Integer, String> ymChoices = new HashMap<>();
        ymChoices.put(1, "AI");
        ymChoices.put(2, "IoT");

        // Student 3: Tasneem
        HashMap<Integer, String> tasneemChoices = new HashMap<>();
        tasneemChoices.put(1, "Web");

        Student dylan = new Student("2345678", 3.56, dylanChoices);
        Student ym = new Student("2345679", 3.99, ymChoices);
        Student tasneem = new Student("2345680", 4.0, tasneemChoices);

        // Create a PriorityQueue to house the 3 student objects, sorted according to
        // GPA
        PriorityQueue<Student> a = new PriorityQueue<Student>(new SortByGPA());
        a.add(dylan);
        a.add(ym);
        a.add(tasneem);

        while(!a.isEmpty()) {
            System.out.println(a.poll());
        }
    }
}

class Student {
    String adm;
    double GPA;
    HashMap<Integer, String> choices;

    public Student(String adm, double GPA, HashMap<Integer, String> choices) {
        this.adm = adm;
        this.GPA = GPA;
        this.choices = choices;
    }

    public HashMap<Integer, String> getChoices() {
        return choices;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", Adm='" + adm + '\'' +
                ", Choices=" + choices +
                '}';

    }

}

class SortByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (Double.compare(s2.GPA, s1.GPA));
    }
}