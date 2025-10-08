package coontrole_de_fluxo;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            String nome = validarNome(scanner, "nome ");
            String sobrenome = validarNome(scanner, "sobrenome ");
            System.out.println("Digite sua idade"); // exceçaõ para capturar apenas int
            int idade = scanner.nextInt();
            System.out.println("Digite sua altura"); // exceçaõ para capturar apenas double
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("\n✅ Cadastro realizado com sucesso!\n");
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase()); //
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e) { // se digitar letras, onde se espera um numero
            System.err.println("Erro: tipo de dado inválido. Verifique se você digitou número corretamente.");
        } catch (Exception e) { // pega outro erro inesperado
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    // metedo para ler e validar nome, e sobrenome.
    private static String validarNome(Scanner scanner, String campo) {
        while (true) {
            System.out.printf("Digite seu %s: ", campo);
            String entrada = scanner.next();

            if (entrada.trim().isEmpty()) {
                System.out.println("O campo não pode estar vazio.");
            } else if (!entrada.matches("[a-zA-ZçÇáéíóúãõâêîôûÁÉÍÓÚÃÕÂÊÎÔÛ]+")) {
                System.out.println("❗ Use apenas letras. Números e símbolos não são permitidos.");
            } else if (entrada.length() < 2) {
                System.out.println("\"❗ O \" + campo + \" precisa ter pelo menos 2 letras.\"");
            } else {
                return entrada;
            }
        }
    }
}
