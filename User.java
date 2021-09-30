<<<<<<< HEAD
package bankingApplication;

public interface User {
	// 

=======
package com.company;

import java.util.Scanner;

public interface User {
     final Scanner inputs = new Scanner(System.in);
     void deposit();

     void withdraw();
>>>>>>> c1d39b6 (Took out static keyword from subclass methods to call them with their instance)
}
