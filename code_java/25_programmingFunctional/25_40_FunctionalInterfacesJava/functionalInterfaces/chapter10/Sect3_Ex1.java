import java.util.Comparator;
import java.util.function.Function;

public class Sect3_Ex1 {
    public static void main(String[] args) {
        Function<Student, Double> gpaKey = x -> x.gpa;

        Comparator<Student> byGpa = Comparator.comparing(gpaKey);

        Student s1 = new Student("Larry", 1000, 3.82);
        Student s2 = new Student("Libby", 1001, 3.76);
        System.out.println(byGpa.compare(s1, s2));
    }
}