package teste.dio;

/*
* Classe preicipal dos exercícios da Aula 1 de Métodos.
*/

import jdk.swing.interop.SwingInterOpUtils;

public class main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.dividido(5, 2.5);


         //  Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        //   Empréstimo
        System.out.println("Exercícios empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,  5);

    }
}
