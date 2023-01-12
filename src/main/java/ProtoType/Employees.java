package ProtoType;

public abstract class Employees {
    public int id;
    public String name;
    public  Adresses EmpAddress = new Adresses();



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresses getEmpAddress() {
        return EmpAddress;
    }

    public void setEmpAddress(Adresses empAddress) {
        EmpAddress = empAddress;
    }

    public Employees() {
    }

    public Employees(int id, String name, Adresses empAddress) {
        this.id = id;
        this.name = name;
        EmpAddress = empAddress;
    }

    public abstract Employees ShallowCopy() throws CloneNotSupportedException;
    public abstract Employees DeepCopy() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", EmpAddress=" + EmpAddress +
                '}';
    }
}
