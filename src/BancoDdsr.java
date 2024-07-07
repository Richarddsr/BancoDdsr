import java.util.Scanner;

public class BancoDdsr {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int saldo = 2500;
        int verificar = 0;
        int opcoes = 0;

        System.out.println("Digite Seu Nome:");
        String nome = leitura.nextLine();
        System.out.println("Bem Vindo ao banco Ddsr! " + nome);
        System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
        while (opcoes != 4) {
            opcoes = leitura.nextInt();
            if (opcoes == 1) {
                System.out.println("Você atualmente possui R$" + saldo);
                System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
            }

            if (opcoes == 4) {
                System.out.println("Obrigado pela preferencia de banco! ;)");
                break;
            }
            if (opcoes == 3) {
                System.out.println("Quanto você deseja receber?");
                int reward = leitura.nextInt();
                int adicionado = saldo = saldo + reward;
                System.out.println("Empréstimo realizado com sucesso! Agora você possui R$" + adicionado);
                System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
            }
            if (opcoes > 4){
                System.out.println("Insira uma opção válida.");
                System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
            }
            if (opcoes == 2) {
                System.out.println("Quanto você deseja depositar?");
                int valor = leitura.nextInt();
                if (saldo >= valor){
                    int subtraido = saldo = saldo - valor;
                    System.out.println("Trasnferencia realizada com sucesso! agora você possui R$" + subtraido);
                    valor = subtraido;
                    System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
                } else {
                    System.out.println("Valor indísponivel");
                    System.out.println("""
                Qual opção você deseja imprimir?
                1 - Verificar saldo
                2 - Realizar Transferenica
                3 - Receber Pix
                4 - Sair
                """);
                }



            }}}}
