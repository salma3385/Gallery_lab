public class ArtWork {

    private String title;
    private Artist artist;
    private int price;
    private int nft;

//     Constructor
    public ArtWork(String title, Artist artist, int price, int nft){
    this.title = title;
    this.artist = artist;
    this.price = price;
    this.nft = nft;
    }

//     Getters
    public String getTitle(){
    return this.title;
    }
    public Artist getArtist(){
    return this.artist;
    }
    public int getPrice(){
    return this.price;
    }
    public int getNft(){
    return this.nft;
    }

//     Setters
    public void setTitle(String title){
    this.title = title;
    }
    public void setArtist(Artist artist){
    this.artist = artist;
    }
    public void setPrice(int price){
    this.price = price;
    }
    public void setNft(int nft){
    this.nft = nft;
    }
}
