package JavaCore.lesson4;

import java.util.ArrayList;

public abstract class Person implements Comparable<Person> {
    private String name;
    private String phone;
    ArrayList<String> array = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
