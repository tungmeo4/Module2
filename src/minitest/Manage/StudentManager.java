package minitest.Manage;

import minitest.model.Student;

import java.util.ArrayList;

public class StudentManager implements Manage{
    static private int id = 1;
    static private int index = 0;
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public void show() {
        for (Student std : students) {
            System.out.println(std);
        }
    }

    @Override
    public void add() {
        String name =
    }

    @Override
    public void findById() {

    }

    @Override
    public void deleteById() {

    }

    @Override
    public void editById() {

    }

    @Override
    public void sort() {

    }

    @Override
    public void totalAvg() {

    }
}
