package com.OpenBootcamp;


import java.util.Scanner;
//el algoritmo va a contar los digitos de un número entero
public class Practica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero para contar sus digitos");
       //se pregunta el número al usuario, se define como int por si es un valor muy grande
        int numeroPositivo = entrada.nextInt();
        //cero se toma en cuenta como un digito
        int digito = 0;
        if (numeroPositivo == 0){
            digito = 1;
            //en caso que sea un numero negativo se vuelve a pedir que ingrese el numero
        }else{
            while (numeroPositivo < 0){
                System.out.println("ingrese un numero positivo");
                numeroPositivo = entrada.nextInt();
            }
        }
        //si no es ningudo de los casos solo se procede a contar los digitos
        while(numeroPositivo > 0){
            numeroPositivo = numeroPositivo / 10;
            digito = digito + 1;
        }
        //si es un digito o mas
        if (digito == 1){
            System.out.println("el numero ingresado tiene " + digito + " digito");
        }else{
            System.out.println("el numero ingresado tiene " + digito + " digitos");
        }
    }

}


