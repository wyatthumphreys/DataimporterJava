//Wyat Humphreys CNA 330 SQL 10/2/18 wlhumphreys@student.rtc.edu
// This program creates a SQL db in Java.
//SOURCE: https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DataImporter {
  public static void main(String[] args) {

    String csvfile = "C:\\Users\\wyman\\IdeaProjects\\DataimporterJava\\Public_Computer_Access_Locations.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    try {

      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null) {

        // use comma as separator
        //String[] country = line.split(cvsSplitBy); have to fix this line

        //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]"); have to fix this line

      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }



  }

}



