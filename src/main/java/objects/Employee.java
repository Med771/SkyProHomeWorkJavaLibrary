package objects;

import java.util.Objects;

public final class Employee {
    // Init
    private final String firstName;
    private final String lastName;

    // Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Base methods
    @Override
    public String toString() {
        if (firstName != null && lastName != null) {
            return firstName + " " + lastName;
        }

        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
