public class Menu {

    private static final StudentService s = new StudentService();
    protected static void menuPrint() {
        System.out.println("Menu:");
        System.out.println("1. Add student");
        System.out.println("2. List all students in ascending order");
        System.out.println("3. List all students in descending order");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
    }

    protected static boolean menuChoice(int menu) throws StudentAlreadyExistException, FavoriteSubjectAlarm {
        switch (menu) {
            case 1:
                System.out.println("Enter full name, age, number class and subject in UPPER case: ");
                s.add();
                return true;
            case 2:
                s.ascending();
                return true;
            case 3:
                s.descending();
                return true;
            case 4:
                System.out.println("Enter full name, age, number class: ");
                s.delete();
                return true;
            case 5:
                System.out.println("bye");
                return false;
            default:
                return true;
        }
    }
}
