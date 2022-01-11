package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;

    public ArrayList<Tester> testersList = new ArrayList<>();

    public ArrayList<Developer> devopsList = new ArrayList<>();

    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }


    public void addTester( Tester tester ){
        testersList.add( tester );   // adds a tester in the Testers array lists
    }

    public void addTesters( Tester[] testers){
        testersList.addAll(Arrays.asList(testers) );
    }

    public void addDeveloper(Developer developer){
        devopsList.add( developer );
    }

    public void addDevelopers( Developer[] developers){
        devopsList.addAll( Arrays.asList(developers ) );
    }


    public void removeTester(int employeeID ){
        testersList.removeIf( p -> p.employeeID==employeeID );  //removes a tester whose emp ID matches the given ID
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf( p -> p.employeeID==employeeID);  //removes a developer whose emp ID matches the given ID
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }





}
