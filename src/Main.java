import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы университетской информационной системы\n");

        University university = new University("Московский государственный университет");

        AdministrativeEmployee dean1 = new AdministrativeEmployee(1001, "Иванов Иван Иванович", "dean1@university.ru");
        AdministrativeEmployee dean2 = new AdministrativeEmployee(1002, "Петрова Мария Сергеевна", "dean2@university.ru");

        Faculty faculty1 = new Faculty("Факультет информационных технологий", dean1);
        Faculty faculty2 = new Faculty("Факультет физики", dean2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        Institute institute1 = new Institute("Кафедра программирования", "ул. Ленина, д. 1, ауд. 101");
        Institute institute2 = new Institute("Кафедра баз данных", "ул. Ленина, д. 1, ауд. 205");
        Institute institute3 = new Institute("Кафедра теоретической физики", "ул. Мира, д. 5, ауд. 301");

        faculty1.addInstitute(institute1);
        faculty1.addInstitute(institute2);
        faculty2.addInstitute(institute3);

        ResearchAssociate researcher1 = new ResearchAssociate(2001, "Сидоров Петр Александрович", 
                                                              "sidorov@university.ru", "Машинное обучение");
        ResearchAssociate researcher2 = new ResearchAssociate(2002, "Козлова Анна Викторовна", 
                                                              "kozlova@university.ru", "Базы данных");
        Lecturer lecturer1 = new Lecturer(2003, "Смирнов Дмитрий Олегович", 
                                         "smirnov@university.ru", "Физика твердого тела");

        institute1.addResearchAssociate(researcher1);
        institute2.addResearchAssociate(researcher2);
        institute3.addResearchAssociate(lecturer1);

        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.JANUARY, 1);
        Date startDate1 = cal.getTime();
        cal.set(2024, Calendar.DECEMBER, 31);
        Date endDate1 = cal.getTime();
        
        cal.set(2024, Calendar.MARCH, 1);
        Date startDate2 = cal.getTime();
        cal.set(2025, Calendar.FEBRUARY, 28);
        Date endDate2 = cal.getTime();
        
        Project project1 = new Project("Разработка системы распознавания образов", startDate1, endDate1);
        Project project2 = new Project("Исследование распределенных баз данных", startDate2, endDate2);
        Project project3 = new Project("Изучение квантовых эффектов в твердых телах", startDate1, endDate1);

        researcher1.addProjectToResearcher(project1, 120);
        researcher1.addProjectToResearcher(project2, 80);
        researcher2.addProjectToResearcher(project2, 150);
        lecturer1.addProjectToResearcher(project3, 200);

        Course course1 = new Course(101, "Машинное обучение", 4.0f);
        Course course2 = new Course(102, "Базы данных", 3.0f);
        Course course3 = new Course(201, "Квантовая физика", 5.0f);
        Course course4 = new Course(202, "Физика твердого тела", 4.5f);

        researcher1.addCourse(course1);
        researcher2.addCourse(course2);
        lecturer1.addCourse(course3);
        lecturer1.addCourse(course4);

        university.printUniversityInfo();

        System.out.println("\n\n");
        researcher1.printEmployeeInfo();
        
        System.out.println("\n\n");
        researcher2.printEmployeeInfo();
        
        System.out.println("\n\n");
        lecturer1.printEmployeeInfo();

        System.out.println("\n\n========================================");
        System.out.println("СТАТИСТИКА");
        System.out.println("========================================");
        System.out.println("Всего сотрудников в системе: " + Employee.getEmployeeCounter());
        System.out.println("Всего факультетов: " + university.getFaculties().size());
        
        int totalInstitutes = 0;
        for (Faculty faculty : university.getFaculties()) {
            totalInstitutes += faculty.getInstitutes().size();
        }
        System.out.println("Всего кафедр: " + totalInstitutes);
        
        System.out.println("\n========================================");
        System.out.println("Демонстрация завершена успешно!");
        System.out.println("========================================");
    }
}



