import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    // Attributes
    String name;
    String phone;
    String gender;
    int age;
    String dateOfBirth;

    // Constructor - Max information
    Person(String name, String phone, String gender, int age, String dateOfBirth) {
        this.name = name;
        this.phone = phone; // Format: "XXX-XXX-XXXX"
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth; // Format: "MM-DD"
    }

    // Constructor - Minimum information
    Person(String name) {
        this.name = name;
    }

    /***********************
     METHODS
     ***********************/

    // Shows all details of Person
    public void showDetails() {
        System.out.println("---Person Details---");
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phone);
    }

    // Checks if today is person's birthday
    public void isBirthday() {

        // Pulls current date and assigns it to a variable
        LocalDate currentDate = LocalDate.now();

        // Formats date to only show month and date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        String currentMonthDay = currentDate.format(formatter);

        // Prints Today's Date
        System.out.println(currentMonthDay);

        // Checks if today is Person's birthday
        if(currentMonthDay.equals(dateOfBirth)) {
            System.out.printf("It's %s's birthday!", name);
        } else {
            System.out.printf("It's not %s's birthday", name);
        }
    }
}
