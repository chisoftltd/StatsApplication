/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsapplication;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class StatsApplication {

    private static int max;
    private static int min;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        Stats stats = new Stats(userInput);

        do {
            userInput = Integer.parseInt(JOptionPane.showInputDialog("1 - Get number of data\n"
                    + "2 - Get total data\n3 - Get Max of data\n4 - Get min of data\n5 - Get Average\n"
                    + "6 - Display data\n7 - User filling of data\n8 - Automated filling of data\n"
                    + "9 - Get data summary\n10 - Quit"));

            switch (userInput) {
                case 1:
                    JOptionPane.showMessageDialog(null,stats.getNumber());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,stats.getTotal());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,stats.getMax());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,stats.getMin());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,stats.getAverage());
                    break;
                case 6:
                    stats.displayData();
                    break;
                case 7:
                    stats.userFill();
                    break;
                case 8:
                    max = Integer.parseInt(JOptionPane.showInputDialog("What is the range\nEnter a max number"));
                    min = Integer.parseInt(JOptionPane.showInputDialog("Enter a min number"));
                    stats.randomFill(min, max);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,stats.getSummary());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "THanks for using my application.", "APPLICATION ENDS", JOptionPane.CLOSED_OPTION);
            }
        } while (userInput != 10);
    }

}
