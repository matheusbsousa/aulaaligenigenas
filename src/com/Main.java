package com;

public class Main {
    public static void main(String[] args) {

        //Executar um código que para o fluxo do while caso uma condição seja alcançada dentro do while
        int numero = 0;

        while (false) {

            System.out.println("Ainda não parei de executar");

            if(numero > 10){
                System.out.println("Parei de executar");
                break;
            }

            numero++;
        }


    }
}
