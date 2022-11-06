package day31_Constructors.ScrumTask;

public class TheTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Lale", 12345, "QA", 120000);
        Tester tester2 = new Tester("Ayhan", 25846, "QA", 120000);
        Tester tester3 = new Tester("Fatoş", 46790, "SDET", 120000);
        Tester tester4 = new Tester("Media", 84610, "SDET", 120000);
        Tester[] testers = {tester3, tester2, tester4};

        Developer dev1 = new Developer("Deniz", 63014, "developer", 150000);
        Developer dev2 = new Developer("Reyyan", 74120, "developer", 150000);
        Developer dev3 = new Developer("Özgür", 23567, "top developer", 200000);
        Developer dev4 = new Developer("Sinem", 96341, "top developer", 200000);
        Developer[] developers = {dev3, dev2, dev4};

        ScrumTeam scrumTeam = new ScrumTeam("Bugra", "Hasan", "Sumeyye", 21);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDeveloper(dev1);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);
        for (Tester each : scrumTeam.testerList) {
            System.out.println(each.name + ": " + each.salary);
        }
        System.out.println("--------------------------------------------");
        for (Developer each : scrumTeam.devList) {
            System.out.println(each.name + ": " + each.salary);
        }
        scrumTeam.removeDev(63014);
        scrumTeam.removeTester(46790);
        System.out.println("--------------------------------------------");
        System.out.println("Testers:");
        for (Tester each : scrumTeam.testerList) {
            System.out.print(each.name + " ");
        }
        System.out.println();
        System.out.println("Developers:");
        for (Developer each : scrumTeam.devList) {

            System.out.print(each.name + " ");
        }

    }
}
