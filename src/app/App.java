package app;

import taxas.Pessoas;
import taxas.PessoasFisica;
import taxas.PessoasJuridicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoas> list = new ArrayList<>();
        String nome;
        double rendaAnual;
        double gastoComSaude;
        int numDeFuncionarios;
        int p;
        System.out.println("Quantidade de pessoas: ");
        p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            System.out.println("Taxa da pessoa #" + i + ": \n" +
                    "Pessoa Fisica ou Juridica: (f/j)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'f') {
                System.out.println("Nome: ");
                nome = sc.next();
                System.out.println("Valor da renda atual: ");
                rendaAnual = sc.nextDouble();
                System.out.println("Valor gasto com saúde: ");
                gastoComSaude = sc.nextDouble();
                list.add(new PessoasFisica(nome, rendaAnual, gastoComSaude));
            } else {
                System.out.println("Nome: ");
                nome = sc.next();
                System.out.println("Valor da renda atual: ");
                rendaAnual = sc.nextDouble();
                System.out.println("Quantidade de funcionarios: ");
                numDeFuncionarios = sc.nextInt();
                list.add(new PessoasJuridicas(nome, rendaAnual, numDeFuncionarios));
            }
        }
        System.out.println("Taxa pessoas: ");
        for (Pessoas pessoas : list) {
            System.out.println(pessoas.imposto());
        }
        sc.close();
    }
}
