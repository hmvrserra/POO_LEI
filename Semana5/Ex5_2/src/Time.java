public class Time {

    int totalSeconds;

    public Time(int minutes, int seconds) {
        if (seconds < 0 || seconds >= 60 || minutes < 0) {
            throw new IllegalArgumentException("Segundos devem ser menores que 60");
        }
        this.totalSeconds = minutes * 60 + seconds;
    }

    public Time(String time) {
        String[] parts = time.split(":");
        if(parts.length != 2) {
            throw new IllegalArgumentException("Formato inválido. Use mm:ss");
        }
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        if (seconds < 0 || seconds >= 60 || minutes < 0) {
            throw new IllegalArgumentException("Segundos devem ser menores que 60");
        }
        this.totalSeconds = minutes * 60 + seconds;
    }

    public int getMinutes() {
        return this.totalSeconds / 60;
    }

    public int getSeconds() {
        return this.totalSeconds % 60;
    }

    public int getTotalSeconds() {
        return this.totalSeconds;
    }

    public Time add(Time other) {
        int totalSeconds = this.getTotalSeconds() + other.getTotalSeconds();
        return new Time(totalSeconds / 60, totalSeconds % 60);
    }

    public Time subtract(Time other) {
        int totalSeconds = this.getTotalSeconds() - other.getTotalSeconds();
        return new Time(totalSeconds / 60, totalSeconds % 60);
    }

    public boolean isLessThan(Time other) {
        return this.getTotalSeconds() < other.getTotalSeconds();
    }

    public boolean isGreaterThan(Time other) {
        return this.getTotalSeconds() > other.getTotalSeconds();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.totalSeconds/60 , this.totalSeconds % 60);
    }
}
