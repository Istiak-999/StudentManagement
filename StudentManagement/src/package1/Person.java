/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

public class Person {
    protected String Name;    
    protected Department dept =new Department();
    
    public Person(){}
    public Person(String Name, Department dept){
    this.Name=Name;
    this.dept=dept;
    }
    
    public void ShowInfo(){
    System.out.println("Name : "+Name);
    System.out.println("Department : "+dept.getName());
    
    }
}
