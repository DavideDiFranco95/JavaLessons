package Exercise.develhope.TestSbarramento;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Workman> workmen = new ArrayList<>();
        Workman mario = new Workman(0,"Mario Gialli",0.5F,20);
        Workman gianni = new Workman(5,"Gianni Fannulloni",0.2F,30);
        Workman giorgia = new Workman(17,"Giorgia Lavoroni",0.85F,40);
        workmen.add(mario);
        workmen.add(gianni);
        workmen.add(giorgia);

        List<Head> heads = new ArrayList<>();
        Head alessio = new Head(3,"Alessio Antichi",0.55F,20);
        Head marianna = new Head(1,"Marianna Figlidelcapo",0.3F,2);
        Head gianluigi = new Head(9,"Gianluigi Figlidelcapo",0.3F,4);
        heads.add(alessio);
        heads.add(marianna);
        heads.add(gianluigi);


        for (Workman workman:workmen){
            if (workman.canApplyForPromotion()== true){
                System.out.println("Employee that can be promoted is " + workman.getName());
            }
        }
        for (Head head:heads){
            if (head.mayBeDemoted()==true){
                System.out.println("Head that will be demoted is " + head.getName());
            }
        }
        List<Employee> employees = new ArrayList<>();
        employees.addAll(workmen);
        employees.addAll(heads);

        employees.forEach(employee -> {
            System.out.println(employee.getName() + employee.getEfficiencyIndex());
        });

        employees.forEach(employee -> {
            System.out.println((employee.getName()+ " " + employee.getEfficiencyIndex()).replaceAll("\\.",",")
                    .replaceAll("\\d","?").toLowerCase());
        });
    }
}
