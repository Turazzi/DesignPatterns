package state.mario;

import state.mario_states.DeadMario;

import java.util.Random;

public class MarioGameSimulation implements Runnable{

    private final MarioContext mario;
    private final Random rand;

    public MarioGameSimulation() {
        this.mario = new MarioContext();
        this.rand = new Random();
    }

    @Override
    public void run() {

        System.out.println("New run begins");

        while(!(mario.getCurrentState() instanceof DeadMario)) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Simulation interrupted.");
                Thread.currentThread().interrupt();
                return;
            }

            int event = rand.nextInt(4);

            switch (event) {
                case 0 -> mario.getCurrentState().takeDamage();
                case 1 -> mario.getCurrentState().pickUpFlower();
                case 2 -> mario.getCurrentState().pickUpFeather();
                case 3 -> mario.getCurrentState().pickUpMushroom();
            }
        }

        System.out.println("New run ends. Mario is DEAD");
        System.out.println("Total points: " + mario.getPoints());

    }
}


