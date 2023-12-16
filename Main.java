package Minecraft;

public class Main {
    public static void main(String args[]){
        zloi_volk zloi_volk = new zloi_volk(20, 0, 0, 0);
        bednaia_ovechka bednaia_ovechka = new bednaia_ovechka(7, 1, 0, 0);
        System.out.println(zloi_volk.vremia(bednaia_ovechka));
    }
}
