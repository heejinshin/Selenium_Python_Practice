package ex1;

import java.util.Scanner;

class StudentEx2{
    private String name;
    private int id;

    void setName(String name) { // setter 네임
        this.name = name;
    }
    String getName() { // getter id
        return this.name+" 학과";
    }
    void setId(int id) {
        this.id = id;
    }
    int getId() {
        return this.id;
    }
}


