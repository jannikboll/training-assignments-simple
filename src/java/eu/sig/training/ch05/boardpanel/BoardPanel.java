package eu.sig.training.ch05.boardpanel;

import java.awt.*;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param x
     *            The x position to start drawing.
     * @param y
     *            The y position to start drawing.
     * @param w
     *            The width of this square (in pixels).
     * @param h
     *            The height of this square (in pixels).
     */
    private void render(Square square, Graphics g) {
        square.draw(g);
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Span span) {

        }
    }

    private class Point {
        public int getX() { return 0; }
        public int getY() { return 0; }
    }

    private class Span {
        public Point getTopLeftPosition() { return null; }
        public Point getBottomRightPosition() { return null; }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }
        public Span getSpan() { return null; }

        public void draw(Graphics g) {
            getSprite().draw(g, getSpan());
            for (Unit unit : getOccupants()) {
                unit.getSprite().draw(g, getSpan());
            }
        }

    }

}
