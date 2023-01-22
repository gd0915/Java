package question_bank.if_statement;

public class ifStatement_Q07 {
    /*
    Type code to check the grammatical rules for full name
     a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
     b) Your code should print "First name or last name missed" for single words like
     "Ali" or "Can" or "ali"
     c) Your code should print "Format error" for all the format like "ALI CAN"
     d) Your code should print "Name was not entered" for one or more space
     characters like " " or " "
     e) Your code should print "Invalid Name" if the name has any character different
     from letters and space.
     Note: If the abbreviation has more than 1 error all related error messages should be
     printed. For example; for "ali3" your code should print "Error in initials", "First name
     or last name missed", and "Invalid Name"
     */

    public static void main(String[] args) {

        String fullName="ali can";

        String initialOfFirstName = fullName.substring(0,1);
        Integer indexOfSpace = fullName. trim().indexOf(' ');
        String initialOfLastName = fullName.substring(indexOfSpace+1,indexOfSpace+2);
        Boolean isFirstNameInitialUpperCase = (initialOfFirstName.charAt(0)>='A' && initialOfFirstName.charAt(0)<='Z');
        Boolean isLastNameInitialUpperCase = (initialOfLastName.charAt(0)>='A' && initialOfLastName.charAt(0)<='Z');

        if(indexOfSpace==-1){
            System.out.println("First name or last name missed");
        }
        if(!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase){
            System.out.println("Error in initials");
        }
        if(fullName.equals(fullName.toUpperCase())){
            System.out.println("Format error");
        }
        if(fullName.replaceAll("\\s","").length()==0){
            System.out.println("Name was not entered");
        }
        if(fullName.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Invalid Name");
        }


    }
}
