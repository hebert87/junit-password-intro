import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //ARRANGE
        String password = "hey";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("short", actual);
    }
    @Test 
    void  testDescribePasswordLengthExactly12Chr (){
        //Arrange 
        String password = "helloSdev220";
        //Act 
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }
    @Test 
    void  testDescribePasswordLengthMedium (){
        //Arrange 
        String password = "helloSdv";
        //Act 
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("medium", actual);
    }

    @Test
    void  testIfAlphanumeric (){

        //Arrange

        String alp = "abcdfgggg!";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(alp);

        //assert
        assertEquals(false, actual);
    }
    @Test
    void  testIfSpecailChar (){

        //Arrange

        String alp = "!";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(alp);

        //assert
        assertEquals(false, actual);
    }
    @Test
    void  testIfNumber (){

        //Arrange

        String alp = "2222";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(alp);

        //assert
        assertEquals(true, actual);
    }
    @Test
    void  testIfSpecailCharandalphanumeric (){

        //Arrange

        String alp = "abc123!!!";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(alp);

        //assert
        assertEquals(false, actual);
    }
}
