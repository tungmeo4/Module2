package Minitest.Tuan4;

public class Student extends Human{
    private double math;
    private double physic;
    private double chemistry;
    private double averagePoint = (math + physic + chemistry) / 3;

    public Student(String name, int age, double math, double physic, double chemistry, double averagePoint) {
        super(name, age);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.averagePoint = averagePoint;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "math=" + math +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
