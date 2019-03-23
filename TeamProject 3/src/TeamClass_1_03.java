/**
 * @TODO Project description
 * @author 
 * @date 03/20/19
 * 
 */

import java.util.Scanner;  // Access the Scanner class
import java.io.*;          // Access PrintWriter and related classes

public class TeamClass_1_03 {

   public static void main(String[ ] args) throws IOException {
   
	  // CHANGE THIS BEFORE RUNNING: MUST MANUALLY SPECIFY FILE PATH
	  final String SOURCE_PATH = "C:\\Users\\ryth\\git\\Project-3\\";
	   
      // Declarations
      final String INPUT_FILE  = SOURCE_PATH + "Team_1_03_Input.txt";
      final String OUTPUT_FILE = SOURCE_PATH + "Team_1_03_Output.txt";
      
      double[] mileage;       		// Mileage values
      double[] reimb;        		// Reimbursment values
      int numElements = 0;    		// # of elements possible
      int numRead = 0;        		// # of elements actually read
      double averageMileage = 0.0;  // Average of valid miles
      double averageReimb = 0.0;    // Average of valid reimbursements
      double totalMileage = 0.0;    // Total of valid miles
      double totalReimb   = 0.0;    // Total of valid reimbursements
      
      // Access the input and output files
      
      File inputDataFile = new File(INPUT_FILE);
      Scanner inputFile  = new Scanner(inputDataFile);
      
      FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
      PrintWriter outputFile = new PrintWriter(outputDataFile);
      
      // ******** End declarations, begin execution ********
      // Hershey
      
      
      // Get the maximum # of elements and allocate array sizes
      numElements = inputFile.nextInt();
      mileage = new double[numElements];
      reimb = new double[numElements];
      
      // Explain the program to the user
      explainProgram(outputFile);
      
      // Begin detailed processing
      numRead = readMileage(inputFile, mileage);
      calcReimbursement(mileage,reimb,numRead);
      displayHeading(outputFile);
      displayDetails(mileage,reimb,numRead);
      averageMileage = calcAverage(mileage,numRead);
      averageReimb   = calcAverage(reimb,numRead);
      totalMileage   = calcTotal(mileage,numRead);
      totalReimb     = calcTotal(reimb,numRead);
      
      // TODO remove me
      System.out.println("DONE, NO ERRORS THROWN");
   } // End main
	

   //************************************************************************
   
   public static void explainProgram(PrintWriter output) {
   } // End explainProgram
   
   //************************************************************************
   
   public static int readMileage(Scanner input, double[] mileage) {
      int numRead = 0;
      
      while(input.hasNext() && numRead < mileage.length) {
         mileage[numRead] = input.nextDouble();
         numRead++;
      } // End while
      
      return numRead;
   } // End readMileage
   
   //************************************************************************
   
   public static void calcReimbursement(double[] mileage,
                                        double[] reimb,
                                        int numProcess) {
   } // End calcReimbursement
   
   //************************************************************************
   
   public static void displayHeading(PrintWriter output) {
   } // End displayHeading
   
   //************************************************************************
   
   public static void displayDetails(double[] mileage,
                                     double[] reimb,
                                     int numProcess) {
   } // End displayDetails
   
   //************************************************************************
   
   public static double calcAverage(double[] array1, int numProcess) {
      return 0.0;
   } // End calcAverage
       
   //************************************************************************
   
   public static double calcTotal(double[] array1, int numProcess) {
      return 0.0;
   } // End calcTotal
    
} // End class
