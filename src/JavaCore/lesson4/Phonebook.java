package JavaCore.lesson4;

import java.util.TreeMap;

public class Phonebook extends TreeMap<String, String> {
    public void add(final String name, final String phone) {
        this.put(name, phone);
    }

    public String get(final String name, final String phone) {
        return phone;
    }
}
