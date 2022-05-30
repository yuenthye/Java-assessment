package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO
        students.put(student.getId(), student);
        students.put(student.getName(), student);
        students.put(student.getEmail(), student);

    }

    public Student findStudent( String studentId )
    {
        //TODO
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO

        if(!students.containsKey(students))
        {

            for ( String key : students.keySet() )
            {
                 Student stud= students.get( key );
                System.out.println( stud );
            }
        }


        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        if(students.containsKey(studentId)) {
            students.get(studentId).getEnrolledCourses();
        }
    }
}
