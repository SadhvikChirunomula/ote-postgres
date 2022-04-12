package com.epsilon.OnlineTextEditor.controllers;

import com.epsilon.OnlineTextEditor.utilities.DBConnectionManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "DB Editor", description = "DB supporting Text Editor")

public class DbController {
    @ApiOperation(value = "Test DB Connection")
    @RequestMapping(method = RequestMethod.GET, value = "/db/test/connection")
    public String test() throws Exception {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        if (dbConnectionManager.getConnection() == null) {
            return "Error";
        } else {
            return "Success";
        }
    }
}