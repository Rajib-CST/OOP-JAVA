class ExceptionAnalyzer {
    
    public static void analyzeSpecific(String type) {
        try {
            ExceptionThrower.triggerRuntime(type);
        } catch (NullPointerException e) {
            System.out.println("Caught specific: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught specific: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught specific: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
    
    public static void analyzeWithParent() {
        try {
            ExceptionThrower.triggerArithmetic();
        } catch (RuntimeException e) {
            System.out.println("Caught via parent: RuntimeException");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }
    
    public static void analyzeWithGrandparent() {
        try {
            ExceptionThrower.triggerGeneric();
        } catch (Exception e) {
            System.out.println("Caught via grandparent: Exception");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }
}
