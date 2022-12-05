package Individual_Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


 /**
 * The class Air_ port_ values
 */ 
public class Air_Port_Values {

    public static Path_movt_ client;
    public static HashMap < Point, ArrayList < Node >> map = new HashMap < Point, ArrayList < Node >> ();
    public static TreeSet < State > searchQueue;
    public static ArrayList < Node > closedSet;

/** 
 *
 * Main
 *
 * @param args  the args
 * @throws   IOException 
 */
    public static void main(String[] args) throws IOException {  



        InputStreamReader user_input = new InputStreamReader(System.in);
        BufferedReader input_value = new BufferedReader(user_input);




        long startTime = System.nanoTime();



        String nodesFile = "C:/Users/Edwin/Desktop/airports.csv";
        String airports__startFile = "C:/Users/Edwin/Desktop/airports.csv";
        String clientFile = "C:/Users/Edwin/Desktop/airports.csv";
        String inputFile = "C:/Users/Edwin/Desktop/Inputfile.csv";
        String routesFile = "C:/Users/Edwin/Desktop/routes.csv";


        String line = "";
        String cvsSplitBy = ",";
        String[] fields;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            while ((line = br.readLine()) != null) {
                fields = line.split(cvsSplitBy);
                InputLine inputLine = new InputLine(fields[0], fields[1]);
                InputLine.inputLines.add(inputLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String start_name = InputLine.inputLines.get(0).toString();
        String goal_name = InputLine.inputLines.get(1).toString();



        String[] start;
        String[] goal;
        start = start_name.split(",  ");
        goal = goal_name.split(",  ");


        try (BufferedReader br = new BufferedReader(new FileReader(routesFile))) {
            while ((line = br.readLine()) != null) {
                fields = line.split(cvsSplitBy);
                AirlinesCode airlinesCode = new AirlinesCode(fields[0]);
                AirlinesCode.AirlinesCodes.add(airlinesCode);

                SourceAirportID sourceAirportID = new SourceAirportID(fields[2]);
                SourceAirportID.cities2.add(sourceAirportID);

                DestinationAirportID destinationAirportID = new DestinationAirportID(fields[4]);
                DestinationAirportID.cities3.add(destinationAirportID);

                Stops stops = new Stops(fields[7]);
                Stops.cities4.add(stops);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader br = new BufferedReader(new FileReader(nodesFile))) {
            Path_movt path_movt;
            while ((line = br.readLine()) != null) {
                fields = line.split(cvsSplitBy);
                if (fields.length == 15) {
                    fields[1] = fields[1] + fields[2];
                    fields[2] = fields[3];
                    fields[3] = fields[4];
                    fields[4] = fields[5];
                    fields[5] = fields[6];
                    fields[6] = fields[7];
                    fields[7] = fields[8];
                    fields[8] = fields[9];
                    fields[9] = fields[10];
                    fields[10] = fields[11];
                    fields[11] = fields[12];
                    fields[12] = fields[13];
                } else {
                    fields[0] = fields[0];
                    fields[1] = fields[1];
                    fields[2] = fields[2];
                    fields[3] = fields[3];
                    fields[4] = fields[4];
                    fields[5] = fields[5];
                    fields[6] = fields[6];
                    fields[7] = fields[7];
                    fields[8] = fields[8];
                    fields[9] = fields[9];
                    fields[10] = fields[10];
                    fields[11] = fields[11];
                    fields[12] = fields[12];
                    fields[13] = fields[13];
                }

                int k = 2;
                path_movt = new Path_movt(k);



                X_test x_test = new X_test(Double.parseDouble(fields[6]));
                X_test.X_tests.add(x_test);

                Y_test y_test = new Y_test(Double.parseDouble(fields[7]));
                Y_test.Y_tests.add(y_test);

                City city = new City(fields[4]);
                City.cities.add(city);


                Node node = new Node(Double.parseDouble(fields[6]), Double.parseDouble(fields[7]), path_movt);
                Node.nodes.add(node);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(airports__startFile))) {
            while ((line = br.readLine()) != null) {
                fields = line.split(cvsSplitBy);
                if (fields.length == 15) {
                    fields[1] = fields[1] + fields[2];
                    fields[2] = fields[3];
                    fields[3] = fields[4];
                    fields[4] = fields[5];
                    fields[5] = fields[6];
                    fields[6] = fields[7];
                    fields[7] = fields[8];
                    fields[8] = fields[9];
                    fields[9] = fields[10];
                    fields[10] = fields[11];
                    fields[11] = fields[12];
                    fields[12] = fields[13];
                } else {
                    fields[0] = fields[0];
                    fields[1] = fields[1];
                    fields[2] = fields[2];
                    fields[3] = fields[3];
                    fields[4] = fields[4];
                    fields[5] = fields[5];
                    fields[6] = fields[6];
                    fields[7] = fields[7];
                    fields[8] = fields[8];
                    fields[9] = fields[9];
                    fields[10] = fields[10];
                    fields[11] = fields[11];
                    fields[12] = fields[12];
                    fields[13] = fields[13];
                }
                int k = 2;
                if (start[0].toString().equalsIgnoreCase(fields[2].toString()) && start[1].toString().equalsIgnoreCase(fields[3].toString())) {
                    Air_Port airports__pos = new Air_Port(Double.parseDouble(fields[6]), Double.parseDouble(fields[7]), k);
                    Air_Port.airports__start.add(airports__pos);
                    System.out.println("\nTrue, start city exists\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(clientFile))) {
            while ((line = br.readLine()) != null) {

                fields = line.split(cvsSplitBy);
                if (fields.length == 15) {
                    fields[1] = fields[1] + fields[2];
                    fields[2] = fields[3];
                    fields[3] = fields[4];
                    fields[4] = fields[5];
                    fields[5] = fields[6];
                    fields[6] = fields[7];
                    fields[7] = fields[8];
                    fields[8] = fields[9];
                    fields[9] = fields[10];
                    fields[10] = fields[11];
                    fields[11] = fields[12];
                    fields[12] = fields[13];
                } else {
                    fields[0] = fields[0];
                    fields[1] = fields[1];
                    fields[2] = fields[2];
                    fields[3] = fields[3];
                    fields[4] = fields[4];
                    fields[5] = fields[5];
                    fields[6] = fields[6];
                    fields[7] = fields[7];
                    fields[8] = fields[8];
                    fields[9] = fields[9];
                    fields[10] = fields[10];
                    fields[11] = fields[11];
                    fields[12] = fields[12];
                    fields[13] = fields[13];
                }

                if (goal[0].toString().equalsIgnoreCase(fields[2].toString()) && goal[1].toString().equalsIgnoreCase(fields[3].toString())) {
                    client = new Path_movt_(Double.parseDouble(fields[6]), Double.parseDouble(fields[7]));
                    System.out.println("\nTrue, goal city exists\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        map = new HashMap < Point, ArrayList < Node >> ();
        int i;
        Point currentPoint;
        Path_movt currentPath_movt;
        for (i = 0; i < Node.nodes.size(); i++) {
            currentPoint = new Point(Node.nodes.get(i).getX(), Node.nodes.get(i).getY());
            currentPath_movt = Node.nodes.get(i).getPath_movt();
            if (!map.containsKey(currentPoint)) {
                ArrayList < Node > myChildren = new ArrayList < Node > ();
                if (i > 0 && Node.nodes.get(i - 1).getPath_movt().equals(currentPath_movt)) {
                    myChildren.add(Node.nodes.get(i - 1));
                }
                if (i < Node.nodes.size() - 1 && Node.nodes.get(i + 1).getPath_movt().equals(currentPath_movt)) {
                    myChildren.add(Node.nodes.get(i + 1));
                }
                map.put(currentPoint, myChildren);
            } else {
                if (i > 0 && Node.nodes.get(i - 1).getPath_movt().equals(currentPath_movt)) {
                    map.get(currentPoint).add(Node.nodes.get(i - 1));
                }
                if (i < Node.nodes.size() - 1 && Node.nodes.get(i + 1).getPath_movt().equals(currentPath_movt)) {
                    map.get(currentPoint).add(Node.nodes.get(i + 1));
                }
            }
        }

        TxtWriter txtWriter = new TxtWriter("C:/Users/Edwin/Desktop/best-route.txt");
        txtWriter.initializeFile("Source: " + start_name + "\n" + "Goal: " + goal_name);

        Node clientNode = client.getClosestNode();
        double clientDistance = Point.haversine(client.getY(), client.getX(), clientNode.getY(), clientNode.getX());
        Node targetNode;
        Point targetPoint;
        Air_Port currentAir_Port;
        State startState, targetState, airports__posState;
        double initialDistance;
        boolean found;
        ArrayList < State > pathAir_Port;
        Iterator < State > iterator;
        boolean add;
        double childDistance;
        ArrayList < State > remove = new ArrayList < State > ();
        for (i = 0; i < Air_Port.airports__start.size(); i++) {
            currentAir_Port = Air_Port.airports__start.get(i);
            initialDistance = Point.haversine(currentAir_Port.getClosestNode().getY(), currentAir_Port.getClosestNode().getX(), currentAir_Port.getY(), currentAir_Port.getX());
            airports__posState = new State(currentAir_Port.getX(), currentAir_Port.getY(), currentAir_Port.getClosestNode().getPath_movt(), 0, null);
            pathAir_Port = new ArrayList < State > ();
            pathAir_Port.add(airports__posState);
            startState = new State(currentAir_Port.getClosestNode().getX(), currentAir_Port.getClosestNode().getY(), currentAir_Port.getClosestNode().getPath_movt(), initialDistance, pathAir_Port);
            searchQueue = new TreeSet < State > (new StateComparator());
            closedSet = new ArrayList < Node > ();
            searchQueue.add(startState);
            found = false;
            while (!searchQueue.isEmpty() && !found) {

                if (searchQueue.first().getX() == clientNode.getX() && searchQueue.first().getY() == clientNode.getY()) {
                    found = true;
                    break;
                }
                targetState = searchQueue.pollFirst();
                targetNode = new Node(targetState.getX(), targetState.getY(), targetState.getPath_movt());
                targetPoint = new Point(targetState.getX(), targetState.getY());
                if (closedSet.contains(targetNode)) {
                    continue;
                }

                for (Node child: map.get(targetPoint)) {
                    if (!closedSet.contains(child)) {
                        add = true;
                        remove.clear();
                        childDistance = Point.haversine(targetState.getY(), targetState.getX(), child.getY(), child.getX());
                        ArrayList < State > path = new ArrayList < State > ();
                        path.addAll(targetState.getPath());
                        path.add(targetState);
                        iterator = searchQueue.iterator();
                        while (iterator.hasNext()) {
                            State curr = null;
                            curr = iterator.next();
                            if (curr.getX() == child.getX() && curr.getY() == child.getY()) {
                                if (curr.getDistance() > Point.round(targetState.getDistance() + childDistance, 3)) {
                                    remove.add(curr);
                                }
                                if (curr.getDistance() < Point.round(targetState.getDistance() + childDistance, 3)) {
                                    add = false;
                                }

                            }
                        }
                        if (add) {
                            searchQueue.removeAll(remove);
                            searchQueue.add(new State(child.getX(), child.getY(), child.getPath_movt(), Point.round(targetState.getDistance() + childDistance, 3), path));
                        }

                    }

                }

                iterator = searchQueue.iterator();
                boolean exists = false;
                while (iterator.hasNext()) {
                    State curr = iterator.next();
                    if (curr.getX() == targetState.getX() && curr.getY() == targetState.getY()) {
                        exists = true;
                    }
                }
                if (!exists) {
                    closedSet.add(targetNode);
                }

            }


            State finalState = searchQueue.pollFirst();
            if (found) {
                System.out.println("Success: valid route between the two cities exists");
            } else {
                System.out.println("Couldn't reach client from airports__pos " + i + "\n");
            }
            Route.routes.add(new Route(finalState.getPath(), Point.round(finalState.getDistance() + clientDistance, 3), currentAir_Port));
            State alternativeState;
            while (!searchQueue.isEmpty() && finalState.getDistance() + finalState.getHeuristic() == searchQueue.first().getDistance() + searchQueue.first().getHeuristic()) {
                alternativeState = searchQueue.pollFirst();
                if (alternativeState.getX() == finalState.getX() && alternativeState.getY() == finalState.getY()) {
                    Route.routes.add(new Route(alternativeState.getPath(), Point.round(alternativeState.getDistance() + clientDistance, 3), currentAir_Port));
                }
            }

        }

		System.out.println("Would you want to:\n a. find a valid route between the two cities?\n b. find an optimal route between the two cities using Haversine and number of flights?\n>> ");  
		String best_search = input_value.readLine();
		
        if (best_search.equals("b")) {
            txtWriter.addBest();
            txtWriter.addRoutes();
            txtWriter.closeFile();
        } else {
            txtWriter.addRoutes();
            txtWriter.closeFile();
        }

        long endTime = System.nanoTime();
        System.out.println("Success: Process took " + (endTime - startTime) + " ns");
    }
}
