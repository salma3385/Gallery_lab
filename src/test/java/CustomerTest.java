import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    ArtWork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        customer = new Customer ("Lucy", 50);
        gallery = new Gallery ("BNTA");
        artist = new Artist("David");
        artwork = new ArtWork ("Sunflower", artist, 30, 5432);
        }

    @Test
            public void canPurchaseArt(){
//     Arrange
   ArtWork artwork1 = new ArtWork("Sunflower",artist,30,5432);
   Gallery gallery1 = new Gallery("bnta");
   Customer customer1 = new Customer("Lucy",50);
   customer.purchaseArt(gallery1, artwork1);
//     Act

//     Assert
        int purchaseArt = customer.getPurchaseArt();
        assertThat(purchaseArt).isEqualTo(20);
}

}
