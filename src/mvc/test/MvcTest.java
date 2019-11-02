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
public class MvcTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student model = retriveStudentFromDatabase();
        
        StudentView view = new StudentView();
        
        Studentcontroller controller = new Studentcontroller(model, view);
        
        controller.updateview();
        
        controller.setStudentName("balqees");
        
        controller.updateview();
    }
    
    
    private static student retriveStudentFromDatabase(){
      student student = new student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
