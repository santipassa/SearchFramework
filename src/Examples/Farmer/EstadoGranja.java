/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples.Farmer;

/**
 *
 * @author santiago
 */
import Framework.State;

public class EstadoGranja extends State {

    public int granjero;
    public int zorro;
    public int gallina;
    public int maiz;

    public EstadoGranja() {
        granjero = 1;
        zorro = 1;
        gallina = 1;
        maiz = 1;
    }

    public EstadoGranja(int granjero, int zorro, int gallina, int maiz) {
        this.granjero = granjero;
        this.zorro = zorro;
        this.gallina = gallina;
        this.maiz = maiz;
    }

    public static boolean igualSigno(int x, int y) {
        if (x == 0 && y == 0) {
            return true;
        }
        if (x > 0 && y > 0) {
            return true;
        }
        if (x < 0 && y < 0) {
            return true;
        }
        return false;
    }

    public boolean equals(State other) {
        EstadoGranja sg = (EstadoGranja) other;
        return (igualSigno(granjero, sg.granjero) && igualSigno(zorro, sg.zorro)
                && igualSigno(gallina, sg.gallina) && igualSigno(maiz, sg.maiz));
    }

    public String toString() {
        return ("(" + granjero + "," + zorro + "," + gallina + "," + maiz + ")");
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}
