/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;

/**
 *
 * @author HP
 */
public class ConditionalOperator {
     public static void main(String[] args) { 

        // Declare and initialize two variables, one String type variable
        // called status and the other int primitive type variable called
        // grade.
        String status = "";
        int grade = 80;

        // Get status of the student.
        status = (grade >= 60)?"Passed":"Fail";

        // Print status.
        System.out.println( status );
    }
}
