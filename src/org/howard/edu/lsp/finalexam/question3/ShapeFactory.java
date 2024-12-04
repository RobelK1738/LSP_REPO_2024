package org.howard.edu.lsp.finalexam.question3;

// ShapeFactory (Singleton Implementation)
class ShapeFactory {
    // Singleton instance
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation
    private ShapeFactory() {}

    // Public method to get the single instance
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // Factory method to create shapes
    public Object getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null; // For unknown shape types
    }
}