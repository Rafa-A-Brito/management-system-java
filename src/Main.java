import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("Gerenciamento de Tarefas Empresariais \uD83C\uDFE2)");
        System.out.println("==================================");

        System.out.print("Informe o nome da empresa: ");
        String enterprise_name = scanner.nextLine();

        Tasks task1 = createTask(scanner, 1, enterprise_name);
        Tasks task2 = createTask(scanner, 2, enterprise_name);
        Tasks task3 = createTask(scanner, 3, enterprise_name);
        Tasks task4 = createTask(scanner, 4, enterprise_name);
        Tasks task5 = createTask(scanner, 5, enterprise_name);

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
                System.out.print("Status (Concluída/Em preparo/Pendente): ");
                status = scanner.nextLine();

                if (status.equalsIgnoreCase("Concluída") || status.equalsIgnoreCase("Pendente")
                        || status.equalsIgnoreCase("Em preparo")) {
                    break;
                } else {
                    System.out.println("⚠️ Status inválido! Digite novamente.");                }
            }
            return status;
        }

        // Auxiliar method to create tasks by the scan of each other
        public static Tasks createTask(Scanner scanner, int id_task, String enterprise_name) {

            System.out.println("\n--- Cadastro da Tarefa " + id_task + " ---");

            System.out.print("Descrição: ");
            String description = scanner.nextLine();

            System.out.print("Responsável: ");
            String manager = scanner.nextLine();

            System.out.print("ID do responsável: ");
            int id_manager = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Seção/Área da empresa: ");
            String section = scanner.nextLine();

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
            LocalDate time_limit;

            while (true) {
                System.out.print("Prazo limite (dd/MM/yyyy): ");
                String stringDate = scanner.nextLine().trim();

                try {
                    time_limit = LocalDate.parse(stringDate, dateFormat);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida! Digite novamente no formato dd/MM/yyyy.");
                }
            }

            String status = readStatus(scanner);

            System.out.print("Deseja mudar o status (Sim/Não)? ");
            String changedStatus = scanner.nextLine();

            if (changedStatus.equalsIgnoreCase("Sim")) {
                status = readStatus(scanner);
            }
            return new Tasks(description, time_limit, status, manager, section, enterprise_name, id_manager, id_task);
        }
    }