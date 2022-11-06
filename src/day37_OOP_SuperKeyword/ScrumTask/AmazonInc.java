package day37_OOP_SuperKeyword.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner po = new ProductOwner("Gulay", 45, 'F', 300000, 1, "Apple");
        BusinessAnalyst ba = new BusinessAnalyst("Rana", 33, 'F', 250000, 2, "Sony");
        ScrumMaster sm = new ScrumMaster("Cihangir", 38, 'M', 230000, 3, "Amazon");

        Tester t1 = new Tester("Ali", 23, 'M', "QA", 150000, 10, "Amazon");
        Tester t2 = new Tester("Deniz", 47, 'M', "QA", 150000, 11, "Amazon");
        Tester t3 = new Tester("Zeynep", 36, 'F', "SDET", 160000, 12, "Amazon");
        Tester t4 = new Tester("Leman", 40, 'F', "SDET", 170000, 99, "Freelance");

        Tester[] testers = {t1, t2, t3, t4};

        Developer d1 = new Developer("Pera", 35, 'F', "dev", 200000, 999, "Freelance");

        ScrumTeam team = new ScrumTeam(po, ba, sm);
        team.addTesters(testers);
        team.addDeveloper(d1);

        System.out.println(team);
        System.out.println("---------------------------------------");

        for(Tester tester : team.testers) {
            System.out.println(tester.name + " earns " + tester.salary);
        }

    }
}
