// Java program to show the occurrence of
// IllegalStateException.

// Import required packages

// import java.io.*;
// import java.util.*;

// Creating a thread in our myThread class by extending the
// Thread class
// class 1
// Helper class

class myThread extends Thread {

	// Method in helper class
	// declaring run method
	public void run()
	{

		for (int i = 0; i < 5; i++) {
		
			// Display message
			System.out.println("GeeksForGeeks");
		}
	}
}

// class 2
// Main class
class Thread1 {

	// Main driver method
	public static void main(String[] args)
	{
		// creating a thread object in the main() method
		// of our helper class above
		myThread t = new myThread();
	
		// Starting the above created thread
		// using the start() method
		t.start();
	
		// Display Message
		System.out.println("Main Thread");
	
		// starting the thread again when it is already
		// running and hence it cause an exception
		// t.start();
	}
}