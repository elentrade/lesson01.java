public class employee {
    String Name;
    String Position;
    String email;
    String Phone;
    int Salary;
    int Age;
    employee(String Name, String Position,String email, String Phone,int Salary, int Age ){
        this.Name=Name;
        this.Position=Position;
        this.email=email;
        this.Phone=Phone;
        this.Salary=Salary;
        this.Age=Age;
    }
public void PrintPersonalData(){
        System.out.println("Employee`s name:"+this.Name);
        System.out.println("Position:"+this.Position);
        System.out.println("Contacts:"+this.email+ ", tel: "+this.Phone);
        System.out.println("Salary:"+this.Salary);
        System.out.println("Age:"+this.Age);
}
    public boolean AgeFilter(int i){
        if(this.Age>i){
            return true;
        }
        else {
            return false;
        }
    }
}
