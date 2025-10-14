import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TestStudentCode {

    private String[] sampleLines = readStringsFromFile("src\\main\\java\\sample.txt");
    private String[] actualLines = readStringsFromFile("src\\main\\java\\inputs-day5.txt");

    @BeforeEach                                         
    public void setUp() throws Exception {
    }

    @Test                                               
    @DisplayName("partASample()")   
    public void testPartASample() {
        System.out.println("***Testing to see if partA(lines) returns 357");
        assertEquals(357, StudentCode.partA(sampleLines),      
        "Should be 357");          
    }
    
    @Test                                               
    @DisplayName("partAActual()")   
    public void testPartAActual() {
        System.out.println("***Testing to see if partA(lines) returns 963");
        assertEquals(963, StudentCode.partA(actualLines),      
        "Should be 963");          
    }

	/**
    @Test                                               
    @DisplayName("partBSample()")   
    public void testPartBSample() {
        System.out.println("***Testing to see if partB(lines) returns 2");
        assertEquals(2, StudentCode.partB(sampleLines),      
        "Should be 2");          
    }
	*/
    
    @Test                                               
    @DisplayName("partBActual()")   
    public void testPartBActual() {
        System.out.println("***Testing to see if partB(lines) returns 592");
        assertEquals(592, StudentCode.partB(actualLines),      
        "Should be 592");          
    }

    /**
     * A method to read Strings from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static String[] readStringsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            String[] lines = new String[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            String[] dummy = new String[1];
            return dummy;
        }
    }

    /**
     * A method to read ints from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static int[] readIntsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            int[] lines = new int[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                int data = Integer.parseInt(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            int[] dummy = new int[1];
            return dummy;
        }
            
    }

    /**
     * A method to read longs from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static long[] readLongsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            long[] lines = new long[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                long data = Long.parseLong(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            long[] dummy = new long[1];
            return dummy;
        }
    }
    
}
