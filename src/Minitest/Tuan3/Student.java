package Minitest.Tuan3;

public class Student extends Human{
    private double Math;
    private double Physic;
    private double Chemistry;
    private double AveragePoint;

    public Student(String name, int age, double math, double physic, double chemistry, double averagePoint) {
        super(name, age);
        Math = math;
        Physic = physic;
        Chemistry = chemistry;
        AveragePoint = averagePoint;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getPhysic() {
        return Physic;
    }

    public void setPhysic(double physic) {
        Physic = physic;
    }

    public double getChemistry() {
        return Chemistry;
    }

    public void setChemistry(double chemistry) {
        Chemistry = chemistry;
    }

    public double getAveragePoint() {
        return AveragePoint;
    }

    public void setAveragePoint(double averagePoint) {
        AveragePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "Math=" + Math +
                ", Physic=" + Physic +
                ", Chemistry=" + Chemistry +
                ", AveragePoint=" + AveragePoint +
                '}';
    }
}
