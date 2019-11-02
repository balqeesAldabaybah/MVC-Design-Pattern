/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.test;

/**
 *
 * @author Balqees
 */
public class Studentcontroller {
    private student model;
    private StudentView view;
    
    public Studentcontroller(student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    
    public String getStudentName(){return model.getName();}
    public String getStudentRollNo(){return model.getRollNo();}
    
    public void setStudentName(String name ){model.setName(name);}
    public void setStudentRollNo(String rollNo){model.setRollNo(rollNo);}
    
    public void updateview(){view.printStudentDetails(model.getName(), model.getRollNo());}
}
