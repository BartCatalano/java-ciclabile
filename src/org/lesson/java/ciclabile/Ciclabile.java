package org.lesson.java.ciclabile;

public class Ciclabile {
    // mi creo le variabili generiche per l'array e l'index
    int[] elencoElementi;
    int currentIndex;




// creo il costruttore
public Ciclabile(int [] elenco){
    this.elencoElementi = elenco;
    if(this.elencoElementi.length > 0){
        this.currentIndex = 0;}
}

// creo i metodi richiesti

// metodo per prendere il prossimo elemento

public Ciclabile(int i, int j, Object object) {
    //TODO Auto-generated constructor stub
}

public int prossimoElemento(){
    int elemento = elencoElementi[currentIndex];
    this.currentIndex++;
     return elemento;
    }



// metodo per controllare se ci sono altri elementi nell array
public Boolean isElemento (){
    if (elencoElementi.length == 0){
   return false;
}
   return this.currentIndex < this.elencoElementi.length;
   }


//    BONUS
// prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.

// creo il costruttore senza parametri
public Ciclabile(){
    this.elencoElementi = new int[0];
}

// creo metodo per aggiungere un intero all array
public void addElemento(int elementoDaInserire){
    // creo un nuovo array che è della lunghezza del vecchio +1
    int[] nuovoElenco = new int[this.elencoElementi.length +1];
    // faccio un ciclo fro che cicla tutti gli elementi presenti nel vecchio array e li inserisce nel nuovo
    for(int i = 0; i < elencoElementi.length; i++){
        nuovoElenco[i] = this.elencoElementi[i];
    }
    // qui assegno a nuovElenco come valore di elencoElementi
    nuovoElenco[this.elencoElementi.length] = elementoDaInserire;
    this.elencoElementi = nuovoElenco;
}


   }