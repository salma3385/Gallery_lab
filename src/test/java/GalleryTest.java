import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryTest {
    Gallery gallery;
    Artist artist;
    ArtWork artwork;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("BNTA");
        artist = new Artist("David");
        artwork = new ArtWork("Sunflower", artist, 30, 5432);
    }

    //     Getter and Setter for Name
    @Test
    public void hasName() {
        String name = gallery.getName();
        assertThat(name).isEqualTo("BNTA");
    }

    @Test
    public void canSetName() {
        gallery.setName("Angel Delights");
        assertThat(gallery.getName()).isEqualTo("Angel Delights");
    }

    //     Getter and Setter for Till
    @Test
    public void hasTill() {
        int till = gallery.getTill();
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill() {
        gallery.setTill(6);
        assertThat(gallery.getTill()).isEqualTo(6);
    }

    //     Getter and Setter for stock
    @Test
    public void hasStock() {
        int stock = gallery.getStock();
        assertThat(gallery.getStock()).isEqualTo(0);
    }

    @Test
    public void canSetStock() {
        gallery.setStock(3);
        assertThat(gallery.getStock()).isEqualTo(3);

    }
}
