package com.springboot.apilayers.students;


import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String studentName;
    private Integer studentNumber;
    private String email;
    @Transient  //constructordan age i sil student verilerinden de age i sil. daha sonra getAge kısmında istediğin hesaplamayı yap
    private int studentAge;
    private String schoolName;

    public Student() {
    }

    public Student(Long id,
                   String studentName,
                   Integer studentNumber,
                   String email,
                   String schoolName) {
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.schoolName = schoolName;
    }

    public Student(String studentName,
                   Integer studentNumber,
                   String email,
                   String schoolName) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.schoolName = schoolName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentAge() {
        return 15;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", email='" + email + '\'' +
                ", studentAge=" + studentAge +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
