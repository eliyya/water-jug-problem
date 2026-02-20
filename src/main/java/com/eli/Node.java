package com.eli;

import java.util.ArrayList;

public class Node {
    private State state = new State();
    private ArrayList childrens = new ArrayList<Node>();

    public Node(int x, int y) {
        this.state = new State(x, y);
    }

    public Node(State state) {
        this.state = state;
    }

    public Node vaciarX() {
        if (state.x() > 0) {
            return new Node(state.setX(0));
        } else {
            throw new Error("X no contiene algo");
        }
    }

    public Node vaciarY() {
        if (state.y() > 0) {
            return new Node(state.setY(0));
        } else {
            throw new Error("Y no contiene algo");
        }
    }

    public Node llenarX() {
        if (state.x() < 3) {
            return new Node(state.setX(3));
        } else {
            throw new Error("Y no contiene algo");
        }
    }

    public Node llenarY() {
        if (state.x() < 3) {
            return new Node(state.setY(4));
        } else {
            throw new Error("Y no contiene algo");
        }
    }

    public Node PasarXaY() {
        if (state.x() == 0) {
            throw new Error("X no contiene nada");
        }
        if (state.y() == 4) {
            throw new Error("Y está lleno");
        }
        int ny = state.x() + state.y();
        int nx = 0;
        if (ny > 4) {
            nx = ny % 4;
            ny = 4;
        }
        return new Node(new State(nx, ny));
    }

    public Node PasarYaX() {
        if (state.y() == 0) {
            throw new Error("Y no contiene nada");
        }
        if (state.x() == 3) {
            throw new Error("X está lleno");
        }
        int nx = state.x() + state.y();
        int ny = 0;
        if (nx > 3) {
            ny = nx % 3;
            nx = 4;
        }
        return new Node(new State(nx, ny));
    }
}
