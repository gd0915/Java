package question_bank.string_manipulations;

public class StringManipulations_Q16 {
    /*
        Type code to get initials of the first name and the last name of a given name. Middle name
        is out of scope.
        Example: Tom Hanks ==> TH, Mary Star ==> MS
            */


    public static void main(String[] args) {

        String str = "Tom Hanks";
        String initialLastName = str.split(" ")[1].substring(0,1);
        String initialFirstName = str.substring(0,1);
        System.out.println("Initials of the first name and the last name: " + (initialFirstName+initialLastName));











    }
}