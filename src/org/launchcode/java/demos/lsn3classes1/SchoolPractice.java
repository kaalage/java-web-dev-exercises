package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        public class Course {
            private String topic;
            private Teacher instructor;
            private ArrayList<Student> enrolledStudents;
        }

        public class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;
        }
    }
}
