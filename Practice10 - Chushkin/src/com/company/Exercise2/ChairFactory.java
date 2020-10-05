package com.company.Exercise2;

import java.util.Scanner;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(){
        Scanner sc = new Scanner(System.in);
        return new VictorianChair(sc.nextInt());
    }

    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}
