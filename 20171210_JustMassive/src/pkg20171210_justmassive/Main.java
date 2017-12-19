/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171210_justmassive;

/**
 *
 * @author _smil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

    public int[] DivMassive(int aStart, int aFinish, int Step) {

        int[] Mass = new int[(int) Math.ceil((float) aFinish / Step)];

        for (int i = 0, j = aStart; i < Mass.length; i++, j += Step) {
            Mass[i] = j;
        }
        return Mass;
    }

    public void ShowMassive(int[] aMass, boolean aLn) {
        for (int i = 0; i < aMass.length; i++) {
            if (aLn) {
                System.out.println(aMass[i]);
            } else {
                System.out.print(aMass[i] + " ");
            }

        }
        System.out.println("");
    }

    public int[] ReverceMassive(int[] aMass) {
        int[] Mass = new int[aMass.length];

        for (int i = 0; i < aMass.length; i++) {
            Mass[i] = aMass[aMass.length - i - 1];
        }
        return Mass;
    }

    public Main() {
        int[] Mass = DivMassive(2, 20, 2);
        ShowMassive(Mass, false);
        ShowMassive(Mass, true);

        int[] Mass2 = DivMassive(1, 99, 2);
        ShowMassive(Mass2, false);
        ShowMassive(Mass2, true);
        
        Mass2 = ReverceMassive(Mass2);
        ShowMassive(Mass2, false);
    }

}
