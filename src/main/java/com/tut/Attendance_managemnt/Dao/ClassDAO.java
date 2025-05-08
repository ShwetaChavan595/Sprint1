package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.ClassEntity;
import java.util.List;

/**
 * Interface for ClassEntity Data Access Object (DAO).
 * This interface provides methods to perform CRUD operations on class data.
 */
public interface ClassDAO {

    /**
     * Save a new class record to the database.
     *
     * @param classEntity The ClassEntity object to be saved.
     */
    void saveClass(ClassEntity classEntity);

    /**
     * Retrieve a class record by its ID.
     *
     * @param classId The unique ID of the class.
     * @return The ClassEntity object associated with the given ID.
     */
    ClassEntity getClass(Long classId);

    /**
     * Update an existing class record in the database.
     *
     * @param classEntity The ClassEntity object containing updated data.
     */
    void updateClass(ClassEntity classEntity);

    /**
     * Delete a class record from the database using its ID.
     *
     * @param classId The unique ID of the class to be deleted.
     */
    void deleteClass(Long classId);

    /**
     * Retrieve all class records from the database.
     *
     * @return A list of all ClassEntity objects.
     */
    List<ClassEntity> getAllClasses();
}
