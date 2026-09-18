# DSA in Java ☕

A personal repository documenting my journey of learning **Data Structures and Algorithms using Java**.

The goal is simple: **practice consistently, understand the logic behind every solution, analyze time and space complexity, and gradually progress from Java fundamentals to advanced DSA.**

## 📌 Current Progress

### ☕ Java Basics

- Hello World and basic syntax
- Variables and data types
- User input using `Scanner`
- Conditional statements
- `switch` statements
- Loops
- Methods
- Method overloading
- Largest of three numbers
- Leap-year checker
- Simple calculator
- Counting digits
- Reversing a number
- Palindrome checker
- Factorial calculation
- Fibonacci series
- Prime number checking
- Prime numbers in a range
- Pattern problems
- Method-based problem solving

### 📦 Arrays

- Array creation and user input
- Array traversal
- Sum and average of elements
- Minimum and maximum elements
- Linear search
- Counting occurrences
- In-place array reversal
- Two-pointer technique
- Finding the second-largest distinct element
- Checking if an array is sorted
- Finding duplicate elements
- Copying arrays
- First and last occurrence
- Counting even and odd elements
- Moving zeros
- Left rotation
- Right rotation
- Array rotation by `K` positions
- Merging arrays
- Finding a missing number
- Input validation and edge-case handling
- Array indexing and boundary management

### 🔤 Strings

#### String Fundamentals

- String creation and user input
- `next()` vs `nextLine()`
- String indexing
- `length()`
- `charAt()`
- Forward traversal
- Backward traversal
- Uppercase and lowercase conversion
- String immutability
- `equals()` and `equalsIgnoreCase()`
- Empty String validation

#### String Problems

- String reversal
- Palindrome checking
- Counting vowels and consonants
- Counting digits and whitespace
- Character frequency
- Removing whitespace
- Removing duplicate characters
- Anagram checking
- String compression

#### String Techniques

- Character-by-character traversal
- Frequency arrays
- Character-to-index mapping using `ch - 'a'`
- Boolean arrays for duplicate tracking
- Case-insensitive processing
- Adjacent-character comparison
- Building transformed Strings
- Character classification using the `Character` class

#### StringBuilder

Currently learning:

- Mutable vs immutable Strings
- Creating a `StringBuilder`
- `append()`
- `insert()`
- `setCharAt()`
- `deleteCharAt()`
- `reverse()`
- `length()`
- `toString()`
- Efficient String construction

## 🧩 DSA Techniques Introduced

The problems completed so far have introduced:

- Linear traversal
- Reverse traversal
- Two-pointer technique
- Frequency arrays
- Character-to-index mapping
- Boolean tracking arrays
- Counter variables
- Accumulator variables
- Input validation
- Edge-case handling
- Boundary management
- Character-by-character processing
- Adjacent-element comparison
- In-place operations
- Duplicate detection
- Frequency comparison
- Result construction
- Basic run-length encoding
- Mutable vs immutable data handling

## ⏱️ Complexity Analysis

For each problem, I am practicing how to identify:

- Time complexity
- Space complexity
- Auxiliary space
- Best, average, and worst cases
- Differences between multiple approaches

Examples covered so far:

- **O(1)** — constant-time operations
- **O(n)** — array traversal
- **O(n)** — String traversal
- **O(n)** — linear search
- **O(n)** — palindrome checking
- **O(n)** — character counting
- **O(n)** — frequency-array processing
- **O(n)** — anagram checking
- **O(n)** — duplicate detection
- **O(n)** — String compression traversal
- **O(1) auxiliary space** — fixed-size frequency and boolean arrays
- **O(1) auxiliary space** — in-place array reversal

I am also learning how Java's **String immutability** can affect the real cost of repeated String concatenation and how `StringBuilder` can improve String construction.

## 📁 Repository Structure

