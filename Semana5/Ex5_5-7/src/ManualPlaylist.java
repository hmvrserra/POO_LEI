import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManualPlaylist implements Playlist {
    private String name;
    private List<Album.Song> songs;

    public ManualPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Album.Song song) {
        if (!songs.contains(song)) {
            songs.add(song);
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
        Set<Artist> artistsSet = new HashSet<>();
        for (Album.Song song : songs) {
            artistsSet.add(song.getArtist());
        }
        return new ArrayList<>(artistsSet);
    }

    @Override
    public List<Album.Song> getSongs() {
        return songs;
    }
}

