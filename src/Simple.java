import java.time.LocalDate;

public class Simple {
    public static void main(String[]args) {

        System.out.println("==================================");
        System.out.println("Gerenciamento de Tarefas Empresariais \uD83C\uDFE2)");
        System.out.println("==================================");

        String enterprise_name = "Microsoft";

        // Task 1
        Tasks task1 = new Tasks();
        task1.setIdTask(1);
        task1.setDescription("Revisar relatórios financeiros");
        task1.setTime(LocalDate.of(2025, 9, 25));
        task1.setStatus("Pendente");
        task1.setManager("João Silva");
        task1.setSection("Financeiro");
        task1.setEnterpriseNae(enterprise_name);
        task1.setIdManager(101);

        // Task 2
        Tasks task2 = new Tasks();
        task2.setIdTask(2);
        task2.setDescription("Treinamento de novos colaboradores");
        task2.setTime(LocalDate.of(2025, 10, 5));
        task2.setStatus("Concluída");
        task2.setManager("Maria Souza");
        task2.setSection("Recursos Humanos");
        task2.setEnterpriseNae(enterprise_name);
        task2.setIdManager(102);

        // Task 3
        Tasks task3 = new Tasks();
        task3.setIdTask(3);
        task3.setDescription("Atualizar servidor principal");
        task3.setTime(LocalDate.of(2025, 10, 15));
        task3.setStatus("Pendente");
        task3.setManager("Carlos Santos");
        task3.setSection("TI");
        task3.setEnterpriseNae(enterprise_name);
        task3.setIdManager(103);

        // Task 4
        Tasks task4 = new Tasks();
        task4.setIdTask(4);
        task4.setDescription("Campanha de marketing digital");
        task4.setTime(LocalDate.of(2025, 11, 1));
        task4.setStatus("Pendente");
        task4.setManager("Fernanda Lima");
        task4.setSection("Marketing");
        task4.setEnterpriseNae(enterprise_name);
        task4.setIdManager(104);

        // Task 5
        Tasks task5 = new Tasks();
        task5.setIdTask(5);
        task5.setDescription("Planejamento estratégico anual");
        task5.setTime(LocalDate.of(2025, 12, 20));
        task5.setStatus("Concluída");
        task5.setManager("Roberto Alves");
        task5.setSection("Diretoria");
        task5.setEnterpriseNae(enterprise_name);
        task5.setIdManager(105);

        // Show all tasks info
        task1.showData();
        task2.showData();
        task3.showData();
        task4.showData();
        task5.showData();
    }
}
