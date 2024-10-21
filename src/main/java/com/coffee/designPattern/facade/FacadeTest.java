package com.coffee.designPattern.facade;

import com.coffee.designPattern.facade.device.*;
import com.coffee.designPattern.facade.theater.HomeTheaterFacade;

public class FacadeTest
{
    public static void main(String[] args) {
        Computer computer = new Computer();
        Light light = new Light();
        Player player = new Player();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(computer,light,player,popcornPopper,projector);
        homeTheaterFacade.stopMovie();
        homeTheaterFacade.watchMovie();
    }
}
