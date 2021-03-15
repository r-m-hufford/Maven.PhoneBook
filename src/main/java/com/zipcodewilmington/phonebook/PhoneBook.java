package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */

public class PhoneBook {

    private final Map<String, List<String>> phoneBook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {
        this.phoneBook = new LinkedHashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> numbers = new ArrayList<String>(Arrays.asList(phoneNumbers));
        phoneBook.put(name, numbers);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phoneBook.containsKey(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phoneBook.get(name);
    }
    public String reverseLookup(String phoneNumber)  {

        for (String name : phoneBook.keySet()) {
            if (phoneBook.get(name).contains(phoneNumber)) {
                return name;
            }
        }
        return null;
    }


    public List<String> getAllContactNames() {
        return new ArrayList<>(phoneBook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return phoneBook;
    }
}
