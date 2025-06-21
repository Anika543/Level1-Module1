package _06_vault;

public class VaultRunner {
    public static void main(String[] args) {
        Vault v = new Vault();
        SecretAgent s = new SecretAgent();
        s.findCode(v);  
    }
    
}
