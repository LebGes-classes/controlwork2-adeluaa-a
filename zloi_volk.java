package Minecraft;

import java.lang.Math;
public class zloi_volk extends Animal{
    private static double hf = 20;
    public static int d = 4;

    public zloi_volk(double ho, double x, double y, double z) {
        super(ho, x, y, z);
    }
    zloi_volk(){

    }

    public static double getHf() {
        return hf;
    }

    public static int getD() {
        return d;
    }
    public double get_r(bednaia_ovechka bednaia_ovechka){
        double[] volk_cords = this.get_cords(this);
        double[] bednaia_ovechka_cords_cords = bednaia_ovechka.get_cords(bednaia_ovechka);
        double r = Math.pow((Math.pow((volk_cords[0]-bednaia_ovechka_cords_cords[0]), 2)
                - Math.pow((volk_cords[1]-bednaia_ovechka_cords_cords[1]), 2)
                - Math.pow((volk_cords[2]-bednaia_ovechka_cords_cords[2]), 2)), 0.5);
        return r;
    }

    public boolean is_zloi_volk_close(bednaia_ovechka bednaia_ovechka){
        boolean is_close = false;
        if (this.get_r(bednaia_ovechka) <= 1){
            is_close = true;
        }
        return is_close;
    }
    public double atacka(bednaia_ovechka bednaia_ovechka){
        double damage = 0;
        if (this.is_zloi_volk_close(bednaia_ovechka)){
            damage = ((this.get_ho()/this.hf)*this.d)/(Math.pow(this.get_r(bednaia_ovechka), 2));
        }
        return damage;
    }

    public double vremia(bednaia_ovechka bednaia_ovechka){
        double time = 0;
        double damage = this.atacka(bednaia_ovechka);
        if (damage == 0){
            System.out.println("Волк не убьёт овцу");
            return time;
        }
        time = bednaia_ovechka.get_ho()/damage;

        return time;
    }
}
