package Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String phoneNumber, String surname) {
        phoneBook.put(phoneNumber, surname);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, String> record : phoneBook.entrySet()) {
            if (record.getValue().equals(surname)) {
                res.add(record.getKey());
            }
        }
        return res;
    }
}
