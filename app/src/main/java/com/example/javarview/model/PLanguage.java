package com.example.javarview.model;

import java.util.Vector;

public class PLanguage {
    private Vector<String> name;
    private Vector<String> image;

    public Vector<String> getName() {
        return name;
    }

    public void setName(Vector<String> name) {
        this.name = name;
    }

    public Vector<String> getImage() {
        return image;
    }

    public void setImage(Vector<String> image) {
        this.image = image;
    }

    public PLanguage(){
        name.add("C#");
        name.add("C++");
        name.add("Java");
        name.add("Kotlin");

        image.add("@drawable/CSharp");
        image.add("@drawable/Cplusplus");
        image.add("@drawable/java");
        image.add("@drawable/kotlin");
    }
}





