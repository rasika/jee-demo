package com.example.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface Calculator {
    public double add(double x, double y);
}