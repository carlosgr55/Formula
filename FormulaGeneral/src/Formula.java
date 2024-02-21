
import javax.swing.JOptionPane;


public class Formula {

    private byte cTC, cTL, cTI;

    public Formula(byte cTC, byte cTL, byte cTI) {
        this.cTC = cTC;
        this.cTL = cTL;
        this.cTI = cTI;
    }

    public Formula() {
        cTC = 1;
        cTL = cTI = 0;
    }

    public byte getcTC() {
        return cTC;
    }

    public void setcTC(byte cTC) {
        this.cTC = cTC;
    }

    public byte getcTL() {
        return cTL;
    }

    public void setcTL(byte cTL) {
        this.cTL = cTL;
    }

    public byte getcTI() {
        return cTI;
    }

    public void setcTI(byte cTI) {
        this.cTI = cTI;
    }

    private boolean sePuede() {
        double radical = (cTL * cTL) - (4 * cTC * cTI);
        if (radical >= 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La raiz es imaginaria, no se puede realizar");
            return false;
        }
    }

    public double x1() {
        if (sePuede()) {
            double raiz = Math.sqrt((cTL * cTL) + (4 * cTC * cTI));
            return (-1 * cTL + raiz) / (2 * cTC);
        }
        else{
            return -1;
        }
    }

    public double x2() {
        if (sePuede()) {
            double raiz = Math.sqrt((cTL * cTL) - (4 * cTC * cTI));
            return (-1 * cTL + raiz) / (2 * cTC);
        }
        else{
            return -1;
        }
    }

}
