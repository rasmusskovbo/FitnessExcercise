public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();

        terminal.addEmployee(new Administration("Claus", "221175-1011", 37, 23000, 5));
        terminal.addEmployee(new Instructor("Tove", "011080-1014", 20, 9120));
        terminal.addEmployee(new Administration("Anna", "011080-1012", 37, 23000, 5));
        terminal.addEmployee(new Instructor("Henning", "011080-1014", 15, 6840));
        terminal.printEmployees();

        System.out.println();

        terminal.addMember(new Member("Morten", "130195-1303", false));
        terminal.addMember(new Member("Martin", "221175-1011", true));
        terminal.addMember(new Member("Martina", "050970-1409", false));
        terminal.addMember(new Member("Marcel", "221175-1011", true));
        terminal.printMembers();

        System.out.println();

        terminal.printDatabase();


    }
}
