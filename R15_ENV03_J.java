/* Rule 15. Runtime Environment (ENV)
ENV03-J. Do not set the SecurityManager

Non-compliant code: */

public class SetSecurityManagerExample {
    public static void main(String[] args) {
        SecurityManager sm = new SecurityManager();
        System.setSecurityManager(sm);
    }
}

/* Corrected Code */

public class SetSecurityManagerExample {
    public static void main(String[] args) {
        // Ensure appropriate permissions before setting SecurityManager
        if (System.getSecurityManager() == null) {
            SecurityManager sm = new SecurityManager();
            System.setSecurityManager(sm);
        }
    }
}


