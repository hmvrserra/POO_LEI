import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Album {

    private String name;
    private int year;
    private List<String> artists;
    private List<Song> songs;

    public Album(String name, int year, List<String> artists) {
        this.name = name;
        this.year = year;
        this.artists = new ArrayList<>(artists);
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getArtists() {
        return new ArrayList<>(artists);
    }

    public List<Song> getSongs() {
        return new ArrayList<>(songs);
    }

    public void addSong(int trackNumber, String title, String duration) {
        songs.add(new Song(trackNumber, title, duration));
    }

    public Time getDuration() {
        Time duration = new Time(0, 0);
        for (Song song : songs) {
            duration.add(song.duration);
        }
        return duration;
    }

    public Artist getArtist(String name) {
        return new Artist(name);
    }

    public static Album load(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));

            String name = scanner.nextLine();
            int year = Integer.parseInt(scanner.nextLine());
            List<String> artists = new ArrayList<>();
            String artist;

            while (!(artist = scanner.nextLine()).isEmpty()) {
                artists.add(artist);
            }

            Album album = new Album(name, year, artists);

            while (scanner.hasNextLine()) {
                String[] songData = scanner.nextLine().split(" ", 2);
                String duration = songData[0];
                String title = songData[1];
                album.addSong(album.getSongs().size() + 1, title, duration);
            }
            scanner.close();
            return album;
        }
        catch (FileNotFoundException e) {
            System.err.println("Ficheiro não encontrado: " + file);
        }
        return null;
    }

    public void sortByDuration() {
        songs.sort((s1, s2) -> s1.duration.isGreaterThan(s2.duration) ? -1 : 1);
    }

    public void sortByName() {
        songs.sort((s1, s2) -> s1.title.compareTo(s2.title));
    }

    public void sortByTrackNumber() {
        songs.sort((s1, s2) -> s1.trackNumber - s2.trackNumber);
    }
    @Override
    public String toString() {
        String result = "Album: " + name + " (" + year + ")\n";
        result += "Artists: " + String.join(", ", artists) + "\n";
        result += "Songs:\n";
        for (Song song : songs) {
            result += "  " + song + "\n";
        }
        return result;
    }

    public class Song {
        private int trackNumber;
        private String title;
        private Time duration;
        public Song(int trackNumber, String title, String duration) {
            this.trackNumber = trackNumber;
            this.title = title;
            this.duration = new Time(duration);
        }

            public int getTrackNumber() {
                return trackNumber;
            }

            public String getTitle() {
                return title;
            }

            public Time getDuration() {
                return duration;
            }

            public Artist getArtist() {
                return Album.this.getArtist(artists.get(0));
            }

            @Override
            public String toString() {
                return trackNumber + " - " + title + " (" + duration + ")";
            }


    }
}
