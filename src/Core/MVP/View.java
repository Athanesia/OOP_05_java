package src.Core.MVP;

import src.Core.Infrastructure.Phonebook;

public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    void displayError(String message);
    void showContactNotFoundMessage(String message);
    void setContactList(Phonebook phonebook);
    void displayMessage(String message);
    void clearForm();
}