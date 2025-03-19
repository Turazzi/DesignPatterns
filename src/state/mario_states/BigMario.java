package state.mario_states;

import state.mario.MarioContext;

public class BigMario implements State {

    private final MarioContext mario;

    public BigMario(MarioContext mario) {
        this.mario = mario;
    }

    @Override
    public void pickUpMushroom() {
        System.out.println("Big Mario picked up a Mushroom: + 1000 POINTS");
        mario.increasePoints(1000);
    }

    @Override
    public void pickUpFlower() {
        System.out.println("Big Mario picked up a Flower: turned into FIRE MARIO");
        mario.setCurrentState(new FireMario(mario));
    }

    @Override
    public void pickUpFeather() {
        System.out.println("Big Mario picked up a Feather: turned into CAPE MARIO");
        mario.setCurrentState(new CapeMario(mario));
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario took damage: turned into SMALL MARIO");
        mario.setCurrentState(new SmallMario(mario));
    }
}