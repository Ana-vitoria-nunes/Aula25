package Exercico2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;
    static int indentificador=0;


    public Funcionario(String nome, double salario, String dataAdimissao) {
        //Funcionario.indentificador=Funcionario.indentificador+1;
        Funcionario.indentificador=+1;
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = LocalDate.parse(dataAdimissao);
    }

    public Funcionario() {
        Funcionario.indentificador++;

    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataAdimissao() {
        return dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario<700){
            throw new RuntimeException("Não é permitido colocar salário menor que R$700");
        }
        this.salario = salario;
    }

    public void setDataAdimissao(String dataAdimissao) {
        LocalDate dataAdimissao1=LocalDate.parse(dataAdimissao);
        if (dataAdimissao1.isAfter(LocalDate.now())){
            throw new RuntimeException("A data de adimissão deve ser anterior da data atual.");
        }
        this.dataAdmissao = LocalDate.parse(dataAdimissao);
    }
    public void setIndentificador(int indentificador1){
        indentificador=indentificador1;
    }
    public int getIndentificador(){
        return indentificador;
    }

}
