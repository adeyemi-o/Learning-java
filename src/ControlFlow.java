import java.util.Scanner;

public class ControlFlow {
    public static void main (String[] args) {
        System.out.println("Pick a number from 1 to 10: ");

        //get an input from the user
        Scanner input = new Scanner(System.in);

        //assign input to variable inputtedNum
        int inputtedNum = input.nextInt();

        //control flow (if-else statement, print a statement dependent on input
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

        //looping
        Scanner value = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take the song off of repeat? if so, answer yes");

            String userInput = input.next();
            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }

}
