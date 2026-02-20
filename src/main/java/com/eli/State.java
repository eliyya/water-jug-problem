package com.eli;

public record State(int x, int y) {
    State setX(int x){
        return new State(x, y);
    }
    State setY(int x){
        return new State(x, y);
    }
}
