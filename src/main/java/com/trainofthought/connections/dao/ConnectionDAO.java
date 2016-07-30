package com.trainofthought.connections.dao;

import com.trainofthought.connections.model.NodeConnection;
import com.trainofthought.db.connection.TOTConnections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionDAO {

    private static final String GET_ALL_NODE_CONNECTIONS = "SELECT c.connection_id, c.start_node, c.end_node FROM connections c";
    private Connection conn;

    public ConnectionDAO() {
        try {
            this.conn = TOTConnections.getConnection();
        }
        catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public List<NodeConnection> getAllConnections() {
        List<NodeConnection> nodeConnections = new ArrayList<>();

        try {
            PreparedStatement stm = conn.prepareStatement(GET_ALL_NODE_CONNECTIONS);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                NodeConnection nodeConnection = new NodeConnection();
                nodeConnection.setConnectionID(rs.getInt("connection_id"));
                nodeConnection.setStartNode(rs.getInt("start_node"));
                nodeConnection.setEndNode(rs.getInt("end_node"));
                nodeConnections.add(nodeConnection);
            }
        }
        catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        return nodeConnections;
    }
}
