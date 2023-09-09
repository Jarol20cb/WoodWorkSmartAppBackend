package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Color;

import java.util.List;

public interface ColorService {
    public void insert(Color Clr);
    public List<Color> list();
    public void delete(int ColorID);
    public Color listId(int ColorID);
}
