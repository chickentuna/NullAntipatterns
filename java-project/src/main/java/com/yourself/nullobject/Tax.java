package com.yourself.nullobject;

/**
 * A Tax object will perform an operation on a given price and return the new price.
 * 
 * Tax is a functional interace, which means it can be implemented by a simple lambda
 */

public interface Tax {
    double apply(double price);
}
