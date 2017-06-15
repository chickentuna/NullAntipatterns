// { autofold
package com.yourself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseOptional {
// }

public List<User> getDatabase() {
	return database;
}

public void setDatabase(List<User> database) {
	this.database = database;
}

public List<User> database = Database.userDatabase.getList();

public Optional<User> getUserFromDatabase(String name) {
    //TODO search for the user with the given name in the database, then
    //return that user within an Optional if found.
	return Optional.empty();
}

public Optional<String> getUserNameToUpperCaseFromDatabase(String name) {
    //TODO search for the user with the given name in the database, then
    //return that user's uppercase name within an Optional if found.
	return Optional.empty();
}

//{ autofold
}
//}