package Exercicio1;
public class Azul{
     static int cor=1;
    public int tonalidade;
    public static String NOME = "Azul";
    public Azul(int tonalidade) {
        this.tonalidade=tonalidade;

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
