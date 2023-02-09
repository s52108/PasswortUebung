public class Password {

    private String name;
    private String encryption;
    private int sign;


    public void setSign(int sign) {
        if (sign < 0) {
            this.sign = 0;
        } else this.sign = sign;
    }

    public int validatePasswordStrength() {
        int strength = 0;
        if (sign < 8) {
            strength = 0;
        } else if (sign < 10) {
            strength = 1;
        } else if (sign < 12) {
            strength = 2;
        } else if (sign < 14) {
            strength = 3;
        }
        return strength;
    }

    public Password(String name, String encryption, int sign) {
        this.name = name;
        this.encryption = encryption;
        setSign(sign);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Password{" +
                "name='" + name + '\'' +
                ", encryption='" + encryption + '\'' +
                ", sign=" + sign +
                '}';
    }

    public static void main(String[] args) {
        Password password = new Password("test1", "asdasd", 8);
        System.out.println(password.toString());
    }
}
