import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password weak;

    @BeforeEach
    void setUp(){
        Password weak = new Password("weak","only signs",7);
        Password medium = new Password("medium","only signs+digits",9);
        Password strong = new Password("strong","signs+digits",12);
        Password undefined = new Password("undefined","?",-5);

    }

    @org.junit.jupiter.api.Test
    void testValidatePasswordStrength() {

        Assertions.assertEquals(0,weak.validatePasswordStrength());
    }
}