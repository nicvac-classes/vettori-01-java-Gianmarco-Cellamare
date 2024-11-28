//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        String [] v = new String [5];
        v[0] = "Matt";
        v[1] = "Chris";
        v[2] = "Dom";
        v[3] = "Adele";
        v[4] = "Celine";

        String [] v = new String [5];

        int i=0;
        for (i=0 ; i <= 4; i++){
            System.out.println("Inserisci il nome di un cantante: ");nex
            w[i]=in.nextLine();
        }

        int [] x =new int [10];
        for (i=0; i<=9 ;i++){
            x[i] = i+1;
        }

        int[] y = new int [10];
        for (i=0; i<=9 ;i++) {
            y[i] = (i+1) *2;

        }

        System.out.println("Visualizzare solo 3 elementi del vettore V: " +v[0]+ "" +v[2]+ "" +v[4]);
        

        System.out.println("Visualizzare tutti gli elementi dei vettori V, W, X, Y");
        System.out.println("V: ");
        for (i=0; i< v.length(); i++){
            System.out.println(+v[i]+ "");
        }

        System.out.println("W: ");
        for (i=0; i< w.length(); i++){
            System.out.println(+w[i]+ "");
        }

        System.out.println("X: ");
        for (i=0; i< x.length(); i++){
            System.out.println(+x[i]+ "");
        }

        System.out.println("Y: ");
        for (i=0; i< y.length(); i++){
            System.out.println(+y[i]+ "");
        }


        System.out.println("X,solo indici pari");
        for (i=0; i < x.length(); i+=2){
            System.out.println(+x[i]+ "");
        }

        System.out.println("X,solo indici dispari");
        for (i=1; i < x.length(); i+=2){
            System.out.println(+x[i]+ "");
        }

        System.out.println("X,solo valori pari");
        for (i=0; i < x.length(); i++){
            if (x[i] %2 ==0){
                System.out.println(+x[i]+ "");


            }
            
        }

        



        







    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md