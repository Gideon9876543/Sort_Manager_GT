
# Sort Manager Project

## Table Of Contents
* [Project Summary](#Project-Summary)
* [How To Use](#How-To-Use)
* [Dependencies](#Dependencies)
* [Test Information](#Test-Information)
* [Concluding Remarks](#Concluding-Remarks)
* [Software Used](#Software-Used)

### Project Summary
* Phase 1: This phase consisted of creating a Bubble Sort and Merge 
Sort algorithm that would sort an array of random integers 
(that may contain duplicates) after user input. Junit and manual tests also had 
to be implemented throughout the entire project.

* Phase 2: Modifying the Bubble and Merge Sort algorithms to behave in an MVC 
design pattern. The Factory Method was the chosen design pattern.

* Phase 3: The task in Phase 3 was to update Phases 1 & 2, so that they could log 
the classes and methods. This enables the user to know where the project failed and why.

* Phase 4: Creating a Binary Search Tree (BST) to sort and retrieve an array 
of said BST.

* Phase 5: Add timing to assess how fast each algorithm is to run showing
comparing performance.

### How To Use
* The user will be asked to pick a method of sorting the array. They can pick 'b' 
for Bubble Sort, 'm' for Merge Sorting and 't' for Binary Search Tree (BST) 
sorting, as seen:

![Sortask](https://user-images.githubusercontent.com/98388179/152702177-52208876-6b5f-45f4-9a20-68e495af6d26.png)

* The controller then creates a random array of 40 integers and the sorting method chosen with sort the array while 
displaying necessary performance information.

### Dependencies
1. Step one was to add the dependency for Junit to enable Junit testing.
2. The second step was to add the log4j dependency to allow logging to be carried out.

![Junit](https://user-images.githubusercontent.com/98388179/152702712-e75d3b1e-cdfe-482d-b1fd-b9ee12b9d585.png)

![Logging](https://user-images.githubusercontent.com/98388179/152702733-3e103cab-6699-4820-8336-6955db39eac8.png)


### Test Information
Two types of testing were used for this project, Junit (automatic) testing for each 
Bubble, Merge and BST sorting method. Manual was then used to assess the controller. 
These are detailed below.

#### Automatic Testing

In the Automatic testing, 5 tests were carried out and verified for the Bubble 
and Merge sort algorithms with 4 tests assessing the BST method, These were 
testing array of:

##### Bubble and Merge Sort:
* Positive integers (Verified).
* Negative integers (Verified).
* A mix of positive and negative integers (Verified).
* A chosen amount of 0-value integers (Verified).
* A null pointer exception being thrown (Verified).

The coverage and details of these tests are shown below:

![Coverage](https://user-images.githubusercontent.com/98388179/152702847-6ed9bcb7-0d30-452a-bfe9-6e5349ea781b.png)

##### Binary Search Tree (BST):
* Positive integers (Verified).
* Negative integers (Verified).
* A mix of positive and negative integers (Verified).
* A null pointer exception being thrown (Verified).

#### Manual Testing:
In manual testing, a user inputs the letter that represents the sorting method 
they want to use. This was tested by re-running the main method to see if any faults were found. These tests
were completed:
* 't' (BST), 'b' (BubbleSort), 'm' (MergeSort) (Verified).
* 'T' (BST), 'B' (BubbleSort), 'M' (MergeSort) (Verified).

### Concluding Remarks
The project as a whole was incredibly interesting and enjoyable, however 
some issues did remain unresolved, these were:
* Logging for the Merge Sort algorithm was logging for each repetition of the for loop.
* A non-compliant response from the user threw a null pointer exception. 


### Software Used
* IntelliJ IDEA 2021.3.1. Inside this i was using:
    * junit-jupiter:5.8.2.
    * apache.logging.log4j:2.17.1
    * java.
* GitHub (desktop and browser).


