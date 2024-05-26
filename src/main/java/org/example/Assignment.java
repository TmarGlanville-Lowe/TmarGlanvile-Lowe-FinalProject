package org.example;

import lombok.ToString;

@ToString

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private int[] scores;
    private static int nextId;
}
