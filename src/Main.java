import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("Gerenciamento de Tarefas Empresariais \uD83D\uDE0E");
        System.out.println("==================================");


        Tasks task1 = createTask(scanner, 1);
        Tasks task2 = createTask(scanner, 2);
        Tasks task3 = createTask(scanner, 3);
        Tasks task4 = createTask(scanner, 4);
        Tasks task5 = createTask(scanner, 5);

        //Show data of the assigned tasks
        task1.showData();
        task2.showData();
        task3.showData();
        task4.showData();
        task5.showData();

        scanner.close();
    }

        // Auxiliar method to read and validate the status
        private static String readStatus(Scanner scanner) {
            String status;
            while (true) {
                System.out.print("Digite o status (Concluída/Pendente): ");
                status = scanner.nextLine();

                if (status.equalsIgnoreCase("Concluída") || status.equalsIgnoreCase("Pendente")) {
                    break;
                } else {
                    System.out.println("⚠️ Status inválido! Digite apenas 'Concluída' ou 'Pendente'.");
                }
            }
            return status;
        }

        // Auxiliar method to create tasks by the scan of each other
        public static Tasks createTask(Scanner scanner, int numero) {
            System.out.println("\n--- Cadastro da Tarefa " + numero + " ---");

            System.out.print("Descrição: ");
            String description = scanner.nextLine();

            System.out.print("Responsável: ");
            String manager = scanner.nextLine();

            System.out.print("ID do responsável: ");
            int id_manager = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Seção/Área da empresa: ");
            String section = scanner.nextLine();

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Prazo limite (dia/mês/ano): ");
            String stringDate = scanner.nextLine();

            LocalDate time_limit = LocalDate.parse(stringDate, dateFormat);

            System.out.print("Status inicial (Concluída/Pendente): ");
            String status = readStatus(scanner);

            System.out.print("Deseja mudar o status (Sim/Não)? ");
            String changedStatus = scanner.nextLine();

            if (changedStatus.equalsIgnoreCase("Sim")) {
                System.out.print("Novo status (Concluída/Pendente): ");
                status = readStatus(scanner);
            }

            return new Tasks(description, time_limit, status, manager, section, id_manager);
        }
    }