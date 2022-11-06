import day31_Constructors.ScrumTask.Developer;
import day31_Constructors.ScrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum {

    class Developer {

        public String name;
        public int employeeID;
        public String jobTitle;
        public double salary;

        public Developer(String name, int employeeID, String jobTitle, double salary) {
            this.name = name;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public void coding() {
            System.out.println(name + " is smoke coding.");
        }

        public void unitTesting() {
            System.out.println(name + " is unit testing.");
        }

        public void fixingBug() {
            System.out.println(name + " is fixing a bug.");
        }
    }

    class Tester {
        public String name;
        public int employeeID;
        public String jobTitle;
        public double salary;

        public Tester(String name, int employeeID, String jobTitle, double salary) {
            this.name = name;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String toString() {
            return "Tester{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public void smokeTesting() {
            System.out.println(name + " is smoke testing.");
        }
        public void creatingTicket () {
            System.out.println(name + " is creating ticket.");
        }
        public void dailyStandup (){}

    }

    class ScrumTeam {
        public String PO, BA, SM;
        public ArrayList<day31_Constructors.ScrumTask.Tester> testerList = new ArrayList<>();
        public ArrayList<day31_Constructors.ScrumTask.Developer> devList = new ArrayList<>();
        int daysOfSprint;

        public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
            this.PO = PO;
            this.BA = BA;
            this.SM = SM;
            this.testerList = testerList;
            this.devList = devList;
            this.daysOfSprint = daysOfSprint;
        }

        public void addTester(day31_Constructors.ScrumTask.Tester tester) {
            testerList.add(tester);
        }

        public void addTesters(day31_Constructors.ScrumTask.Tester[] testers) {
            testerList.addAll(Arrays.asList(testers));
        }

        public void addDeveloper(day31_Constructors.ScrumTask.Developer developer) {
            devList.add(developer);
        }

        public void addDevelopers(day31_Constructors.ScrumTask.Developer[] developers) {
            devList.addAll(Arrays.asList(developers));
        }

        public void removeTester(int ID) {
            testerList.removeIf(p -> p.employeeID == ID);

        }
        public void removeDev (int ID) {
            testerList.removeIf(p -> p.employeeID==ID);
        }

        @Override
        public String toString() {
            return "ScrumTeam{" +
                    "PO='" + PO + '\'' +
                    ", BA='" + BA + '\'' +
                    ", SM='" + SM + '\'' +
                    ", total number of testers= " + testerList.size() +
                    ", total number of testers= " + devList.size() +
                    ", daysOfSprint=" + daysOfSprint +
                    '}';
        }
    }
}
