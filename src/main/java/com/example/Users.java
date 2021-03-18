package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;
import com.example.User;
@Path("users")
public class Users {
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<User> getUsers() {
// This data could be retrieved from a database
List<User> users = new ArrayList<User>();
users.add(new User(0, "John", "Smith"));
users.add(new User(1, "Isaac", "Newton"));
users.add(new User(0, "Albert", "Einstein"));
return users;
}
}