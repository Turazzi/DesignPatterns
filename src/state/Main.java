package state;

import state.mario.MarioContext;
import state.mario.MarioGameSimulation;
import state.mario_states.DeadMario;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MarioGameSimulation simulation = new MarioGameSimulation();
        simulation.run();
    }
}
