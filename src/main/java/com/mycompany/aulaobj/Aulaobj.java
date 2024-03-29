
package com.mycompany.aulaobj;

import java.util.Scanner;

public class Aulaobj {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       aula a1 = new aula();
       
       a1.horario = "7 as 10";
       a1.local = "senac tramadai";
       a1.informacoes();
       System.out.println(" voce foi a aula? ");
       boolean hora3 = a1.presenca();
       a1.hora2 = hora3;
       
       
       
    }
}
