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
		return database.stream().filter(p -> p.getName().equals(name)).findFirst();
	}



	public Optional<String> getUserNameToUpperCaseFromDatabase(String name){
		return getUserFromDatabase(name).map(x -> x.getName().toUpperCase());
	}



//{ autofold
}
//}