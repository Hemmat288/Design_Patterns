package ProtoType;

public class RegEmployee extends Employees{
    public RegEmployee() {
    }

    @Override
    public Employees ShallowCopy() throws CloneNotSupportedException{
        return ( RegEmployee)(this.clone());

    }
    public Employees DeepCopy()throws CloneNotSupportedException{

        RegEmployee emp = new RegEmployee();
          emp =(RegEmployee)this.clone();
          emp.EmpAddress=new Adresses(
                  EmpAddress.Building,
              EmpAddress.city,
             EmpAddress.street
          );
          emp.name=this.name;
        return emp;
    }
}
