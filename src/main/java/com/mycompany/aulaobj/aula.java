package com.mycompany.aulaobj;

import java.util.Scanner;

public class aula {

    Scanner teclado = new Scanner(System.in);
    String horario;
    String local;
    boolean hora2;

    void informacoes() {
        System.out.println("sua aula é em : " + this.local);
        System.out.println("e o horario é da :" + this.horario);

    }

    boolean presenca() {
        String resposta;
        resposta = teclado.nextLine().toLowerCase();
        if (resposta.equals("sim")) {
             hora();
            return true;
           
           
        } else if (resposta.equals("nao")) {
            System.out.println("voce ganhou falta");
            return false;

        }
        return presenca();

    }

    void hora() {
        if (this.hora2 = true) {
            atrasado();

        }

    }

    void atrasado() {
        System.out.println("que hora você chegou?");
        int resposta2 = teclado.nextInt();

        if (resposta2 == 7) {
            System.out.println("você chegou em ponto ");

        } else if (resposta2 < 7) {
            System.out.println("voce chegou antes da aula, so esperar sem problemas");

        } else if (resposta2 > 7) {
            System.out.println("voce chegou atrasado, cuide");

        }
    }
}
