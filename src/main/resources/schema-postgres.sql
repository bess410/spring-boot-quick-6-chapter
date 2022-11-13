DROP TABLE IF EXISTS aircraft;
CREATE TABLE aircraft (id serial primary key, callsign VARCHAR(7),
                       squawk VARCHAR(4), reg VARCHAR(6), flightno VARCHAR(10), route VARCHAR(25),
                       type VARCHAR(4), category VARCHAR(2),
                       altitude INT, heading INT, speed INT, vert_rate INT, selected_altitude INT,
                       lat decimal, lon decimal, barometer decimal,
                       polar_distance decimal, polar_bearing decimal,
                       isadsb BOOLEAN, is_on_ground BOOLEAN,
                       last_seen_time TIMESTAMP, pos_update_time TIMESTAMP, bds40seen_time TIMESTAMP);