import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Atributtes of class tasks

public class Tasks {
    private String description;
    private LocalDate time_limit;
    private String status;
    private String manager;
    private String section;
    private int id_manager;

    // Method "Tasks" to get the private atrributes for Main
    public Tasks(String description, LocalDate time_limit, String status, String manager, String section, int id_manager) {
        this.description = description;
        this.time_limit = time_limit;
        this.status = status;
        this.manager = manager;
        this.section = section;
        this.id_manager = id_manager;
    }

    // Getters
    public String getDescription() {
         return this.description;
     }

    public String getFormattedDate() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.time_limit.format(dateFormat);
    }

    public String getStatus() {
        return this.status;
    }

    public String getManager() {
        return this.manager;
    }

    public String getSection() {
        return this.section;
    }

    public int getIdManager() {
        return this.id_manager;
    }

    // Setters

    public void setDescription(String _d){this.description = _d;}

    public void setTime(LocalDate _t){
        this.time_limit = _t;
    }

    public void setStatus(String _st){
        this.status = _st;
    }

    public void setManager(String _m){
        this.manager = _m;
    }

    public void setSection(String _sect){
        this.section = _sect;
    }

    public void setIdManager(int _idmng){
        this.id_manager = _idmng;
    }


    // MostraDados() method in English
    public void showData(){

        System.out.println("==============================================");
        System.out.println("Relatório do Gerenciamento:");
        System.out.println("Responsável pela Tarefa: " + this.getManager());
        System.out.println("Identificação do Resposável (ID): " + this.getIdManager());
        System.out.println("Tarefa a ser designada: " + this.getDescription());
        System.out.println("Seção / Área da empresa: " + this.getSection());
        System.out.println("Prazo limite para realização:  " + this.getFormattedDate());
        System.out.println("Status da tarefa (concluída/pendente): " + this.getStatus());
        System.out.println("==============================================");
    }

    // MudarStatus() method in English
    public void changeStatus(String newStatus) {
        switch (newStatus) {
            case "Concluída":
            case "Pendente":
                this.status = newStatus;
                System.out.println("Status alterado para: " + this.status);
                break;
            default:
                System.out.println("A alteração não foi possível de realizar! \nOpção inexistente.");
        }
    }
}

