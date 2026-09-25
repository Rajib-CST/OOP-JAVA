class UpperCaseFormatter implements TextFormatter {
    public String format(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter {
    public String format(String text) {
        return text.toLowerCase();
    }
}

class TitleCaseFormatter implements TextFormatter {
    public String format(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String word = words[i].toLowerCase();
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1));
                }
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}