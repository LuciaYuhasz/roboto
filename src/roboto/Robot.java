/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roboto;

/**
 *
 * @author Usuario
 */
class Robot {
    private final Bateria battery;
    private boolean sleeping;

    public Robot() {
        battery = new Bateria(1000);
        sleeping = false;
    }

    public void avanzar(int pasos) {
        if (!sleeping && !bateriaVacia()) {
            int energyLoss = pasos / 100 * 10;
            battery.setCarga(battery.getCarga() - energyLoss);
        }
    }

    public void retroceder(int pasos) {
        if (!sleeping && !bateriaVacia()) {
            int energyLoss = pasos / 100 * 10;
            battery.setCarga(battery.getCarga() - energyLoss);
        }
    }

    public void dormir() {
        sleeping = true;
    }

    public void despertar() {
        sleeping = false;
    }

    public void recargar() {
        if (!sleeping) {
            battery.setCarga(1000);
        }
    }

    public boolean bateriaLLena() {
        return battery.getCarga() >= 1000;
    }

    public boolean bateriaVacia() {
        return battery.getCarga() <= 0;
    }

    public int energiaActual() {
        return battery.getCarga();
    }
}
