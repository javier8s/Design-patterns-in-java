package abstractfactory.examples.ufo.factories;

import abstractfactory.examples.ufo.parts.ShipEngine;
import abstractfactory.examples.ufo.parts.ShipWeapon;


public abstract class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();

}
