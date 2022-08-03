import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника - %s\n", fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase(Locale.ROOT));

        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е" ));
    }
}