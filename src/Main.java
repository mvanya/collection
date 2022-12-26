import java.util.Arrays;
import java.util.Scanner;
public class Main {
    protected static final Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
                try {
                    Menu.menuPrint();
                    flag = Menu.menuChoice(Integer.parseInt(scr.nextLine()));
                } catch (StudentAlreadyExistException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                } catch (FavoriteSubjectAlarm ex) {
                    System.out.println(ex.getMessage());
                    System.out.println(Arrays.toString(FavoriteSubject.values()));
                }
        }
        }
    }


