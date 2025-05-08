package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Subject;
import java.util.List;

/**
 * Interface for Subject Data Access Object (DAO).
 * Defines CRUD operations for managing Subject entities in the database.
 */
public interface SubjectDAO {

    /**
     * Save a new subject record to the database.
     *
     * @param subject The Subject object to be saved.
     */
    void saveSubject(Subject subject);

    /**
     * Retrieve a specific subject record by its ID.
     *
     * @param subjectId The unique ID of the subject.
     * @return The Subject object associated with the given ID.
     */
    Subject getSubject(Long subjectId);

    /**
     * Update an existing subject record in the database.
     *
     * @param subject The Subject object with updated details.
     */
    void updateSubject(Subject subject);

    /**
     * Delete a subject record from the database using its ID.
     *
     * @param subjectId The unique ID of the subject to be deleted.
     */
    void deleteSubject(Long subjectId);

    /**
     * Retrieve all subject records from the database.
     *
     * @return A list of all Subject objects.
     */
    List<Subject> getAllSubjects();
}
