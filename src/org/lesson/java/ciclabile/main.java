package org.lesson.java.ciclabile;

public class main {
public static void main(String[] args) {


//   creo un ogetto con un array di interi  
Ciclabile arrayProva = new Ciclabile(new int [] {1,20,4,12});


// creo ciclo while con parametro di verità il metodo per controllare se ho un nuovo elemento
while(arrayProva.isElemento()){
    System.out.println(arrayProva.prossimoElemento());
}

// BONUS
// creo l'array usando il costruttore vuoto
Ciclabile arrayBonus = new Ciclabile();

// aggiungo interi al nuovo array
arrayBonus.addElemento(10);
arrayBonus.addElemento(6);
arrayBonus.addElemento(8);
// creo un ciclo while come sopra per vedere se gli elementi inseriti sono stati inseriti
while(arrayBonus.isElemento()){
    System.out.println(arrayBonus.prossimoElemento());
}




}
}
