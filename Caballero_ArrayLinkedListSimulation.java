//NAME: Caballero, John Franz Z
//SECTION: BSIT2A
//DATE: Sep 04, 2025

package asd;
import java.util.Scanner;

public class ArrayLinkedListSimulation {
	int []simplicity = new int[0];
	int size;
	Scanner scan = new Scanner(System.in);
	
	//Prompts the user to input the size of the array.
    //Validates input to ensure a positive integer.
    //Then takes 'size' number of integer inputs to fill the array.
    //If user enters invalid input, prompts to enter number only
	public void addArr(){

	    System.out.print("Enter array size: ");
	    
	    if (scan.hasNextInt()) {
	        size = scan.nextInt();	 
	        
	        if (size == 0) {
	            System.out.println("Array size must be greater than 0.\n");
	            return;
	        }
	        simplicity = new int[size];// Initialize array with given size
	        System.out.println("Array size is: " + size); 
	        
	        //fill the array with user input
	        for (int i = 0; i < size; ) {
	        	
	            System.out.print("Enter number " + (i + 1) + ": ");
	            
	            if (scan.hasNextInt()) {
	                simplicity[i] = scan.nextInt();
	                i++; 
	            } else {
	                System.out.println("Enter NUMBER only.");
	                scan.next(); 
	            }
	            
	        }
	        // Print all the elements inside the array
	        System.out.print("\nFinal array: ");
	        for (int numberArr : simplicity) {
	            System.out.print(numberArr + ", ");
	        }
	        

	    } else {
	        System.out.println("Enter NUMBER only.");
	        scan.next(); 
	    }
	    
	}
	
	
	public int pollArr() { 
	//Removes and returns the first element of the array.
		
		if (size == 0) {
			System.out.println("Array is Empty\n");
			return -1;
		}
		int firstArr = simplicity[0];// Store first element		
        for (int i = 1; i < size; i++) {
            simplicity[i - 1] = simplicity[i];	
        }
        size--;
        int[] newArr = new int[size]; // Create a new smaller array and copy remaining elements
        for (int i = 0; i < size; i++) {
            newArr[i] = simplicity[i];
        }
        simplicity = newArr; // Reassign simplicity to new smaller array
        for (int newArrs : newArr) {
        	 System.out.println("New Array: " + newArrs); //prints the updated array
        }
        return firstArr;//return the remove element
        
    } 

	public int peekArr() {
	//Prints all elements of the array. Returns the first element without removing it.
		
		if (size == 0) {
			System.out.println("\nArray is Empty");
			return -1;
		}else {
			for (int simplicity : simplicity) {
				System.out.println("Array Listed: " + simplicity );				
			}
			return simplicity[0];
		}
		
	}
	
	public int popArr() {   
	//Removes and returns the last element of the array. Decreases size by one and resizes the array.
		
		if (size == 0) { //check if size is null 
			System.out.println("Array is Empty");
			return -1;
		}
		int lastArr = simplicity[size - 1]; //this will remove the last index
		
		for (int i = 1; i > size; i++) {
            simplicity[i - 1] = simplicity[i];
        }
        size--;
        int[] newArr = new int[size]; // Create new smaller array excluding last element
        for (int i = 0; i < size; i++) {
            newArr[i] = simplicity[i];
        }
        simplicity = newArr; 
        for (int newArrs : newArr) {
        	 System.out.println("New Array: " + newArrs);
        }
        return lastArr;// Return removed last element
    } 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayLinkedListSimulation arr = new ArrayLinkedListSimulation(); //calling my methods using this
		int choice;
		boolean isWalking = true;
		
		while (isWalking) {
		    //give user an option to choose
		    System.out.println("\n\n1. Add");
		    System.out.println("2. Poll");
		    System.out.println("3. Peek");
		    System.out.println("4. Pop");
		    System.out.println("5. Exit");
		    System.out.print("\nChoice: ");

		    if (scan.hasNextInt()) { //check if the user input is a number
		        choice = scan.nextInt(); 
		        //this will be implemented 
		        if (choice == 1) {
		            arr.addArr();
		        } else if (choice == 2) {
		            arr.pollArr();
		        } else if (choice == 3) {
		            arr.peekArr();
		        } else if (choice == 4) {
		            arr.popArr();
		        } else if (choice == 5) {
		            System.out.println("Exiting");
		            isWalking = false;
		        } else {
		            System.out.println("\nChoose only NUMBER between 1-5.\n");
		        }

		    } else { // this will be the output if the user didn't enter a integer
		        System.out.println("\nEnter NUMBER only.\n");
		        scan.next();	    
			}

		}
	}
}


//Output Sample
//1. Add
//2. Poll
//3. Peek
//4. Pop
//5. Exit

//Choice: 1 (sample input)
//Enter array size : 3 (sample input)
//Array size is: 3
//Enter number 1: 4 (sample input)
//Enter number 1: 6 (sample input)
//Enter number 1: 8 (sample input)

//Final array: 4, 6, 8, 9, 7,

//1. Add
//2. Poll
//3. Peek
//4. Pop
//5. Exit

//Choice: 3 (sample input)
//Array Listed: 4
//Array Listed: 6
//Array Listed: 8
//Array Listed: 9
//Array Listed: 7


//1. Add
//2. Poll
//3. Peek
//4. Pop
//5. Exit

//Choice: 2 (sample input)
//New Array: 6
//New Array: 8
//New Array: 9
//New Array: 7


//1. Add
//2. Poll
//3. Peek
//4. Pop
//5. Exit

//Choice: 4 (sample input)
//New Array: 6
//New Array: 8
//New Array: 9


//1. Add
//2. Poll
//3. Peek
//4. Pop
//5. Exit

//Choice: 5
//Exiting 


