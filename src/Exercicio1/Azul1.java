package Exercicio1;

public class Azul1 {
    static int cor=1;
    public int tonalidade;
    public static String NOME = "Azul";
    public static String NOME1 = "Azul";

    public Azul1() {
        this.tonalidade=1;

    }
    public static String getNome(){
        NOME= String.valueOf(cor);
        return NOME;
    }
    public int getTonalidade() {
        return tonalidade;}

    public void setTonalidade(int tonalidade) {

        this.tonalidade=tonalidade;
    }
    public void tornarMaisEscuro(int tonalidade ) {
        int escuro=tonalidade+1;
    }
    void calcularTonalidade() {

    }
    private void TornarTonalidadeMaisEscura(int valor) {

    }
}
