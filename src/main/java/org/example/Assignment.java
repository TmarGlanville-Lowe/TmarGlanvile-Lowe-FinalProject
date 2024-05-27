package org.example;

import lombok.ToString;

import java.util.Random;

@ToString

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private int[] scores;
    private static int nextId;

    public void calcAssignmentAvg() {
        double sum = 0;

        for (double num: scores){
            sum += num;
    }
        if (scores.length > 0){
            assignmentAverage = sum / scores.length;
        }else
            assignmentAverage = Double.parseDouble(null);

    public void generateRandomScore() {

            Random rand = new Random();

            int num = rand.nextInt(0, 11);
            if (num == 0) {
                int score = rand.nextInt(0, 60);
            } else if (num == 1 || num == 2) {
                int score = rand.nextInt(60, 70);
            } else if (num == 3 || num == 4) {
                int score = rand.nextInt(70, 80);
            } else if (num == 5 || num == 6 || num == 7 || num == 8) {
                int score = rand.nextInt(80, 90);
            } else {
                int score = rand.nextInt(90, 101);
            }
        }
    }
}
