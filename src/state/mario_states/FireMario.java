package state.mario_states;

import state.mario.MarioContext;

public class FireMario implements State{

    private final MarioContext mario;

    public FireMario(MarioContext mario) {
        this.mario = mario;
    }

    @Override
    public void pickUpMushroom() {
        System.out.println("Mario picked up a Mushroom: + 1000 POINTS");
        mario.increasePoints(1000);
    }

    @Override
    public void pickUpFlower() {
        System.out.println("Mario picked up a Flower: + 1000 POINTS");
        mario.increasePoints(1000);
    }

    @Override
    public void pickUpFeather() {
        System.out.println("Mario picked up a Feather: turned into CAPE MARIO");
        mario.setCurrentState(new CapeMario(mario));
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario took damage: turned into BIG MARIO");
        mario.setCurrentState(new BigMario(mario));
    }
}