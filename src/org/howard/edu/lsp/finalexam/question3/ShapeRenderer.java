package org.howard.edu.lsp.finalexam.question3;

// ShapeRenderer Class
public class ShapeRenderer {
    private final ShapeFactory factory;

    // Constructor injecting the ShapeFactory instance
    public ShapeRenderer() {
        this.factory = ShapeFactory.getInstance();
    }

    // Render shapes using the factory
    public void renderShape(String shapeType) {
        Object shape = factory.getShape(shapeType);
        if (shape instanceof Circle) {
            ((Circle) shape).draw();
        } else if (shape instanceof Rectangle) {
            ((Rectangle) shape).draw();
        } else if (shape instanceof Triangle) {
            ((Triangle) shape).draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    // Main Method for Testing
    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}