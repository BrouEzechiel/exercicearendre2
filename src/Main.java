import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\Downloads\\TestExercice3.txt");
        int total = 0;

        try  {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine().trim(); // Supprime les espaces en début/fin
                if (!ligne.isEmpty()) { // Ignore les lignes vides
                    String[] words = ligne.split(" "); // Gère les espaces multiples
                    total += words.length;
                }
            }
            System.out.println("Total des mots: " + total);
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé : " + e.getMessage());
        }
    }
}