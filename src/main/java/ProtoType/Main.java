package ProtoType;

public class Main {

    public static void main(String[] args) {
       RegEmployee e1=new RegEmployee();
       e1.name="hmm";
       e1.id=1;
       e1.EmpAddress= new Adresses("1", "ert", "rfet");
        try {
            RegEmployee e2= (RegEmployee) e1.DeepCopy();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
     e1.toString();
        System.out.println("Hello world!");
    }
}
