package Codewars;
/*
if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */

/* РЕШЕНИЕ С КОДВАРС
  public static String bmi(double weight, double height) {
     double bmi =weight/(height*height);
    return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";
 */
public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight/Math.pow(height, 2);
        String [] list = {"Underweight", "Normal", "Overweight", "Obese"};
        System.out.println("bmi: " + bmi);
        String condition = null;
        if(bmi <= 18.5) {
            condition = list[0];
            } else if (bmi <= 25.0) {
                condition = list[1];
            } else if (bmi <= 30.0) {
                condition = list[2];
            } else if (bmi > 30) {
            condition = list[3];
        }
       return condition;
    }

    //assertEquals("Normal", Calculate.bmi(80, 1.80));
    public static void main(String[] args){
        System.out.println("Ваш вес по отоношению к росту: " + bmi(73, 1.75));
    }
}
