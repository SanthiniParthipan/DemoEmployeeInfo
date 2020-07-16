package sg.edu.rp.c346.id19028654.demoemployeeinfo;

public class EmployeeInfo {

    private String Name;
    private String job;
    private String salary;

    public EmployeeInfo(String name, String job, String salary) {
        Name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


}
