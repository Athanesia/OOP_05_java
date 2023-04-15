package src.UI;

import src.Core.MVP.View;
import src.Core.Infrastructure.Phonebook;

import java.util.Scanner;

public class NewConsoleView implements View {
Scanner in;
public NewConsoleView() {
    in = new Scanner(System.in);
}

@Override
public String getFirstName() {
    System.out.print("Имя: ");
    return in.nextLine();
}

@Override
public void setFirstName(String value) {
    System.out.printf("Имя: %s\n", value);
}

@Override
public String getLastName() {
    System.out.print("Фамилия: ");
    return in.nextLine();
}

@Override
public void setLastName(String value) {
    System.out.printf("Фамилия: %s\n", value);
}

@Override
public String getDescription() {
    System.out.print("Описание: ");
    return in.nextLine();
}

@Override
public void setDescription(String value) {
    System.out.printf("Описание: %s\n", value);
}

@Override
public void displayError(String message) {
    System.out.println("Ошибка: " + message);
}

@Override
public void showContactNotFoundMessage(String message) {
    System.out.println("Контакт не найден: " + message);
}

@Override
public void setContactList(Phonebook phonebook) {
    // Реализуйте метод здесь
}

@Override
public void displayMessage(String message) {
    System.out.println(message);
}

@Override
public void clearForm() {
    // Реализуйте метод здесь
}
}