```text
DSA-in-Java/
│
├── java_basics/
│   ├── HelloWorld.java
│   ├── VariablesAndDataTypes.java
│   ├── UserInput.java
│   ├── Conditions.java
│   ├── LargestNumber.java
│   ├── LeapYear.java
│   ├── SimpleCalculator.java
│   ├── Loops.java
│   ├── CountDigits.java
│   ├── ReverseNumber.java
│   ├── Palindrome.java
│   ├── Factorial.java
│   ├── FibonacciSeries.java
│   ├── PrimeNumber.java
│   ├── PrimeNumbersInRange.java
│   ├── MethodPractice.java
│   ├── MethodCalculator.java
│   ├── MethodOverloading.java
│   └── PrimeUsingMethod.java
│
├── arrays/
│   ├── ArrayBasics.java
│   ├── ArrayTraverse.java
│   ├── ArraySumandAverage.java
│   ├── ArrayMinandMax.java
│   ├── ArrayLinearSearch.java
│   ├── ArrayCountOccurances.java
│   ├── ArrayReverse.java
│   ├── ArraySecondLargest.java
│   ├── ArraySorted.java
│   ├── ArrayDuplicates.java
│   ├── ArrayCopy.java
│   ├── ArrayFirstLastOccurrence.java
│   ├── ArrayEvenandOddCount.java
│   ├── ArrayMoveZeros.java
│   ├── ArrayMoveLeft.java
│   ├── ArrayMoveRight.java
│   ├── ArrayMerge.java
│   ├── ArrayMissingNumber.java
│   └── ArrayRotatebyK.java
│
├── Strings/
│   ├── StringBasics.java
│   ├── StringTraversal.java
│   ├── StringReverse.java
│   ├── StringPalindrome.java
│   ├── CountCharacters.java
│   ├── CharacterFrequency.java
│   ├── RemoveSpaces.java
│   ├── RemoveDuplicates.java
│   ├── AnagramCheck.java
│   ├── StringCompression.java
│   └── StringBuilderBasics.java
│
├── .gitignore
├── LICENSE
└── README.md
```

> Compiled `.class` files are excluded from version control using `.gitignore`.

## ▶️ Running a Program

Compile a Java file:

```bash
javac FileName.java
```

Run the compiled program:

```bash
java FileName
```

Example:

```bash
javac StringReverse.java
java StringReverse
```

Depending on the package and directory structure, programs may need to be compiled and executed from the repository root using their package name.

## 🗺️ Learning Roadmap

- [x] Java fundamentals
- [x] Basic time and space complexity
- [x] Arrays
- [ ] Strings — **In Progress**
- [ ] Searching and sorting
- [ ] Recursion
- [ ] Backtracking
- [ ] Linked lists
- [ ] Stacks and queues
- [ ] Hashing
- [ ] Trees
- [ ] Binary search trees
- [ ] Heaps
- [ ] Graphs
- [ ] Greedy algorithms
- [ ] Dynamic programming

## 🔤 Current String Roadmap

### Completed

- [x] String basics
- [x] String traversal
- [x] Reverse String
- [x] Palindrome String
- [x] Character counting
- [x] Character frequency
- [x] Removing spaces
- [x] Removing duplicate characters
- [x] Anagram checking
- [x] String compression
- [x] Frequency-array basics

### Currently Learning

- [ ] `StringBuilder`
- [ ] Efficient String construction

### Coming Next

- [ ] Reverse using `StringBuilder`
- [ ] First non-repeating character
- [ ] First and last occurrence in a String
- [ ] Longest word
- [ ] Two-pointer String problems
- [ ] Hashing with Strings
- [ ] Sliding-window technique
- [ ] Longest substring without repeating characters
- [ ] More String-based DSA problems

## 🎯 Approach

For each topic, the focus is on:

1. Understanding the concept
2. Writing the solution independently
3. Testing different inputs and edge cases
4. Understanding why the solution works
5. Analyzing time and space complexity
6. Improving the solution when possible
7. Learning reusable DSA patterns
8. Committing progress consistently

## 📈 Progress Philosophy

This repository is not about uploading perfect solutions from day one.

It documents the actual learning process — **writing code, making mistakes, debugging, understanding edge cases, improving approaches, and gradually building stronger problem-solving skills.**

The objective is not to memorize solutions, but to develop the ability to **recognize patterns, derive solutions independently, and understand the trade-offs behind different approaches.**

> **Understand the logic. Write the code. Analyze it. Improve it. Repeat.**

---

Built with consistency and curiosity by **[Atharva Padwal](https://github.com/AtharvaPadwal2)**.