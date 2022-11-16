import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private int stock;
    private ArrayList<ArtWork> artwork;

    // Constructor
    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = 0;
        this.artwork = new ArrayList<ArtWork>();
    }
    // GETTERS
    public String getName(){
        return this.name;
    }
    public int getTill(){
        return this.till;
    }
    public int getStock(){
        return this.stock;
    }
    public  ArrayList<ArtWork> getArtwork(){
        return this.artwork;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setTill(int till){
        this.till = till;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setArtwork(ArrayList<ArtWork>artwork){
    this.artwork = artwork;
    }
    
}