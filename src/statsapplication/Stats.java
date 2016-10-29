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
public class Stats {

    double[] data;
    int number;
    private String dataCon = "";

    public Stats(double[] data) {
        this.data = data;
    }

    public Stats(int number) {
        this.number = number;
        data = new double[number];
        for (int i = 0; i < number; i++) {
            data[i] = 0.0;
        }
        new Stats(data);
    }

    public int getNumber() {
        return data.length;
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < number; i++) {
            total = total + data[i];
        }
        return total;
    }

    public double getMax() {
        double max = data[0];
        for (int i = 0; i < getNumber(); i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public double getMin() {
        double min = data[0];
        for (int i = 0; i < getNumber(); i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public double getAverage() {
        return getTotal() / getNumber();
    }

    public void displayData() {
        getSummary();
        for (int i = 0; i < getNumber(); i++) {
            dataCon = dataCon + data[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, dataCon);
    }

    public void randomFill(double min, double max) {
        for (int i = 0; i < getNumber(); i++) {
            data[i] = Math.random() * (max - min) + min;
        }
        displayData();
    }

    public void userFill() {

        for (int i = 0; i < getNumber(); i++) {
            data[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter data (0.0)"));
        }
        displayData();
    }

    public String getSummary() {
        return "Stats{" + "data=" + data + ", number=" + number + '}';
    }

}
