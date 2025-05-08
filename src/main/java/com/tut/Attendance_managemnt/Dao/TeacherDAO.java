package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Teacher;
import java.util.List;

/**
 * Interface for Teacher Data Access Object (DAO).
 * Provides methods for performing CRUD operations on Teacher entities.
 */
public interface TeacherDAO {

    /**
     * Save a new teacher record to the database.
     *
     * @param teacher The Teacher object to be saved.
     */
    void saveTeacher(Teacher teacher);

    /**
     * Retrieve a teacher record by its unique ID.
     *
     * @param teacherId The unique ID of the teacher.
     * @return The Teacher object corresponding to the given ID.
     */
    Teacher getTeacher(Long teacherId);

    /**
     * Update an existing teacher record in the database.
     *
     * @param teacher The Teacher object containing updated data.
     */
    void updateTeacher(Teacher teacher);

    /**
     * Delete a teacher record from the database using its ID.
     *
     * @param teacherId The unique ID of the teacher to be deleted.
     */
    void deleteTeacher(Long teacherId);

    /**
     * Retrieve all teacher records from the database.
     *
     * @return A list of all Teacher objects.
     */
    List<Teacher> getAllTeachers();
}
