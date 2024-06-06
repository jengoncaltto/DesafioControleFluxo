package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int parametroUm = scan.nextInt();
        System.out.println("Insira o primeiro numero: ");
        int parametrDois = scan.nextInt();

        try {
            contar(parametroUm, parametrDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
            for (int i = 1; i < contagem+1; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
