package com.designpatterns.structural.adapter;

/**
 * Created by Han on 2020/2/5
 */
public class MovableAdapterImpl implements MovableAdapter {
    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeedInKMPerHour() {
        return convertMPHtoKMPH(movable.getSpeedInMilesPerHour());

    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
