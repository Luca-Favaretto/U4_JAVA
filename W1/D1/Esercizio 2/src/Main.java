import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Esercizio 2");

    Scanner scanner = new Scanner(System.in);
    String inputTerminal1= scanner.nextLine();
    String inputTerminal2= scanner.nextLine();
    String inputTerminal3= scanner.nextLine();

        System.out.println(inputTerminal1+ inputTerminal2+inputTerminal3);
        System.out.println(inputTerminal3+inputTerminal2+inputTerminal1);


    }
}
