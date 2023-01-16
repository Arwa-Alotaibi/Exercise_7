public class Employee {
    private  String id ;
    private String  name ;
    private  double salary;


    public Employee(){

    }
    public Employee( String id  , String  name ,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary(){
      return this.salary*12  ;
    }
    public double raisedSalary(double percent){
       // new salary = old salary + old salary * raise %

       return  (this.salary+this.salary) * percent;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
