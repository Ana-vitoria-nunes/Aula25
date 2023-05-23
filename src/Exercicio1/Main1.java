package Exercicio1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Azul1 azul1=new Azul1();
        System.out.println("A cor disponiver é "+Azul1.NOME);
        System.out.println("1-Azul escuro.\n2-Azul claro.");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Quantas tonalidades deseja aumentar?");
        int resposta= scanner.nextInt();

        int tonalidade1=1;
        for (int i=0;i<resposta;i++) {

            System.out.println("Você gostaria de aumentar a tonalidade do azul 1 ou 2? ");
            int resposta1 = scanner.nextInt();
            if (resposta1 == 1) {
                azul1.tonalidade++;
            } else if (resposta1 == 2) {
                 tonalidade1++;
            }
            else {
                i--;
                System.out.println("Opção inválida!!");
            }
        }
        System.out.println(Azul1.NOME + "-" + Azul1.cor + " tem a tonalidade " + azul1.getTonalidade());


        Azul1.cor+=1;
        System.out.println(Azul1.NOME +"-"+Azul1.cor + " tem a tonalidade "+tonalidade1);

    }
}
