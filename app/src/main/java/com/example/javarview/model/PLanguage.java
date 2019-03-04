package com.example.javarview.model;

import java.util.Vector;

public class PLanguage {
    private Vector<String> name = new Vector<String>();
    private Vector<String> image = new Vector<String>();

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

        image.add("@drawable/csharp");
        image.add("@drawable/cplusplus");
        image.add("@drawable/java");
        image.add("@drawable/kotlin");
    }
}





