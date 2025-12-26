public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("=== Административный сотрудник ===");
        super.printEmployeeInfo();
    }
}



