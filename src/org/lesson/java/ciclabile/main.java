package org.lesson.java.ciclabile;

public class main {
public static void main(String[] args) {


//   creo un ogetto con un array di interi  
Ciclabile arrayProva = new Ciclabile(new int [] {1,20,4,12});


// creo ciclo while con parametro di verità il metodo per controllare se ho un nuovo elemento
while(arrayProva.isElemento()){
    System.out.println(arrayProva.prossimoElemento());
}




}
}
