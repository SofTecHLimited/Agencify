# Test Overview

This test includes several programming tasks that assess knowledge and skills in Java programming and SQL. Each problem has specific requirements that need to be fulfilled.

## Assessment 1: FibonacciSequence
The task is to write a Java program that generates a Fibonacci sequence up to a given number provided by the user.

Solution: The solution includes writing a Java program that prompts the user for input, validates the input to ensure it is a positive integer, and generates the Fibonacci sequence up to the specified number using an efficient iterative approach.

In the program, the "main" method prompts the user to enter a positive integer and validates the input using the "getValidInput" method. This method repeatedly prompts the user until a valid positive integer is entered. It handles cases where the input is not a valid integer or is a non-positive integer.

Once a valid input is obtained, the "generateFibonacciSequence" method is called to generate and print the Fibonacci sequence up to the specified number. The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the two preceding numbers.

The program uses a loop to generate the sequence efficiently, avoiding the need for recursion. The sequence is printed as each number is generated.

## Assessment 2: LargestDifference
The task is to implement a Java function that finds the largest difference between any two numbers in a given list of integers.

Solution: The solution includes writing a Java function that iterates through the list, keeps track of the minimum and maximum values, and calculates the largest difference based on those values. Special handling is included for edge cases where the list has less than two elements.

In this implementation, the "findLargestDifference" function takes a "List<Integer>" as input and returns the largest difference between any two numbers in the list. It first checks if the list has less than two elements and returns 0 in that case.

If the list has two or more elements, it initializes "minNumber" with the first element and "maxDifference" with 0. Then it iterates over the remaining numbers in the list, updating "maxDifference" if a larger difference is found and updating "minNumber" if a smaller number is found.

## Assessment 3: SQL Query
Provided in this problem is a database table called "employees" with columns "id", "name", "age" and "salary". The task is to write a SQL query that selects all employees whose age is above 30 and salary is above $50,000.

Solution: The solution includes writing a SQL query that utilizes the "SELECT" statement with appropriate conditions to retrieve the desired employees from the database table. 

The "WHERE" clause is used to specify the conditions for filtering the records. In this case, we use "age > 30" to select employees with an age above 30 and "salary > 50000" to select employees with a salary above $50,000.

## Assessment 4: AverageCalculator
The task is to fix a bug in the code that calculates the average of a list of numbers. The bug causes incorrect output, and the task is to identify and fix it to ensure the correct average is calculated.

Solution: The bug in the code lies in the calculation of the average `calculateAverage` method. Since total is an int and numbers.length is also an int, performing the division total / numbers.length will result in integer division, truncating the decimal part of the average.
To fix this issue, you can modify the code to cast total or numbers.length to double before performing the division to get "double average = (double) total / numbers.length;" or "double average = total / (double) numbers.length;"

---

This repository contains the solutions to the problems mentioned above. Each problem has its own Java file or SQL querry containing the code solution. The README.md file provides an overview of the test, explains the purpose of each problem, and describes the solutions in more detail.
