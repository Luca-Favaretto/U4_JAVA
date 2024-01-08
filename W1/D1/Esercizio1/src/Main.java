import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");

        int prodotto= moltiplicazione(4,4);
        String frase = "Il prodotto è : ";

        String fraseConcatenata = concatena(frase , prodotto);


            System.out.println(fraseConcatenata);

        String[] arr = inserisciInArray(new String[]{"A", "B", "C", "E", "F"}, "D");

        System.out.println(Arrays.toString(arr));

    }
    public static int moltiplicazione(int a,int b){
        return a*b;
    }

    public static String concatena(String stringa, int a){
        return stringa + a;
    }

    public static String[] inserisciInArray( String[] stringArray ,String str){
        String[] newArray = new String[6];
        newArray[0] = stringArray[0];
        newArray[1] = stringArray[1];
        newArray[2] = stringArray[2];
        newArray[3] = str;
        newArray[4] = stringArray[3];
        newArray[5] = stringArray[4];
        return newArray;

    }


}