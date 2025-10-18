 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        


        Scanner scanner = new Scanner(System.in);
        Atleta atleta = null; // Inicialmente, não há atleta cadastrado

        int opcao;
        do {
            // Menu interativo
            System.out.println("\n--- Sistema de Gerenciamento de Atletas ---");
            System.out.println("1. Cadastrar novo atleta");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Verificar categoria");
            System.out.println("4. Atualizar informações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Cadastrar novo atleta
                    System.out.print("\nNome do atleta: ");
                    String nome = scanner.nextLine();
                    System.out.print("Modalidade: ");
                    String modalidade = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();

                    atleta = new Atleta(nome, modalidade, idade, peso, altura);
                    System.out.println("\nAtleta cadastrado com sucesso!");
                    break;

                case 2:
                    // Calcular IMC
                    if (atleta != null) {
                        System.out.printf("\nIMC do atleta: %.2f\n", atleta.calcularIMC());
                    } else {
                        System.out.println("\nNenhum atleta cadastrado ainda.");
                    }
                    break;

                case 3:
                    // Verificar categoria
                    if (atleta != null) {
                        System.out.println("\nCategoria do atleta: " + atleta.classificarCategoria());
                    } else {
                        System.out.println("\nNenhum atleta cadastrado ainda.");
                    }
                    break;

                case 4:
                    // Atualizar informações
                    if (atleta != null) {
                        System.out.println("\nAtualizando informações...");
                        System.out.print("Novo nome (atual: " + atleta.getNome() + "): ");
                        atleta.setNome(scanner.nextLine());
                        System.out.print("Nova modalidade (atual: " + atleta.getModalidade() + "): ");
                        atleta.setModalidade(scanner.nextLine());
                        System.out.print("Nova idade (atual: " + atleta.getIdade() + "): ");
                        atleta.setIdade(scanner.nextInt());
                        System.out.print("Novo peso (kg) (atual: " + atleta.getPesoEmKg() + "): ");
                        atleta.setPesoEmKg(scanner.nextDouble());
                        System.out.print("Nova altura (m) (atual: " + atleta.getAlturaEmMetros() + "): ");
                        atleta.setAlturaEmMetros(scanner.nextDouble());
                        System.out.println("\nInformações atualizadas com sucesso!");
                    } else {
                        System.out.println("\nNenhum atleta cadastrado ainda.");
                    }
                    break;

                case 5:
                    System.out.println("\nSaindo do sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

       


    
   