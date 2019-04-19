package com.kubernetes.containers.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.Database;
import com.kubernetes.containers.demo.model.User;
import com.kubernetes.containers.demo.util.CloudantApi;

@RestController
public class DemoController {

	@GetMapping("/getAllUsers")
	public List<User> getMessage() {
		Database db = new CloudantApi().connect();

		List<User> parkingUsers = db.search("parking/type").includeDocs(true).query(String.format("type: %s", "user"),
				User.class);

		return parkingUsers;
	}
}
