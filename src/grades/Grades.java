/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Frankie Lyon
 */
public class Grades {

    public static void main(String[] args) {
        double[] Lauren      = new Student(3.5, 3.5, 2, 2, 1).grades;
        double[] Elliot      = new Student(2, 1, 1, 0, 1).grades;
        double[] Davies      = new Student(4, 4, 3, 3, 4).grades;
        double[] Brandon     = new Student(4, 4, 4, 3, 4).grades;
        double[] Siobhan     = new Student(3.5, 4, 2.5, 2, 2).grades;
        double[] Kayla       = new Student(4, 3, 3, 2.5, 4).grades;
        double[] Anthony     = new Student(4, 4, 2, 3.5, 4).grades;
        double[] Kitty       = new Student(3.5, 4, 2.5, 3, 3).grades;
        double[] Rachel      = new Student(3.5, 4, 3.5, 3, 3).grades;
        double[] David       = new Student(3.5, 4, 1, 3, 4).grades;
        double[] Kieu        = new Student(4, 4, 3.5, 3, 3).grades;
        double[] Kevin       = new Student(3.5, 4, 3, 3.5, 4).grades;
        double[] William     = new Student(0, 4, 0, 0, 0).grades;
        double[] Grace       = new Student(3.5, 3.5, 3, 3, 4).grades;
        double[] Zach        = new Student(3.5, 3, 4, 3, 4).grades;
        double[] Ashley      = new Student(3, 4, 3, 3.5, 3).grades;
        double[] Ken         = new Student(2, 3.5, 1, 0, 2).grades;
        double[] Janelle     = new Student(3, 4, 3.5, 3.5, 4).grades;
        double[] Elizabeth   = new Student(3.5, 4, 4, 4, 3).grades;
        double[] Chris       = new Student(4, 3, 4, 3, 4).grades;
        
        
        double[][] map = new double[][]{Lauren, Elizabeth, Ashley, Janelle, Grace, Anthony, David, Brandon, Zach, Chris, Ken, Rachel, Kayla, Siobhan, Kitty, Kevin, Davies, Kieu};
        
        for (int q = 0; q < map.length; q++) {
            for (int i = 0; i < regression(map[q],1).length - 1; i++) {
                for (int n = 0; n < regression(map[q],1).length - 1; n++) {
                System.out.println("Probability of grade " + (int)(n+1) + " on assignment " + (int)(i+1) + ": " + regression(map[q],i)[n] + " --" + map[q]); 
                }
            }
    }
    }
    
    public static void surroundingAverage(Student name) {
        
    }
    
    public static double[] regression(double[] person, int assignment) { //assignment is assignment number (1-5), prediction[i] is grade on BAME
        double[] prediction = new double[]{.2,.2,.2,.2,.2};
        for (int i = 1; i < person.length - 1; i++) {
            if (i == person[assignment]) 
                prediction[i-1] += .2;
            else if (i != person[assignment])
                prediction[i-1] -= .05;           
        }        
        
        return prediction;    
    }
}
 