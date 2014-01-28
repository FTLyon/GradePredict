/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author Frankie Lyon
 */
public class Student {
    public static double[] projection_1;
    public static double[] projection_2;
    public static double[] projection_3;
    public static double[] projection_4;
    public static double[] projection_5;
    public static double[] grades;
    
    public Student(double g1, double g2, double g3, double g4, double g5) {
        this.grades = new double[]{g1, g2, g3, g4, g5};
        this.projection_1 = new double[]{.2,.2,.2,.2,.2};
        this.projection_2 = new double[]{.2,.2,.2,.2,.2};
        this.projection_3 = new double[]{.2,.2,.2,.2,.2};
        this.projection_4 = new double[]{.2,.2,.2,.2,.2};
        this.projection_5 = new double[]{.2,.2,.2,.2,.2};

    }
    
    public double returnGrade(int index) {
        return this.grades[index];
    }
    
    
}
