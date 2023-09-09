package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "Qualification")
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int QualificationID;
    @Column(name = "Qualification", nullable = false, length = 40)
    private int Qualification;

    public Qualification() {
    }

    public Qualification(int qualificationID, int qualification) {
        QualificationID = qualificationID;
        Qualification = qualification;
    }

    public int getQualificationID() {
        return QualificationID;
    }

    public void setQualificationID(int qualificationID) {
        QualificationID = qualificationID;
    }

    public int getQualification() {
        return Qualification;
    }

    public void setQualification(int qualification) {
        Qualification = qualification;
    }
}
