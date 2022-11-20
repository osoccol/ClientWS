package client;

import com.google.gson.Gson;

import proxy.Banque;
import proxy.BanqueServiceService;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;


public class ClientWS {
    public static void main(String[] args) {

        try {
            System.out.println("Je veux consommer un WS SOAP");
            System.out.println("J'analyse le fichier WSDL et génère mes méthodes... ");

            BanqueServiceService banqueServiceService = new BanqueServiceService();
            Banque banque = banqueServiceService.getBanquePort();

            System.out.println(banque.conversion(8.0));
        } catch (Error e) {
            throw new RuntimeException(e);
        }


        try {
            System.out.println("Je veux consommer une API REST");
            System.out.println("J'envoie une req HTTP avec une action GET/POST/PUT/DELETE'");

            URL url = new URL("http://localhost:3000/api/objects");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestProperty("Content-Type", "application/json");


/*          connection.setRequestMethod("GET"); // read - DEFAULT
            connection.setRequestMethod("POST"); // create
            connection.setRequestMethod("PUT"); // update
            connection.setRequestMethod("DELETE");  // delete
*/

            int status = connection.getResponseCode();
            System.out.println("GET Response Status : " + status);

            if (status == HttpURLConnection.HTTP_OK) { // requête réussie et complétée
                BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = input.readLine()) != null) {
                    response.append(inputLine);
                }
                input.close();

                System.out.println(response.toString());
                System.out.println();
                System.out.println();

                Gson gson = new Gson();
                Mobilier[] array = gson.fromJson(response.toString(), Mobilier[].class);
                List<Mobilier> mobilierList = Arrays.asList(array);

                System.out.println(mobilierList.get(0).getName() + " - " + mobilierList.get(0).getWeight());
                System.out.println(mobilierList.get(1).getName() + " - " + mobilierList.get(1).getWeight());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
