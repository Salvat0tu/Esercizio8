public class Esercizio8_boolean {
    public static void main(String[] args) {
        // Try to solve on paper the following boolean algebra operations:

        //         [A]: 2 <= 2 && !true
        boolean a = 2<=2 && !true;
        System.out.println(a);
// L'esercizio A da come risposta "false" dato che a non puoò contemporaneamente soddisfare le due condizioni di
//  essere maggiore o uguale a 2 (2<=2) e di essere false (!true)

        //         [B]: !false && 3 > 2
        boolean b =!false && 3 > 2;
        System.out.println(b);
// L'esercizio B da come risposta "true" dato che soddisfa le due condizioni (!false significa true e 3 è maggiore di 2)


        //         [C]: considering that t=false and f=true: !(!t || f)
        boolean t = false;
        boolean f = true;
        System.out.println(!(!t) || f);
// L'esercizio C da come  risultato "true" dato che l'operatore || indica un "oppure" quindi basti che solo una condizione
//  sia soddisfatta per avere il risultato come true

        //         [D]: 6 > 6 ^ !(true && true)
        boolean d = 6 > 6 ^ !(true && true);

        System.out.println(d);
// L'esercizio D da come risultato "false" dato che l'operatore ^ (XOR) richiede che i risultati siano diversi tra loro,
// essendo i due risultati "true" l'operatore comunica che questa condizione non va bene
    }
}