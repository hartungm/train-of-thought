package com.trainofthought.connections.rest;

import com.trainofthought.connections.dao.ConnectionDAO;
import com.trainofthought.connections.model.NodeConnection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConnectionRESTController {

    @RequestMapping(value = "/connections")
    public List<NodeConnection> getAllConnections() {
        ConnectionDAO dao = new ConnectionDAO();
        return dao.getAllConnections();
    }
}
