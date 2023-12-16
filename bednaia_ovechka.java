
package Minecraft;
import java.lang.Math;
import java.awt.*;
public class bednaia_ovechka extends Animal {
    private static double hf = 8;
    public bednaia_ovechka(double ho, double x, double y, double z) {
        super(ho, x, y, z);
    }
    bednaia_ovechka(){

    }

    public static double get_Hf() {
        return hf;
    }
    public void change_HP(double damage){
        this.set_ho(get_ho()-damage);
    }

}
