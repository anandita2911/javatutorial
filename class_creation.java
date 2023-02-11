class class1{
    int salary;
    int id;
    String name;
    public int getsalary(){
        return(salary);
    }
    public String getname(){
        return(name);
    }
}
public class class_creation {

    public static void main(String[] args){
        class1 anandita = new class1();
        anandita.id=2121;
        anandita.name="khushi";
        anandita.salary=80;
        System.out.println("ajju cutie salary is = "+anandita.getsalary()+"lpa");
        System.out.println("ajju cutie gf is  = "+anandita.name);

    }
}
