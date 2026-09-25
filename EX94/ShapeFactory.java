class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        } else if (type.equals("triangle")) {
            return new Triangle();
        }
        return null;
    }
}
