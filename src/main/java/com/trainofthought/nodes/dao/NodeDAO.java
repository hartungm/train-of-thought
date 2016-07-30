package com.trainofthought.nodes.dao;

import com.trainofthought.db.connection.TOTConnections;
import com.trainofthought.nodes.model.Node;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NodeDAO {

    private static final String GET_NODES = "SELECT n.node_id, n.description FROM node n";
    private static final String INSERT_NEW_NODE = "INSERT INTO node (node_id, description) VALUES(?, ?)";
    private Connection conn;

    public NodeDAO() {
        try {
            this.conn = TOTConnections.getConnection();
        }
        catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public List<Node> getAllNodes() {
        List<Node> nodes = new ArrayList<>();

        try {
            PreparedStatement stm = conn.prepareStatement(GET_NODES);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                Node node = new Node();
                node.setNodeID(rs.getInt("node_id"));
                node.setDescription(rs.getString("description"));
                nodes.add(node);
            }
        }
        catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        return nodes;
    }
}
