package com.trainofthought.nodes.rest;

import com.trainofthought.nodes.dao.NodeDAO;
import com.trainofthought.nodes.model.Node;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NodeRESTController {

    @RequestMapping(value = "/nodes")
    public List<Node> getAllNodes() {
        NodeDAO dao = new NodeDAO();
        return dao.getAllNodes();
    }
}
