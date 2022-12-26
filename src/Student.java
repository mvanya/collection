import java.util.Objects;

public class Student {
    private String fullName;
    private String age;
    private String numberClass;
    private FavoriteSubject favoriteSubject;
    public Student(String fullName, String age, String numberClass, FavoriteSubject favoriteSubject) {
        this.fullName = fullName;
        this.age = age;
        this.numberClass = numberClass;
        this.favoriteSubject = favoriteSubject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(String numberClass) {
        this.numberClass = numberClass;
    }

    public FavoriteSubject getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(FavoriteSubject favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberClass='" + numberClass + '\'' +
                ", favoriteSubject=" + favoriteSubject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fullName, student.fullName) && Objects.equals(age, student.age) && Objects.equals(numberClass, student.numberClass) && favoriteSubject == student.favoriteSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, numberClass, favoriteSubject);
    }
}
