package ex1;

import java.util.Scanner;

public class StudentEx2{
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

    public class StudentEx1 {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentEx2 student1 = new StudentEx2();

            System.out.println("-- 회원가입 --");
            System.out.println("-- 학과 입력 --");

            String name = sc.next();
            student1.setName(name);

            System.out.println("학번 입력 :");
            int id = sc.nextInt();
            student1.setId(id);

            System.out.println("학생1의 학과:" + student1.getName()+", 학번: " + student1.getId());

        }

    }
}




