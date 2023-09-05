package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Qualification;
import com.wwsa.woodworksmartap.entities.User;

import java.util.List;

public interface QualificationService {
    public void insert(Qualification qualification);
    public List<Qualification> list();
    public void delete(int QualificationID);
    public Qualification listId(int QualificationID);
}
