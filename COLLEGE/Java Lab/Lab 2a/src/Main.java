import java.util.*;

class staff{
    int staffid, salary;
    String name, phone;
    staff(int staffid, int salary, String name, String phone){
        this.staffid = staffid;
        this.salary = salary;
        this.name = name;
        this.phone = phone;
    }
    void display(){
        System.out.println("Staff Id :  "+staffid);
        System.out.println("Salary :  "+salary);
        System.out.println("Name :  "+name);
        System.out.println("Phone no. :  "+phone);
    }
}

class teaching extends staff{
    String domain, publication;

    teaching(int staffid, int salary, String name, String phone,String dom, String pub){
        super(staffid,salary,name,phone);
        domain = dom;
        publication  = pub;
    }

    void displayTeach(){
        System.out.println("Domain :  "+domain);
        System.out.println("Publication :  "+publication);
    }
}

class technical extends staff{
    String skill;

    technical(int staffid,int salary,String name, String phone,String skill){
        super(staffid,salary,name,phone);
        this.skill = skill;
    }

    void displayTechnical(){
        System.out.println("Skill :  "+skill);
    }
}

class contract extends staff{
    int period;
    contract(int staffid,int salary,String name,String phone,int per) {
        super(staffid,salary,name,phone);
        period  = per;
    }
    void displayCont(){
        System.out.println("Period :  "+period);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ch, sid, salary, period;
        String name, phone, dom, pub, skill;

        System.out.println("Enter your category :\n1.Teaching\n2.Technical\n3.Contract");
        ch = s.nextInt();

        switch (ch) {

            case 1:
                teaching t[] = new teaching[3];

                for (int i = 0; i < t.length; i++) {
                    System.out.println("Enter sid,salary,name,phone,domain and publication");
                    sid = s.nextInt();
                    salary = s.nextInt();
                    name = s.next();
                    phone = s.next();
                    dom = s.next();
                    pub = s.next();
                    t[i] = new teaching(sid, salary, name, phone, dom, pub);
                }

                for (int i = 0; i < t.length; i++) {
                    t[i].display();
                    t[i].displayTeach();
                }
                break;


            case 2:
                technical tc[] = new technical[3];

                for (int i = 0; i < tc.length; i++) {
                    System.out.println("Enter sid,salary,name,phone and skill");
                    sid = s.nextInt();
                    salary = s.nextInt();
                    name = s.next();
                    phone = s.next();
                    skill = s.next();
                    tc[i] = new technical(sid, salary, name, phone, skill);
                }

                for (int i = 0; i < tc.length; i++) {
                    tc[i].display();
                    tc[i].displayTechnical();
                }
                break;


            case 3:
                contract ct[] = new contract[3];
                for (int i = 0; i < ct.length; i++) {
                    System.out.println("Enter sid,salary,name,phone and period");
                    sid = s.nextInt();
                    salary = s.nextInt();
                    name = s.next();
                    phone = s.next();
                    period = s.nextInt();
                    ct[i] = new contract(sid, salary, name, phone, period);
                }

                for (int i = 0; i < ct.length; i++) {
                    ct[i].display();
                    ct[i].displayCont();
                }
                break;

            default:
                System.out.println("Invalid option chosen");

        }
    }
}
