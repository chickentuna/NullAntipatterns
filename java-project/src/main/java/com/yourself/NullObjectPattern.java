// { autofold
package com.yourself;

import java.util.Arrays;

public class NullObjectPattern {
// }

public static int countAllStars(int... galaxies) {
	int totalStars = 0;
	for(int stars : galaxies) {
		totalStars = stars; // fix me!
	} 
	return totalStars;
}

//{ autofold
}
//}