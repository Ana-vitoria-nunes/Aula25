package Exercico2;

import Exercicio1.Azul;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario("Ana",1200,"2022-05-15");
        Funcionario funcionario1=new Funcionario();
        Funcionario funcionario2=new Funcionario();
        Funcionario funcionario3=new Funcionario();

        funcionario1.setNome("Roberta");
        funcionario1.setSalario(1600);
        funcionario1.setDataAdimissao("2022-08-04");
        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("Salário: "+funcionario1.getSalario());
        System.out.println("Data de adimissao: "+funcionario1.getDataAdimissao());
        System.out.println("---------------------------------------");

        funcionario2.setNome("Pablo");
        funcionario2.setSalario(2000);
        funcionario2.setDataAdimissao("2021-05-10");
        System.out.println("Nome: "+funcionario2.getNome());
        System.out.println("Salário: "+funcionario2.getSalario());
        System.out.println("Data de adimissao: "+funcionario2.getDataAdimissao());
        System.out.println("---------------------------------------");

        funcionario3.setNome("Aline");
        funcionario3.setSalario(3500);
        funcionario3.setDataAdimissao("2019-09-23");
        System.out.println("Nome: "+funcionario3.getNome());
        System.out.println("Salário: "+funcionario3.getSalario());
        System.out.println("Data de adimissao: "+funcionario3.getDataAdimissao());
        System.out.println("---------------------------------------");

        System.out.println("Indentificador: "+Funcionario.indentificador);
    }
}