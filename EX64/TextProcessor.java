class TextProcessor {
    private StringTransformer transformer;
    
    public TextProcessor(StringTransformer transformer) {
        this.transformer = transformer;
    }
    
    public String process(String text) {
        return transformer.transform(text);
    }
}
