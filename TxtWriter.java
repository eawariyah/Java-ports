package Individual_Project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

 /**
 * The class Txt writer
 */ 
public class TxtWriter {
    private BufferedWriter writer;


/** 
 *
 * It is a constructor. 
 *
 * @param fileToWrite  the file to write
 * @throws   IOException 
 */
    public TxtWriter(String fileToWrite) throws IOException { 

        this.writer = new BufferedWriter(new FileWriter(fileToWrite));
    }


    void initializeFile(String name) throws IOException {
        writer.write(name);
    }

    void closeFile() throws IOException {
        writer.close();
    }

    void addBest() throws IOException {
        double minCost = Route.routes.first().getCost();
        for (Route route: Route.routes) {
            if (route.getCost() != minCost) {
                return;
            }
            writer.write("\n\nBest method with haversine\n\n");
            for (State state: route.getRoute()) {
            	double initial_x = state.getX();
                String final_string_x = String.valueOf(initial_x);

                double initial_y = state.getY();
                String final_string_y = String.valueOf(initial_y);



                for (int i = 0; i < Y_test.Y_tests.size(); i++) {
                    if (final_string_x.equals(X_test.X_tests.get(i).toString()) && final_string_y.equals(Y_test.Y_tests.get(i).toString())) {
                        for (int j = 0; j < SourceAirportID.cities2.size(); j++) {

                            if (City.cities.get(i).toString().equals(SourceAirportID.cities2.get(j).toString())) {
                                
                                String a = AirlinesCode.AirlinesCodes.get(j).toString() + ", "+ SourceAirportID.cities2.get(j).toString() + ", " + DestinationAirportID.cities3.get(j).toString() + ", " + Stops.cities4.get(j).toString();
                                String[] source_destination;
                                source_destination = a.split(", ");
                                AirlinesCode1 airlinesCode1 = new AirlinesCode1(source_destination[0]); //storing destination in array.
                                AirlinesCode1.airlinesCodes1.add(airlinesCode1);
                                City1 city1 = new City1(source_destination[1]); //storing destination in array.
                                City1.cities1.add(city1);
                                Destination destination = new Destination(source_destination[2]); //storing destination in array.
                                Destination.destination1.add(destination);
                                Stops1 stops1 = new Stops1(source_destination[3]); //storing destination in array.
                                Stops1.stops1.add(stops1);

                            }



                        }


                    }

                }

            }
            int l = 0;
            int m = 0;
            try {
                for (int i = 0; i < City1.cities1.size(); i++) {
                    for (int j = 0; j < City1.cities1.size(); j++) {
                        if (City1.cities1.get(i).toString().equals(Destination.destination1.get(j).toString())) {
                            for (int k = 0; j < City1.cities1.size(); k++) {
                                if (!City1.cities1.get(k).toString().equals(City1.cities1.get(k + 1).toString())) {
                                	l++;
                                	Integer n = Integer.valueOf(Stops1.stops1.get(k).toString());
                                	m = m + n;
                                	writer.write(l+". " + AirlinesCode1.airlinesCodes1.get(k)+ " from " + City1.cities1.get(k) + " to " + City1.cities1.get(k + 1)+ " " + Stops1.stops1.get(k).toString() + " stops\n");
                                }
                            }
                        }
                    }

                }
            } catch (Exception e) {
            }
            writer.write("\n\nTotal flights: "+ l+"\n");
            writer.write("Total additional stops: " + m+"\n");
            }
            writer.write("");
        }
    

    void addRoutes() throws IOException {
        writer.write("\n\nNo best path, normal route\n\n");
        int cnt = 1;
        Air_Port firstAir_Port = Route.routes.first().getAir_Port();
        for (Route route: Route.routes) {
            if (cnt == 1) {
                writer.write("");

            } else {
                if (firstAir_Port.equals(route.getAir_Port())) {
                    writer.write("");
                    cnt = cnt - 1;
                } else {
                    writer.write("");

                }
            }
            for (State state: route.getRoute()) {

                double initial_x = state.getX();
                String final_string_x = String.valueOf(initial_x);

                double initial_y = state.getY();
                String final_string_y = String.valueOf(initial_y);


                for (int i = 0; i < Y_test.Y_tests.size(); i++) {
                    if (final_string_x.equals(X_test.X_tests.get(i).toString()) && final_string_y.equals(Y_test.Y_tests.get(i).toString())) {
                        for (int j = 0; j < SourceAirportID.cities2.size(); j++) {

                            if (City.cities.get(i).toString().equals(SourceAirportID.cities2.get(j).toString())) {
                                
                                String a = AirlinesCode.AirlinesCodes.get(j).toString() + ", "+ SourceAirportID.cities2.get(j).toString() + ", " + DestinationAirportID.cities3.get(j).toString() + ", " + Stops.cities4.get(j).toString();
                                String[] source_destination;
                                source_destination = a.split(", ");
                                AirlinesCode1 airlinesCode1 = new AirlinesCode1(source_destination[0]); //storing destination in array.
                                AirlinesCode1.airlinesCodes1.add(airlinesCode1);
                                City1 city1 = new City1(source_destination[1]); //storing destination in array.
                                City1.cities1.add(city1);
                                Destination destination = new Destination(source_destination[2]); //storing destination in array.
                                Destination.destination1.add(destination);
                                Stops1 stops1 = new Stops1(source_destination[3]); //storing destination in array.
                                Stops1.stops1.add(stops1);

                            }



                        }


                    }

                }

            }
            int l = 0;
            int m = 0;
            try {
                for (int i = 0; i < City1.cities1.size(); i++) {
                    for (int j = 0; j < City1.cities1.size(); j++) {
                        if (City1.cities1.get(i).toString().equals(Destination.destination1.get(j).toString())) {
                            for (int k = 0; j < City1.cities1.size(); k++) {
                                if (!City1.cities1.get(k).toString().equals(City1.cities1.get(k + 1).toString())) {
                                	l++;
                                	Integer n = Integer.valueOf(Stops1.stops1.get(k).toString());
                                	m = m + n;
                                	writer.write(l+". " + AirlinesCode1.airlinesCodes1.get(k)+ " from " + City1.cities1.get(k) + " to " + City1.cities1.get(k + 1)+ " " + Stops1.stops1.get(k).toString() + " stops\n");
                                }
                            }
                        }
                    }

                }
            } catch (Exception e) {
            }
            writer.write("\n\nTotal flights: "+ l+"\n");
            writer.write("Total additional stops: " + m);


            cnt++;
        }

    }
}
