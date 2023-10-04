package homework1.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee){
        employees[size++] = employee;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
        }
    }

    public  void seaarchById(String id){
        for (int i = 0; i < size; i++) {
            if(employees[i].getEmplyeeID().contains(id)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }

        }
    }

    public void searchByCompany(String companyName){
        for (int i = 0; i < size; i++) {
            if(employees[i].getCompany().contains(companyName)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }

        }

    }


}
