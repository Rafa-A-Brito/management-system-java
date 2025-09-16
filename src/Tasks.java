import java.util.Date;

// Atributtes of class tasks

public class Tasks {
    String description;
    Date time;
    String status;
    String manager;


    // Getters
     public String getDescription() {
         return this.description;
     }

    public Date getDate() {
        return this.time;
    }

    public String getStatus() {
        return this.status;
    }

    public String getManager() {
        return this.manager;
    }

    // Setters

    public void setDescription(String _d){
         this.description = _d;
    }

    public void setTime(Date _t){
        this.time = _t;
    }

    public void setStatus(String _st){
        this.status = _st;
    }

    public void setManager(String _m){
        this.manager = _m;
    }




    // MostraDados() method in English
    public void ShowData(){

    }

    // MudarStatus() method in English
    public void Change Status(){
         ""
    }
}

