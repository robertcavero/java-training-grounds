import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());


    }

    public static void printEmployee(Employee employee) {
        System.out.printf("=========%s=========\n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager ->{
                employee.setCode("123");
                employee.setName("Joao");
                employee.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200);


                System.out.println(employee.getCode());
                System.out.println(employee.getSalary());
                System.out.println(employee.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman ->{
                salesman.setCode("123");
                salesman.setName("Joao");
                salesman.setSalary(5000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }

        }
        System.out.println(employee.getFullSalary(500));
        System.out.println(employee.getFullSalary());
        System.out.println("===============");
    }
}