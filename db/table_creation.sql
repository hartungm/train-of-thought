CREATE TABLE node
(
	node_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    description varchar(255)
);

CREATE TABLE connections
(
	connection_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    start_node int NOT NULL,
    end_node int NOT NULL
);