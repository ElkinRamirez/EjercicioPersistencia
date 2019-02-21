/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class PartialTime extends Professor{
    private String category ;
    private int classHours;
     
    public PartialTime(String category, int classHours, String id, String name, Date hiringDate, String school, String department){
        super(id, name, hiringDate, school, department);
        this.category = category;
        this.classHours = classHours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }
    
    @Override
    public float paySalary() {
        switch (category) {
            case "A":
                return classHours*60000;
            case "B":
                return classHours*80000;
            case "C":
                return classHours*100000;
            default:
                return 0;
        }
    }
    
}
