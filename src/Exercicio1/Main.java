package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Azul azul=new Azul(2);
        System.out.println(Azul.NOME+" "+Azul.cor+" com tonalidade "+azul.getTonalidade());
        azul.setTonalidade(3);
        Azul.cor+=1;
        System.out.println(Azul.NOME+" "+Azul.cor+" com tonalidade "+azul.getTonalidade());

        Azul azulEscuro=new Azul(5);
        Azul.cor+=1;
        System.out.println(Azul.NOME+" "+Azul.cor+" com tonalidade "+azulEscuro.getTonalidade());

        Azul azulClaro=new Azul(4);
        Azul.cor+=1;
        System.out.println(Azul.NOME+" "+Azul.cor+" com tonalidade "+azulClaro.getTonalidade());

    }
}