class NumberProcessor {
    private NumberTransformer transformer;

    public NumberProcessor(NumberTransformer transformer) {
        this.transformer = transformer;
    }

    public int process(int number) {
        return transformer.transform(number);
    }
}
