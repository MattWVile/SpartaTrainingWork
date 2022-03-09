package org.sparta.mv.Day1;

public class celciusConverter {
    public celciusConverter() {
    }

    public static double converterMethod(double cel) {
        return cel * 9.0D / 5.0D + 32.0D;
    }

    public static String gradeMethod(int grade) {
        if (grade < 50) {
            return "F";
        } else {
            return grade > 80 ? "A" : "C";
        }
    }

    public static void main(String[] args) {
        System.out.println(converterMethod(26.0D));
        System.out.println(gradeMethod(40));
        System.out.println(gradeMethod(100));
        System.out.println(gradeMethod(60));
    }
}
