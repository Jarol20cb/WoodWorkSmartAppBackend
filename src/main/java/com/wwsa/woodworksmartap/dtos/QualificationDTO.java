package com.wwsa.woodworksmartap.dtos;

import javax.persistence.Column;

public class QualificationDTO {
    private int QualificationID;
    private int Qualification;

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
