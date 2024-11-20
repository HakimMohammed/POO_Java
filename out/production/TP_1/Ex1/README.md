# Exercise 1: Student Grades Management

## Objective
This program manages a list of student grades, performing several operations on them:
1. Sort and display the grades.
2. Calculate and display the average grade.
3. Find and display the highest and lowest grades.
4. Count how many students received a specific grade entered by the user.

## Files
- `Application.java`: Manages user interaction and program execution.
- `NoteManager.java`: Implements the core logic for handling the grade operations.

## Functionalities
- **Sorting and Displaying Grades**: The `sortGrades()` function sorts the grades using Java's `Arrays.sort()` method.
- **Average Grade Calculation**: The `getAverageGrade()` function sums the grades and divides by the number of students using Java streams.
- **Finding Max and Min Grades**: The `getHighLowGrade()` function uses Java’s `stream()` methods to find the maximum and minimum grades.
- **Counting Occurrences of a Specific Grade**: The `getGradeOccurrence()` function loops through the list to count how many times a specific grade appears.

## Usage
1. Run `Application.java`.
2. Input the number of students and their grades.
3. Choose an operation: sort, find average, max/min, or count occurrences of a grade.
