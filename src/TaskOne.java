import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
        askForData();
    }

    private static void askForData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name, please 🙂 ");
        String name = input.next();

        System.out.println("Please enter your age. ");
        Integer age = input.nextInt();

        input.nextLine(); //To get rid of the \n not consumed by nextInt()

        System.out.println("What is your favorite programming language? ");
        String favLanguage = input.nextLine();

        System.out.print("How many years have you been coding in this language? ");
        Integer experience = input.nextInt();

        String commentAboutProgrammingLanguage;
        if (experience < 10) {
           Integer futureYear = 10 - experience + 2025;
            commentAboutProgrammingLanguage = "In the year " + futureYear + " you will have 10 years of coding ";
        } else {
            commentAboutProgrammingLanguage = "You have a loooooot of ";
        }

        System.out.println("\nWelcome, " + name + "(" + age + ")." + commentAboutProgrammingLanguage + "experience with " + favLanguage + ".");
    }
}
