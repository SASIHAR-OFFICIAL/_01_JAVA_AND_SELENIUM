package _J_17_01_Method_Calling;
import java.util.ArrayList;
import java.util.List;

//student class 
class Student  
{ 
 String name; 
 int id ; 
 String dept; 
   
 Student(String name, int id, String dept)  
 { 
       
     this.name = name; 
     this.id = id; 
     this.dept = dept; 
       
 } 
} 

/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
class Department  
{ 
   
 String name; 
 private List<Student> students; 
 Department(String dname, List<Student> students)  
 { 
       
     this.name = dname; 
     this.students = students; 
       
 } 
   
 public List<Student> getStudents()  
 { 
     return students; 
 } 
} 

/* Institute class contains list of Department 
Objects. It is asoociated with Department 
class through its Object(s).*/
class Institute  
{ 
   
 String instituteName; 
 private List<Department> departments; 
   
 Institute(String instituteName, List<Department> departments) 
 { 
     this.instituteName = instituteName; 
     this.departments = departments; 
 } 
   
 // count total students of all departments 
 // in a given institute  
 public int getTotalStudentsInInstitute() 
 { 
     int noOfStudents = 0; 
     List<Student> students;  
     for(Department dept : departments) 
     { 
         students = dept.getStudents(); 
         for(Student s : students) 
         { 
             noOfStudents++; 
         } 
     } 
     return noOfStudents; 
 } 
   
}  

//main method 
class aggregation_aggre 
{ 
 public static void main (String[] args)  
 { 
     Student s1 = new Student("Mia", 1, "CSE"); 
     Student s2 = new Student("Priya", 2, "CSE"); 
     Student s3 = new Student("John", 1, "EE"); 
     Student s4 = new Student("Rahul", 2, "EE"); 
   
     // making a List of  
     // CSE Students. 
     List <Student> cse_students = new ArrayList<Student>(); 
     cse_students.add(s1); 
     cse_students.add(s2); 
       
     // making a List of  
     // EE Students 
     List <Student> ee_students = new ArrayList<Student>(); 
     ee_students.add(s3); 
     ee_students.add(s4); 
       
     Department CSE = new Department("CSE", cse_students); 
     Department EE = new Department("EE", ee_students); 
       
     List <Department> departments = new ArrayList<Department>(); 
     departments.add(CSE); 
     departments.add(EE); 
       
     // creating an instance of Institute. 
     Institute institute = new Institute("KGISL", departments); 
       
     System.out.print("Total students in institute: "); 
     System.out.print(institute.getTotalStudentsInInstitute()); 
 } 
} 

