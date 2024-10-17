import java.util.*;
import java.io.*;

public class AiTunas {

    private List<Album> albums;
    private List<Artist> artists;
    private List<Playlist> playlists;

    public AiTunas() {
        this.albums = new ArrayList<>();
        this.artists = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void load(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    albums.add(Album.load(file.getPath()));
                }
            }
        } else {
            throw new IllegalArgumentException("O caminho fornecido não é um diretório");
        }
    }

    public List<Album> getAllAlbums() {
        return this.albums;
    }

    public List<Artist> getAllArtists() {
        return this.artists;
    }

    public Artist findArtist(String name) {
        for (Artist artist : artists) {
            if (artist.getName().equals(name)) {
                return artist;
            }
        }
        throw new IllegalArgumentException("Artista não encontrado");
    }

    public boolean hasArtist(String name) {
        for (Artist artist : artists) {
            if (artist.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public List<Playlist> getAllPlaylists() {
        return playlists;
    }

    public Playlist findPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(name)) {
                return playlist;
            }
        }
        throw new IllegalArgumentException("Playlist not found");
    }
}

