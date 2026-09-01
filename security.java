interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuth();
    void faceRecognitionAuth();
}

class BankingApplication implements AdvancedSecurity {
    
    public void login() {
        System.out.println("User logged in successfully.");
    }

    
    public void logout() {
        System.out.println("User logged out successfully.");
    }

    
    public void fingerprintAuth() {
        System.out.println("Fingerprint authentication successful.");
    }

    
    public void faceRecognitionAuth() {
        System.out.println("Face recognition authentication successful.");
    }
}

public class security {
    public static void main(String[] args) {
        AdvancedSecurity bankApp = new BankingApplication();

        bankApp.login();
        bankApp.fingerprintAuth();
        bankApp.faceRecognitionAuth();
        bankApp.logout();
    }
}
