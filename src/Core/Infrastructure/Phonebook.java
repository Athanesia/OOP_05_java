package src.Core.Infrastructure;  

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  

import src.Core.Models.Contact;  

public class Phonebook {  

    private List<Contact> contacts;  

    public Phonebook() {  
        contacts = new ArrayList<Contact>();  
    }  

    // create  
    public boolean add(Contact contact) {  
        boolean flag = false;  
        if (!contacts.contains(contact)) {  
            contacts.add(contact);  
            flag = true;  
        }  
        return flag;  
    }  

    public Contact getContact(int index) {  
        return contains(index) ? contacts.get(index) : null;  
    }  

    public boolean update(Contact contact) {  
        boolean flag = false;  
        int index = contacts.indexOf(contact);  
        if (index != -1) {  
            contacts.set(index, contact);  
            flag = true;  
        }  
        return flag;  
    }  

    public boolean remove(Contact contact) {  
        boolean flag = false;  
        if (contacts.indexOf(contact) != -1) {  
            contacts.remove(contact);  
            flag = true;  
        }  
        return flag;  
    }  

    public List<Contact> search(String query) {  
        List<Contact> result = new ArrayList<Contact>();  
        for (Contact contact : contacts) {  
            if (contact.getName().contains(query) && contact.getPhone().contains(query) && contact.getAddress().contains(query)) {  
                result.add(contact);  
            }  
        }  
        return result;  
    }  

    public void importFromCSV(String filename) {  
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] parts = line.split(",");  
                Contact contact = new Contact(parts[0], parts[1], parts[2]);  
                add(contact);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

    public void exportToCSV(String filename) {  
        try (FileWriter writer = new FileWriter(filename)) {  
            for (Contact contact : contacts) {  
                writer.write(contact.getName() + "," + contact.getPhone() + "," + contact.getAddress() + "\n");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

    private boolean contains(int index) {  
        return contacts != null && contacts.size() > index;  
    }  

    public List<Contact> getContacts() {  
        return contacts;  
    }  

    public int count() {  
        return contacts.size();  
    }  
    
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;  
    }
}