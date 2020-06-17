import java.io.FileWriter;
import java.io.IOException;

Import org.json.simple.JSONArray;
Import org.json.simple.JSONObject;

public class WriteToJson {

        @SuppressWarnings("unchecked")
        public static void main( String[] args )
        {
            //First Employee
            JSONObject countryDetails = new JSONObject();
            countryDetails.put("country", "Denmark");
            countryDetails.put("year", "2000");
            countryDetails.put("total population", "2000000");

            JSONObject countryObject = new JSONObject();
            countryObject.put("country", countryDetails);

            //Second Employee
            JSONObject countryDetails2 = new JSONObject();
            countryDetails2.put("country", "india");
            countryDetails2.put("year", "2000");
            countryDetails2.put("total population", "10000000");

            JSONObject countryObject2 = new JSONObject();
            countryObject2.put("country", countryDetails2);

            //Add employees to list
            JSONArray countryList = new JSONArray();
            countryList.add(countryObject);
            countryList.add(countryObject2);

            //Write JSON file
            try (FileWriter file = new FileWriter("\\Users\\Adil\\Desktop\\employees.json")) {

                file.write(countryList.toJSONString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

