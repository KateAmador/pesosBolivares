import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double pesos;
        double bolivares;

        pesos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir"));

        bolivares = pesos * 0.0014;

        JOptionPane.showMessageDialog(null,"CONVERSION\n" + pesos + " pesos son: " + bolivares + " bolivares");
    }
}