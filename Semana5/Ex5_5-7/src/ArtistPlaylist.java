import java.util.ArrayList;
import java.util.List;

public class ArtistPlaylist implements Playlist {
    private String name;
    private Artist artist;
    private List<Album.Song> songs;

    public ArtistPlaylist(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
        loadSongs();
    }

    private void loadSongs() {
        // Load all songs from the artist's albums
        for (Album album : artist.getAlbums()) {
            songs.addAll(album.getSongs());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Time getDuration() {
        Time totalDuration = new Time(0, 0);
        for (Album.Song song : songs) {
            totalDuration = totalDuration.add(song.getDuration());
        }
        return totalDuration;
    }

    @Override
    public List<Artist> getArtists() {
        List<Artist> artistList = new ArrayList<>();
        artistList.add(artist);
        return artistList;
    }

    @Override
    public List<Album.Song> getSongs() {
        return songs;
    }
}

