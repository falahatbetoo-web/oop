package week6.Lec1;
Public class Employee {
  String name;
  int salary;

  Public Employee(){
    this.salary=290;
  }
  Public Employee(String name, int salary){
    this.name = name;
    this.salary = salary;
  }

  Public Void printInfo(){
  System.Out.Println("name ="+name +" , salary = "+salary);
  }
}
package week6.Lec1;
public static Void main(String[] args) {
  Employee e1 =new Employeee("Atta",1000);
  e1.printInfo();

    Employee e2 =new Employeee("Essa",500);
  e2.printInfo();

    Employee e3 =new Employeee();
  e3.name="Atta";
  e3.printInfo();
}
}


  
