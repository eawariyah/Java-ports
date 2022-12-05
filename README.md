# ICP-INDIVIDUAL-PROJECT-1-REDO
Finding a valid route between two cities using A-Star Search
Given the position of a client and some taxis, the scope of this project is to find the closest taxi to the client and the best route that corresponds to this taxi.

Table of contents:
Reflection.pdf: Description of the problem and personal reflection.

"Inputfile.csv": This file contains the values of the location of the start city and country, and goal city and country in the following form:

Accra, Ghana
Winnipeg, Canada
where Accra is the start city and Ghana is the start country
and Winnipeg is the goal city and Canada is the goal country

airports.csv: This file contains the coordinates of the location and the necessary values of all airports that are available in the following form:

Airport ID, Name, City, Country, IATA code, ICAO code, Latitude, Longitude, Altitude, Timezone, DST (Daylight savings time), Tz database time zone, Type, Source of this data.

airlines.csv: This file contains the necessary values of some parts of the airports and routes in the following form:
Airline ID, Name, Alias, IATA code, ICAO code, Callsign, Country, Active

routes.csv, mytaxis.csv: This file contains the necessary values of some parts of the airports and routes in the following form:
Airline code, Airline ID, Source airport code, Source airport ID, Destination airport code, Destination airport ID, Codeshare, Stops, Equipment
