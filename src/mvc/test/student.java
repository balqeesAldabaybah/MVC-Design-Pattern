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
public class student {
    private String rollNo;
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name ){
        this.name = name ;
    }
    
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    
    public String getRollNo(){
        return rollNo;
    }
}
