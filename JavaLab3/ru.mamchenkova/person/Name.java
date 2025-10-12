package ru.mamchenkova.person;

public final class Name {
    private final String lastname;
    private final String firstname;
    private final String surname;

    public Name(String firstname) {
        this(null, firstname, null);
    }

    public Name(String lastname, String firstname) {
        this(lastname, firstname, null);
    }

    public Name(String lastname, String firstname, String surname) {
        validateAtLeastOneField(firstname, lastname, surname);
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
    }

    private void validateAtLeastOneField(String firstname, String lastname, String surname) {
        boolean hasValidField = false;

        if (firstname != null && !firstname.trim().isEmpty()) {
            hasValidField = true;
        }
        if (lastname != null && !lastname.trim().isEmpty()) {
            hasValidField = true;
        }
        if (surname != null && !surname.trim().isEmpty()) {
            hasValidField = true;
        }

        if (!hasValidField) {
            throw new IllegalArgumentException("Как минимум одно поле должно быть не null и не пустым");
        }
    }

    public String getLastname() { return lastname; }
    public String getFirstname() { return firstname; }
    public String getSurname() { return surname; }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastname != null && !lastname.isEmpty()) {
            result.append(lastname);
        }

        if (firstname != null && !firstname.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(firstname);
        }

        if (surname != null && !surname.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(surname);
        }

        return result.toString();
    }
}
