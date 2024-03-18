# Java Airports

## Overview
Java Airports is a program designed to find the distance and a valid route between two cities using haversine and an A-Star Search algorithm. The main objective of this project is to determine the closest airport to a given client's location and then identify the optimal route corresponding to this airport.

## Files Included
1. **Reflection.pdf**: This document provides a detailed description of the problem statement and offers a personal reflection on the project.

2. **Inputfile.csv**: This file contains information regarding the start city and country, as well as the goal city and country. The format of the file is as follows:
   ```
   Start City, Start Country
   Goal City, Goal Country
   ```
   For example:
   ```
   Accra, Ghana
   Winnipeg, Canada
   ```

3. **airports.csv**: This file consists of the coordinates and other essential details of available airports. Each entry in the file follows this format:
   ```
   Airport ID, Name, City, Country, IATA code, ICAO code, Latitude, Longitude, Altitude, Timezone, DST, Tz database time zone, Type, Source
   ```
   Example entry:
   ```
   1, John F Kennedy International Airport, New York, United States, JFK, KJFK, 40.6413, -73.7781, 13, -5, A, America/New_York, airport, OurAirports
   ```

4. **airlines.csv**: This file contains relevant information about airlines, including their ID, name, codes, and country. The format of each entry is as follows:
   ```
   Airline ID, Name, Alias, IATA code, ICAO code, Callsign, Country, Active
   ```
   Example entry:
   ```
   10, Hawaiian Airlines, NaN, HA, HAL, Hawaiian, United States, Y
   ```

5. **routes.csv**: This file includes details about airline routes, such as the airline code, source and destination airport codes, and other related information. Entries in this file follow this format:
   ```
   Airline code, Airline ID, Source airport code, Source airport ID, Destination airport code, Destination airport ID, Codeshare, Stops, Equipment
   ```
   Example entry:
   ```
   2B, 410, AER, 2965, KZN, 2990, , 0, CR2
   ```

6. **myairports.csv**: This file contains additional details about airports and routes in a specific format similar to the **routes.csv** file.

## Usage
To utilize the Java Airports program, follow these steps:
1. Ensure that all required input files (e.g., `Inputfile.csv`, `airports.csv`, `airlines.csv`, `routes.csv`, `myairports.csv`) are available.
2. Run the program and provide the necessary inputs as prompted.
3. The program will process the data and determine the closest airport to the client's location.
4. Finally, it will calculate and display the optimal route corresponding to the identified airport.

## Dependencies
- This program is written in Java and requires a compatible Java Runtime Environment (JRE) to execute.
- Ensure that all required input files are correctly formatted and accessible by the program.

## For more information
- [Edwin Awariyah]
- [edwin.awariyah@outlook.com]

For any questions or concerns regarding this project, please contact [edwin.awariyah@outlook.com]. Thank you for using Java Airports!
