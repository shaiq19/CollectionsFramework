import java.util.HashSet;
import java.util.Set;

public class  LearnSet {

    public static void main(String[] args) {



        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);


       /* Set<Integer> set = new HashSet<>();// Set<Integer> set = new LinkedHashSet<>();order is same and unique element and  complexity is o(n) //  Set<Integer> set = new TreeSet<>(); element is unique and sorted implemented on binery search tree that is why complexity is o(logn)

        set.add(3);
        set.add(2);
        set.add(342);
        set.add(3254);
        set.add(325454);

        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);*/




    }
}
