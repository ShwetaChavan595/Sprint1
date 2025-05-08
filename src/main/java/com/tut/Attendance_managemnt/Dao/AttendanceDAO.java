package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Attendance;
import java.util.List;

/**
 * Interface for Attendance Data Access Object (DAO).
 * Defines methods for CRUD operations on Attendance data.
 */
public interface AttendanceDAO {

    /**
     * Save a new attendance record to the database.
     *
     * @param attendance The Attendance object to be saved.
     */
    void saveAttendance(Attendance attendance);

    /**
     * Retrieve a specific attendance record by its ID.
     *
     * @param attendanceId The ID of the attendance record.
     * @return The Attendance object corresponding to the given ID.
     */
    Attendance getAttendance(Long attendanceId);

    /**
     * Update an existing attendance record in the database.
     *
     * @param attendance The Attendance object with updated values.
     */
    void updateAttendance(Attendance attendance);

    /**
     * Delete an attendance record from the database by its ID.
     *
     * @param attendanceId The ID of the attendance record to be deleted.
     */
    void deleteAttendance(Long attendanceId);

    /**
     * Retrieve all attendance records from the database.
     *
     * @return A list of all Attendance objects.
     */
    List<Attendance> getAllAttendances();
}
