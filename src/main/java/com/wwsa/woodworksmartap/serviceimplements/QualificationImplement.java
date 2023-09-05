package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.Qualification;
import com.wwsa.woodworksmartap.entities.User;
import com.wwsa.woodworksmartap.repositories.IQualificationRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualificationImplement implements QualificationService {
    @Autowired
    private IQualificationRepository qL;


    @Override
    public void insert(Qualification qualification) {
        qL.save(qualification);
    }

    @Override
    public List<Qualification> list() {
        return qL.findAll();
    }

    @Override
    public void delete(int QualificationID) {
        qL.deleteById(QualificationID);
    }

    @Override
    public Qualification listId(int QualificationID) {
        return qL.findById(QualificationID).orElse(new Qualification());
    }


}
