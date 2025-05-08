package com.tut.Attendance_managemnt.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;

    private LocalDate attendanceDate;
    private String attendanceStatus;
    private String remarks;

    // No-arg constructor
    public Attendance() {}

    // Constructor with parameters
    public Attendance(Student student, Teacher teacher, Subject subject, ClassEntity classEntity,
                      LocalDate attendanceDate, String attendanceStatus, String remarks) {
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
        this.classEntity = classEntity;
        this.attendanceDate = attendanceDate;
        this.attendanceStatus = attendanceStatus;
        this.remarks = remarks;
    }

    // Getters and setters
    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceID=" + attendanceID +
                ", student=" + student +
                ", teacher=" + teacher +
                ", subject=" + subject +
                ", classEntity=" + classEntity +
                ", attendanceDate=" + attendanceDate +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
