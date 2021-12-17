package minitest.model;

public class Student extends Human{
    private double avg;

    public Student(double avg) {
        this.avg = avg;
    }

    public Student(String name, int age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "HocVien{" + super.toString() + "avg=" + avg + '}';
    }
}
