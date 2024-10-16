import java.util.ArrayList;
import java.util.List;

public class Artist {

    String name;
    List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Album> getAlbums() {
        return new ArrayList<>(albums);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }
}
