# Question one
method 1: big O = n
method 2: big O = 1
method 3: big O = n
method 4: big O = log(n)

#Question two
The binary search will not yield a correct answer. You would not be able to tell which half of the array the 
answer was in, the first half or the second half of the array, during each loop of the search. Each time you would
run into the possibility of incorrectly eliminating the half with the correct answer.

#Question 3
The constructor ensures that we are not passing in null values or trying to search through null values in our search methods
allowing our program to run without errors or throwing exceptions.

#Question 4
This ensure that values assigned to the variables or passed in during the arguements are not able to be changed later on
within the method. This allows for control and overall correctness within the program.

#Question 5
In this program, using optional is perferable to throwing a null pointer exception. In this program we are expecting a case 
where they may be nothing there and the use of optional give us a perferable option to return a null instead of throwing
an exception when the case isn't "exceptional" and rather something we throught would happen. It also clear up confusion
as to whether there was nothing in the list or array rather than pointing to a single place that has a null value.