import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Estudante {
    public Estudante() {
        File file = new File("Semana2/Estudantes.txt");
        try{
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }

        catch (FileNotFoundException e){
            System.err.println("ficheiro não encontrado");
        }
    }
}
