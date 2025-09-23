package com.java17.sealed;

public sealed interface Shape permits Circle, Rectangle{
    public void area(int r);
}
