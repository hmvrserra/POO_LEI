import java.util.List;

public interface Playlist {
    String getName();
    Time getDuration();
    List<Artist> getArtists();
    List<Album.Song> getSongs();
}
