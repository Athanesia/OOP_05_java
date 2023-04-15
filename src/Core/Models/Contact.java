package src.Core.Models;

import java.time.LocalDate;

public class Contact implements Comparable<Contact> {
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    public String email;
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public Contact(String firstName, String lastName, String company, String phone, String email, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.description = description;
    }

    // getter and setter methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // implement Comparable interface
    @Override
    public int compareTo(Contact o) {
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) obj;
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)
                && this.company.equals(other.company) && this.phone.equals(other.phone)
                && this.email.equals(other.email) && this.description.equals(other.description);
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getAddress() {
        return this.company + " " + this.description;
    }
}