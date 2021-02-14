package JavaCore.lesson4;

public abstract class PhonebookAction {
    public static void main(final String[] args) {
        System.out.println("Создаем телефонную книгу.");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------------------------------------");

        System.out.println("Добавляем данные.");
        phonebook.add("Piotr", "123456");
        phonebook.add("Elena", "122256");
        phonebook.add("Piotr", "723455");
        phonebook.add("Vadim", "123555");
        phonebook.add("Misha", "123456");
        phonebook.add("Elena", "125896");
        phonebook.add("Anna", "555555");
        phonebook.add("Yaroslav", "111456");
        System.out.println("-----------------------------------------------");

        System.out.println("Извлекаем номера.");
        System.out.println("Vadim");
        System.out.println(phonebook.get("Vadim"));
        System.out.println("Yaroslav");
        System.out.println(phonebook.get("Yaroslav"));
        System.out.println("Anna");
        System.out.println(phonebook.get("Anna"));
        System.out.println("-----------------------------------------------");

        System.out.println(phonebook.get("Piotr"));

        }
}
