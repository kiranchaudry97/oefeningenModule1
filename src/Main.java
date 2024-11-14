
//E1: loops en selecties
// code waarmee je alle even getallen tussen 36 en 60 kan afdrukken.
// Maak hiervoor gebruik van een for loop.


public static void main(String[] args) {

    for(int teller = 36; teller <= 60; teller++){
        if(teller % 4 != 0){

            continue;
        }
        System.out.println(teller);
    }
}

