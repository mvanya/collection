import java.util.*;

public class StudentService {
    private final NavigableSet<Student> studList = new TreeSet<>(new StudentComparator().thenComparing(new StudentAgeComparator()));

    public void add() throws StudentAlreadyExistException, FavoriteSubjectAlarm {
        String fullName = Main.scr.nextLine();
        String age = Main.scr.nextLine();
        String numberClass = Main.scr.nextLine();
        String value = Main.scr.nextLine();
        try {
            FavoriteSubject favoriteSubject = FavoriteSubject.valueOf(value);
            if (!studList.add(new Student(fullName, age, numberClass, favoriteSubject))) {
                throw new StudentAlreadyExistException("The student is already in the database");
            }
        } catch  (IllegalArgumentException ex) {
        throw new FavoriteSubjectAlarm("Favorite subject doesn't have: " + value);
        }
    }
    public void ascending() {
        System.out.println(studList);
    }
    public void descending() {
        System.out.println(studList.descendingSet());
    }
    public void delete() {
        String fullName = Main.scr.nextLine();
        String age = Main.scr.nextLine();
        String numberClass = Main.scr.nextLine();
        FavoriteSubject favoriteSubject = FavoriteSubject.valueOf(Main.scr.nextLine());
        studList.remove(new Student(fullName, age, numberClass, FavoriteSubject.MATHS));
    }
    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
    }
    static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}
