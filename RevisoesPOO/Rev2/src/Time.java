public class Time {

	private final int minutos;
	private final int segundos;
	
	public Time(int minutos, int segundos) {
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public Time(String time) {
		String[] fields = time.split(":");
		minutos = Integer.parseInt(fields[0]);
		segundos = Integer.parseInt(fields[1]);
	}
	
	public int totalSeconds () {
		return 60*minutos + segundos;
	}
	
	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public String toString() {
		return minutos + ":" + String.format("%02d", segundos);
	}
}