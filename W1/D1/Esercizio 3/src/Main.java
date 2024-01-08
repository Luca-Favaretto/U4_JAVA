//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 3");


System.out.println(perimetroRettangolo(2,3));
System.out.println(perimetroTriangolo(4,5,6 ));
    }
    public static int perimetroRettangolo( int lunghezza, int altezza){
        return lunghezza*altezza*2;


    }
    public static int pariDispari(int num){

        if(num % 2 == 0){
            return  0;

        }else {
            return 1;
        }

    }
    public static double perimetroTriangolo(int a, int b,int c){
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;

    }
}