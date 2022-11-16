import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtWorkTest {
    ArtWork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artwork = new ArtWork("Sunflower",artist, 30, 5432);
    }
    @Test
    public void canGetArtWork(){
        String title = artwork.getTitle();
        assertThat(title).isEqualTo("Sunflower");
    }
    }

