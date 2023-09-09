package com.wwsa.woodworksmartap.servicesinterfaces;
import com.wwsa.woodworksmartap.entities.Carpenter;
import java.util.List;

public interface CarpenterService {
    public void insert(Carpenter Cpt);
    public List<Carpenter> list();
    public void delete(int CarpenterID);
    public Carpenter listId(int CarpenterID);
}
