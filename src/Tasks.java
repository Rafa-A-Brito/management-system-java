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
    private String enterprise_name;
    int id_task;

    // Method "Tasks" to get the private atrributes for Main
    public Tasks(
            String description,
            LocalDate time_limit,
            String status,
            String manager,
            String section,
            String enterprise_name,
            int id_manager,
            int id_task)
    {
        this.description = description;
        this.time_limit = time_limit;
        this.status = status;
        this.manager = manager;
        this.section = section;
        this.enterprise_name = enterprise_name;
        this.id_manager = id_manager;
        this.id_task = id_task;
    }

    // Constructor of Tasks
    public Tasks() {
        this.description = "";
        this.time_limit = null;
        this.status = "";
        this.manager = "";
        this.section = "";
        this.enterprise_name = "";
        this.id_manager = 0;
        this.id_task = 0;
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

    public int getIdTask() {return this.id_task;}

    public String getEnterpriseName() {return this.enterprise_name;}

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

    public void setEnterpriseNae(String _entname){this.enterprise_name = _entname;}

    public void setIdManager(int _idmng){this.id_manager = _idmng;}

    public void setIdTask(int _idtask){this.id_task = _idtask;}


    // MostraDados() method in English
        public void showData(){

            System.out.println("\n==============================================");
            System.out.println("Relatório do Gerenciamento: Empresa " + this.getEnterpriseName());
            System.out.println("Número da Tarefa: " + this.getIdTask());
            System.out.println("Responsável pela Tarefa: " + this.getManager());
            System.out.println("Identificação do Resposável (ID): " + this.getIdManager());
            System.out.println("Tarefa a ser designada: " + this.getDescription());
            System.out.println("Seção/Área da empresa: " + this.getSection());
            System.out.println("Prazo limite para realização:  " + this.getFormattedDate());
            System.out.println("Status da tarefa: " + this.getStatus());
            System.out.println("==============================================");
        }

}

