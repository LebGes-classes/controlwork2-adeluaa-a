package Minecraft;

public class Animal {
    public static double hf;
    private double ho; //здоровье
    private double x, y, z;
    public Animal(double x, double y, double z, double h) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ho = ho;
    }
    Animal() {

    }
    public double get_ho() {
        return ho;
    }
    public void set_ho(double ho) {
        this.ho = ho;
    }
    public double get_hf() {
        return hf;
    }
    public void set_hf(double hf) {
        this.hf = hf;
    }

    public double get_x() {
        return x;
    }

    public void set_x(double x) {
        this.x = x;
    }

    public double get_y() {
        return y;
    }

    public void set_y(double y) {
        this.y = y;
    }

    public double get_z() {
        return z;
    }

    public void set_z(double z) {
        this.z = z;
    }
    public double[] get_cords(Animal animal){
        double x = this.get_x();
        double y = this.get_y();
        double z = this.get_z();
        return new double[] {x, y, z};
    }
}

