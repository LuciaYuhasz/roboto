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
class Hombre {
    public void jugarConRobot(Robot robot) {
        robot.avanzar(400);
        robot.retroceder(30);
        System.out.println("Energía actual del robot: " + robot.energiaActual());
        robot.dormir();
    }
}