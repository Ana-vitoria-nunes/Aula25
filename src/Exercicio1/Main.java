package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Azul azul=new Azul(2);
        System.out.println(Azul.NOME+""+" com tonalidade "+azul.getTonalidade());
        azul.setTonalidade(3);
        System.out.println(Azul.NOME+" com tonalidade "+azul.getTonalidade());

        Azul azulEscuro=new Azul(5);
        System.out.println(Azul.NOME+" com tonalidade "+azulEscuro.getTonalidade());

        Azul azulClaro=new Azul(4);
        System.out.println(Azul.NOME+" com tonalidade "+azulClaro.getTonalidade());

    }
}