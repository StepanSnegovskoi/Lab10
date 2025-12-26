import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Employee dean; // Декан факультета
    private List<Institute> institutes; // Список кафедр факультета

    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public void addInstitute(Institute institute) {
        if (institute != null && !institutes.contains(institute)) {
            institutes.add(institute);
        }
    }

    public void displayInstitutes() {
        System.out.println("Кафедры факультета " + name + ":");
        if (institutes.isEmpty()) {
            System.out.println("  (кафедры отсутствуют)");
        } else {
            for (Institute institute : institutes) {
                System.out.println("  - " + institute.getName() + " (" + institute.getAddress() + ")");
            }
        }
    }
}



