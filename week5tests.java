package week5.Lec1;

public class person {
  string name;
  int age;
Public Void talk(){
System.Out.Println("Hello,  My name is "+name);
}
}

package week5.Lec1;
Public class test1 {
Public static void main(String[] args) {
person P1=new person();
  P1.name="Atta";
  P1.age=15;
  person P2=new person();
  P2.name="jamal";
  P2.age=20;
  P1.talk();
  P2.talk();
}
}

package week5.Lec1;

public class employee {
string name;
double Salary;

puplic void saySalary() {
System.Out.Println("Hello, my name is " +name+"my Salary is" +Salary);

}
}

package week5.Lec1;
Public class test2 {
  Public static void main(String[] args) {
 employee e1=new  employee();
    e1.name="Atta";
    e1.Salary=200;
    employee e2=new  employee();
    e2.name="essa";
    e2.Salary=300; 
  e1.saySalary();
  e2.saySalary();
  }
}

package week5.Quiz;
Public class student {
  int Id;
  string name;
  int totalMarks;
  int totalHours;
  double getAvg;

  Public Double getAvg(){
  System.Out.Println(Id);
  System.Out.Println(name);
  System.Out.Println( totalMarks);
  System.Out.Println (totalHours);
  System.Out.Println(getAvg);

    return getAvg;
  }
}


package week5.Quiz;
Public class student_Quiz{
Public static void main(String[] args) {
student s1=new  student();
  s1.Id=101;
  s1.name="atta";
  s1.totalMarks=300;
  s1.totalHours=20;
  student s2=new  student();
  s2.Id=102;
  s2.name="essa";
  s2.totalMarks=600;
  s2.totalHours=30;

    s1.printInfo();
    s2.printInfo();
  }
}
