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



   }