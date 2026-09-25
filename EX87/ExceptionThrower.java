class ExceptionThrower {
    
    public static void triggerRuntime(String type) {
        if (type.equals("null")) {
            throw new NullPointerException("Null value encountered");
        } else if (type.equals("index")) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        } else if (type.equals("argument")) {
            throw new IllegalArgumentException("Bad argument");
        }
    }
    
    public static void triggerArithmetic() {
        throw new ArithmeticException("Division error");
    }
    
    public static void triggerGeneric() {
        throw new RuntimeException("Generic runtime error");
    }
}
