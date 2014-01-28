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
        
        System.out.println(regression("Chris", Chris));
    }
    
    public static void surroundingAverage(Student name) {
        
    }
    
    public static double[] regression(String name, double[] person) {
        //CircularArrayList projection = new CircularArrayList(5);
        double[] projection = new double[5];
        for (int i = 0; i < projection.length; i++) {
            if (i == person[i]) {
                person[i] += .2;
                if (i < projection.length - 1)
                    
                    }
        }
        //return projection;
    }
    
    
    
}
