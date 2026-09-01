interface Confidential {
}

class PublicDocument {
    private String title;

    public PublicDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class SecretDocument implements Confidential {
    private String title;

    public SecretDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class docs {
    public static void checkConfidentiality(Object doc) {
        if (doc instanceof Confidential) {
            System.out.println("CONFIDENTIAL: This document contains sensitive information.");
        } else {
            System.out.println("PUBLIC: This document can be accessed publicly.");
        }
    }

    public static void main(String[] args) {
        PublicDocument doc1 = new PublicDocument("Company_Policy.pdf");
        SecretDocument doc2 = new SecretDocument("Financial_Report.pdf");

        System.out.print(doc1.getTitle() + " -> ");
        checkConfidentiality(doc1);

        System.out.print(doc2.getTitle() + " -> ");
        checkConfidentiality(doc2);
    }
}
