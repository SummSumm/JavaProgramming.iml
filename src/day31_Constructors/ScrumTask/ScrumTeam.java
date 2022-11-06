package day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> devList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testerList = testerList;
        this.devList = devList;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester) {
        testerList.add(tester);
    }

    public void addTesters(Tester[] testers) {
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        devList.add(developer);
    }

    public void addDevelopers(Developer[] developers) {
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
