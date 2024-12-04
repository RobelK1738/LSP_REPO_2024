package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {

    @Test
    void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Object shape = factory.getShape("circle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Circle, "Shape should be an instance of Circle");
    }

    @Test
    void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Object shape = factory.getShape("rectangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Rectangle, "Shape should be an instance of Rectangle");
    }

    @Test
    void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Object shape = factory.getShape("triangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Object shape = factory.getShape("hexagon");
        assertNull(shape, "Shape should be null for unknown shape types");
    }
}

