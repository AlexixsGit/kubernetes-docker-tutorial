package com.kubernetes.containers.demo.util;

import org.springframework.stereotype.Component;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

@Component
public class CloudantApi {

	private static final String userName = "";
	private static final String password = "";

	public Database connect() {
		CloudantClient client = ClientBuilder.account(userName).username(userName).password(password).build();

		Database db = client.database("kubernetes-parking", false);

		return db;

	}
}
