package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "Color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ColorID;
    @Column(name = "NameColor", nullable = false, length = 40)
    private String NameColor;

    public Color() {
    }

    public Color(int colorID, String nameColor) {
        ColorID = colorID;
        NameColor = nameColor;
    }

    public int getColorID() {
        return ColorID;
    }

    public void setColorID(int colorID) {
        ColorID = colorID;
    }

    public String getNameColor() {
        return NameColor;
    }

    public void setNameColor(String nameColor) {
        NameColor = nameColor;
    }
}
