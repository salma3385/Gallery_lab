import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
    artist = new Artist ("David");
    }
    @Test
    public void canGetName(){
        //Arrange
        //Act
        String name = artist.getName();
        //Assert
        assertThat(name).isEqualTo("David");
    }

}
