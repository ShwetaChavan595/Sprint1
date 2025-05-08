package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.AttendanceReport;
import java.util.List;

/**
 * Interface for AttendanceReport Data Access Object (DAO).
 * This interface provides methods for performing CRUD operations 
 * on attendance report records in the database.
 */
public interface AttendanceReportDAO {

    /**
     * Save a new attendance report record to the database.
     *
     * @param attendanceReport The AttendanceReport object to be saved.
     */
    void saveAttendanceReport(AttendanceReport attendanceReport);

    /**
     * Retrieve a specific attendance report by its ID.
     *
     * @param reportId The unique ID of the attendance report.
     * @return The AttendanceReport object corresponding to the given ID.
     */
    AttendanceReport getAttendanceReport(Long reportId);

    /**
     * Update an existing attendance report in the database.
     *
     * @param attendanceReport The AttendanceReport object containing updated data.
     */
    void updateAttendanceReport(AttendanceReport attendanceReport);

    /**
     * Delete an attendance report from the database using its ID.
     *
     * @param reportId The unique ID of the attendance report to be deleted.
     */
    void deleteAttendanceReport(Long reportId);

    /**
     * Retrieve all attendance reports from the database.
     *
     * @return A list of all AttendanceReport objects stored in the system.
     */
    List<AttendanceReport> getAllAttendanceReports();
}
