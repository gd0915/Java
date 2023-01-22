package selfpractices.selfpractice_polymorphism;

public class Main {

    public static void main(String[] args) {

        Contact contactOne = new Contact("John", new PhoneNumber("1234567890"));
        Contact contactTwo = new Contact("Lily Doe", new PhoneNumber(49, "1234567890"));
        Contact contactThree = new Contact("Tom Hanks", new PhoneNumber("2345678901"));
        Contact contactFour = new Contact("Brad Pitt", "bd@gmail.com");
        Contact contactFive = new Contact("Matt Damon", new PhoneNumber("3456789012"), "md@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
    }
}
