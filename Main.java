import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> students =
                new ArrayList<>();

        students.add("Ivan");

        students.add("Alex");

        students.add("Maria");

        students.add("Dmitry");

        System.out.println(
                "Список студентов:"
        );

        for (String s : students) {

            System.out.println(s);
        }

        System.out.println(
                "\nКоличество элементов: "
                        + students.size()
        );

        students.remove("Alex");

        System.out.println(
                "\nПосле удаления:"
        );

        for (String s : students) {

            System.out.println(s);
        }

        if (students.contains("Ivan")) {

            System.out.println(
                    "\nIvan найден в списке"
            );
        }
    }
}