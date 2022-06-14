package lesson4;

public class AppMain {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Петров", "+79991001456");
        book.add("Захаров", "+71000004787");
        book.add("Васечкин", "+789524562550");
        book.add("Петров", "+79991111456");
        book.add("Захаров", "+71096004787");
        book.add("Захаров", "+71055504787");

        System.out.println("Телефоны Петровых: " + book.get("Петров"));
        System.out.println("Телефоны Захаровых: " + book.get("Захаров"));
        System.out.println("Телефоны Васечкиных: " + book.get("Васечкин"));
    }
}
