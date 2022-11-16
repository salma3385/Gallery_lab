import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private int purchaseArt;

    //     Constructor
    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;


    }

    //     Getters
    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }
    public int getPurchaseArt(){
    return this.purchaseArt;
    }

    //     Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    // Method
    public void purchaseArt(Gallery gallery, ArtWork artworkToBuy) {
        int totalArt = 0;
        ArrayList<ArtWork> artworks = gallery.getArtwork();
        for (ArtWork artwork : artworks) {
                if(artwork == artworkToBuy) {
                    totalArt = artwork.getPrice();
                    artwork.setPrice(0);
                    // reduce money in customers wallet
                    this.wallet -= totalArt;
                    // increase money in gallerys till
                    gallery.setTill(gallery.getTill() + totalArt);
                }
                this.purchaseArt = totalArt;

        }

        // totalArt = total of all artwork prices
    }
}

