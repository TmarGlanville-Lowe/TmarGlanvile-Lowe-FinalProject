package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter

public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId;

    public static boolean validateDepartmentName(String departmentName){
        String regex = "^[a-zA-Z\\s]*$";

        return departmentName.matches(regex);
    }
        public static Department newDepartment(String departmentName) {
            if (!validateDepartmentName(departmentName)) {
                return newDepartment(null);
            } else {
                return newDepartment(departmentName);
            }
        }

    }


