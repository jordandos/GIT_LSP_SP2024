package org.howard.edu.lsp.oopfinal.question3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }
}

