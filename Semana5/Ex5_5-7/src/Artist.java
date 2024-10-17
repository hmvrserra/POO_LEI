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
        if (!albums.contains(album)) {
            albums.add(album);
        }
    }

    public boolean hasAlbum(Album album) {
        return albums.contains(album);
    }



    @Override
    public String toString() {
        return "Artist{name='" + name + "', albums=" + albums.size() + "}";
    }
}
