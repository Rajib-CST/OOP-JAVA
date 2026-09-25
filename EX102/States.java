class DraftState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Editing draft...");
    }
    
    public void approve(Document doc) {
        System.out.println("Draft approved. Moving to review.");
        doc.setState(new ReviewState());
    }
}

class ReviewState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Cannot edit during review.");
    }
    
    public void approve(Document doc) {
        System.out.println("Review complete. Publishing document.");
        doc.setState(new PublishedState());
    }
}

class PublishedState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Cannot edit published document.");
    }
    
    public void approve(Document doc) {
        System.out.println("Document already published.");
    }
}
