import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class FileOperator {
    private File myFile;
    private Scanner fileScanner;
    
    public FileOperator(String url) throws IOException {
        setFile(url);
    }
    
    public FileOperator(String url, boolean isOnline) throws IOException {
        if (isOnline) {
            setUrl(url);
        } else {
            setFile(url);
        }
    }
    
    public void setFile(String f) throws IOException {
        myFile = new File(f);
        fileScanner = new Scanner(myFile);
    }
    
    public void setUrl(String fileName) throws IOException {
        URL url = new URL(fileName);
        fileScanner = new Scanner(url.openStream());
    }
    
    public String readLine() {
        if (fileScanner.hasNextLine()) {
            return fileScanner.nextLine();
        }
        return null;
    }
    
    public static void main(String[] args) {
        try {
            FileOperator fileOp = new FileOperator("https://people.sc.fsu.edu/~jburkardt/data/csv/airtravel.csv", true);
            
            String line;
            while ((line = fileOp.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}