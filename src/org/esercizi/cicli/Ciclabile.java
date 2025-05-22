package org.esercizi.cicli;

public class Ciclabile {

    private int[] intArray;

    //Inizializzo il contatore a 0, come tutte le variabili di istanza meglio privatizzarlo come l'array sopra
    private int contatore = 0;
    

    public Ciclabile(int[] intArray){

        this.intArray = intArray;

    }


    public int getElementoSuccessivo(){
        //Usiamo il contatore come indice dell'elemento che poi vogliamo tornare e lo chiamiamo x. Ovviamente un intero tipizzato perchè tali sono gli elementi dell'array
        int x = intArray[contatore];   
        //Dobbiamo incrementare il contatore se vogliamo che poi ci restituisca l'elemento successivo nell'array
        contatore += 1;

        //Questo if funziona come reset per reimpostare il contatore a 0 nel momento in cui raggiungiamo il limite dell'array
        if (contatore > intArray.length - 1) {

            contatore = 0;

        }

        return x;
    
    };

    public boolean hasAncoraElementi() {
        //Nel successivo blocco if uso il contatore per capire se sono arrivato all'ultimo elemento oppure no. Se vi sono arrivato semplicemente ritornerò false

        return contatore < intArray.length;
        
    }
    
}
