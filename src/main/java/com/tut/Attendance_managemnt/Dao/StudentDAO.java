package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Student;
import java.util.List;

/**
 * Interface for Student Data Access Object (DAO).
 * Provides CRUD operations for managing Student entities in the database.
 */
public interface StudentDAO {

    /**
     * Save a new student record to the database.
     *
     * @param student The Student object to be saved.
     */
    void saveStudent(Student student);

    /**
     * Retrieve a specific student record by its ID.
     *
     * @param studentId The unique ID of the student.
     * @return The Student object associated with the given ID.
     */
    Student getStudent(Long studentId);

    /**
     * Update an existing student record in the database.
     *
     * @param student The Student object containing updated information.
     */
    void updateStudent(Student student);

    /**
     * Delete a student record from the database using its ID.
     *
     * @param studentId The unique ID of the student to be deleted.
     */
    void deleteStudent(Long studentId);

    /**
     * Retrieve all student records from the database.
     *
     * @return A list of all Student objects.
     */
    List<Student> getAllStudents();
}
