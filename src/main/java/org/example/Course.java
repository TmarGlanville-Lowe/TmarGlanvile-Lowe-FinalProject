package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private Assignment[] assignments;
    private Student[] registeredStudents;
    private double[]  finalScores;
    private static int nextId;
}
