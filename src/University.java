import java.util.ArrayList;
import java.util.List;

public class University {
    private String name; // Название университета
    private List<Faculty> faculties; // Список факультетов

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        if (faculty != null && !faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public void printUniversityInfo() {
        System.out.println("========================================");
        System.out.println("ИНФОРМАЦИЯ ОБ УНИВЕРСИТЕТЕ");
        System.out.println("========================================");
        System.out.println("Название: " + name);
        System.out.println("\nКоличество факультетов: " + faculties.size());
        System.out.println("\n" + "=".repeat(40));
        
        if (faculties.isEmpty()) {
            System.out.println("Факультеты отсутствуют");
        } else {
            for (int i = 0; i < faculties.size(); i++) {
                Faculty faculty = faculties.get(i);
                System.out.println("\nФакультет #" + (i + 1) + ": " + faculty.getName());

                if (faculty.getDean() != null) {
                    System.out.println("  Декан: " + faculty.getDean().getName() + 
                                     " (" + faculty.getDean().getEmail() + ")");
                }

                List<Institute> institutes = faculty.getInstitutes();
                if (institutes.isEmpty()) {
                    System.out.println("  Кафедры: (отсутствуют)");
                } else {
                    System.out.println("  Кафедры (" + institutes.size() + "):");
                    for (Institute institute : institutes) {
                        System.out.println("    - " + institute.getName() + 
                                         " (адрес: " + institute.getAddress() + ")");
                    }
                }
                System.out.println("-".repeat(40));
            }
        }
        
        System.out.println("\n========================================");
    }
}



