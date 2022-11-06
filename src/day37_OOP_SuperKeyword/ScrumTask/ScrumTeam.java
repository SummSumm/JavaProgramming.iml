package day37_OOP_SuperKeyword.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList <Tester> testers = new ArrayList();
    public ArrayList <Developer> devs = new ArrayList();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) { // to add one
        testers.add(tester);
    }

    public void addTesters(Tester[] testers) {  // to add many
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester (int ID) {
        testers.removeIf(p -> p.ID==ID);
    }

    public void addDeveloper(Developer developer) { // add one
        devs.add(developer);
    }

    public void addDevelopers (Developer [] devs) {
        this.devs.addAll(Arrays.asList(devs));
    }

    public void removeDev (int ID) {
        devs.removeIf(p -> p.ID==ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", testers=" + testers.size() +
                ", devs=" + devs.size() +
                '}';
    }
}

