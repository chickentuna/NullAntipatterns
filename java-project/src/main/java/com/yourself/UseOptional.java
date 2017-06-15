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

public Optional<User> getUserFromDatabase(String name){
	//TODO return an option of user, where the value is set to the user
    //who has the name passed in parameters
	return Optional.empty();
}

public Optional<String> getUserNameToUpperCaseFromDatabase(String name){
	//TODO return an option of user, where the value is set to the user
    //name in capital letter, who has the name passed in parameters
	return Optional.empty();
}

//{ autofold
}
//}