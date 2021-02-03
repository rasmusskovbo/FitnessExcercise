import java.util.ArrayList;
import java.util.List;

public class Terminal {
    List<Person> database = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public Terminal() {

    }

    public void addEmployee(Employee e) {
        employees.add(e);
        database.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
        database.remove(e);
    }

    public void addMember(Member m) {
        members.add(m);
        database.add(m);
    }

    public void removeMember(Member m) {
        members.remove(m);
        database.remove(m);
    }

    public void printEmployees() {
        System.out.println("Fitness Employees");
        System.out.println("Name     CPR    Hours     Salary      Vacation");
        System.out.println("**********************************************");
        for (Employee e : employees) {
            if (e instanceof Administration) {
                System.out.println(e.getName() + "     " + e.getCpr() + "     " + e.getHours() + "     " + e.getSalary() + "     " + ((Administration) e).getVacation());
            } else {
                System.out.println(e.getName() + "     " + e.getCpr() + "     " + e.getHours() + "     " + e.getSalary());
            }
        }
    }

    public void printMembers() {
        System.out.println("Fitness Members");
        System.out.println("Name     CPR    Membership Type     Fee      ");
        System.out.println("**********************************************");
        for (Member m : members) {
            System.out.println(m.getName() + "     " + m.getCpr() + "     " + m.getMembershipType() + "     " + m.getMonthlyFee());
        }
    }

    public void updateDatabase() {
        database.addAll(employees);
        database.addAll(members);
    }

    public void printDatabase() {
        System.out.println("Employees and Members");
        System.out.println("Name     CPR");
        System.out.println("**********************************************");
        for (Person p : database) {
            System.out.println(p.getName() + "     " + p.getCpr());
        }
    }

}
