package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;

    private Course registeredCourses[];

    private static int nextId;

    public static boolean registerCourse(Course course){
    }
    public static boolean dropCourse(Course course){

    }
}
