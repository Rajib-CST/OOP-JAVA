class Document {
    private DocumentState state;
    
    public Document() {
        this.state = new DraftState();
    }
    
    public void setState(DocumentState state) {
        this.state = state;
    }
    
    public void edit() {
        state.edit(this);
    }
    
    public void approve() {
        state.approve(this);
    }
    
    public String getStatus() {
        return state.getClass().getSimpleName();
    }
}
