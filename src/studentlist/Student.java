package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 * Date : Feb. 5th, 2019
 * Location: Davis Campus
 */
public class Student {
 
    private String name;
    private int id;
    private String DoB;
   
    private int maxHrs;
    
    public Student()
    {
           this.name = "Not Set";
           this.id =0;
    }
    // main constructor that takes a name and an id
    public Student(String givenName, int givenId)
    {
        this.name = givenName;
        this.id = givenId;
    }
    
    // This method sets the value of the name preprty
    public void setName(String givenName)
    {
        name = givenName;
    }
    public String getName()
    {
           return this.name;
    }
    
    public void setId(int givenId)
    {
        this.id = givenId;
    }
    public int getId()
    {
           return this.id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    public String toString()
    {
           return "Student";
    }
            
    
}
