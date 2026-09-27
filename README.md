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

---

### 📦 Arrays

Completed concepts and problems:

- Array creation and user input
- Array traversal
- Forward and backward traversal
- Sum and average of elements
- Minimum and maximum elements
- Linear search
- Counting occurrences
- In-place array reversal
- Two-pointer technique
- Finding the second-largest distinct element
- Checking whether an array is sorted
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
- Input validation
- Boundary handling
- Array indexing
- Edge-case handling

**Arrays: Completed ✅**

---

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
- `equals()`
- `equalsIgnoreCase()`
- Empty String validation

#### String Manipulation

- String reversal
- Palindrome checking
- Counting vowels and consonants
- Counting digits and whitespace
- Character frequency
- Removing whitespace
- Removing duplicate characters
- Anagram checking
- String compression
- Longest word in a sentence
- First and last character occurrence

#### Frequency Array Techniques

- Fixed-size frequency arrays
- Character-to-index mapping using:

```java
ch - 'a'
```

- Boolean arrays for duplicate tracking
- Finding non-repeating characters
- Finding unique characters
- Comparing frequencies between Strings

#### StringBuilder

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
- Reversing a String using `StringBuilder`

#### Two-Pointer String Problems

- Valid palindrome using two pointers
- Case-insensitive comparison
- Ignoring whitespace while comparing
- Checking whether one String is a subsequence of another

#### Prefix Problems

- Longest common prefix
- Comparing multiple Strings manually
- Character-by-character prefix matching
- Reducing a candidate prefix

#### Sliding Window

Implemented the **Sliding Window technique** for:

- Longest substring without repeating characters
- Maintaining `left` and `right` pointers
- Expanding and shrinking a window
- Duplicate tracking inside the active window
- Calculating window length using:

```java
right - left + 1
```

**Strings: Completed ✅**

---

## 🧩 DSA Techniques Introduced

The repository currently includes practice with:

- Linear traversal
- Reverse traversal
- Two-pointer technique
- Sliding window
- Frequency arrays
- Boolean tracking arrays
- Character-to-index mapping
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
- Prefix matching
- Result construction
- Basic run-length encoding
- Mutable vs immutable data handling
- Early termination using `break`
- Sentinel values such as `-1`
- Single-pass and multi-pass algorithms

---

## ⏱️ Complexity Analysis

For each problem, I practice identifying:

- Time complexity
- Space complexity
- Auxiliary space
- Best, average, and worst cases
- Differences between multiple approaches

Complexities covered so far include:

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
- **O(n)** — two-pointer String problems
- **O(n)** — sliding-window traversal
- **O(n × m)** — longest common prefix across multiple Strings
- **O(1) auxiliary space** — fixed-size frequency arrays
- **O(1) auxiliary space** — fixed-size boolean arrays
- **O(1) auxiliary space** — in-place array reversal
- **O(n) result space** — building transformed Strings

I am also learning how implementation choices affect performance, especially how repeated String concatenation differs from using `StringBuilder`.

---

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
│   ├── StringBuilderBasics.java
│   ├── ReverseUsingStringBuilder.java
│   ├── FirstNonRepeatingCharacter.java
│   ├── FirstLastOccurrenceString.java
│   ├── LongestWord.java
│   ├── ValidPalindromeTwoPointers.java
│   ├── IsSubsequence.java
│   ├── FirstUniqueCharacter.java
│   ├── LongestCommonPrefix.java
│   └── LongestSubstringWithoutRepeating.java
│
├── .github/
│   └── workflows/
│       └── java-ci.yml
│
├── .gitignore
├── LICENSE
└── README.md
```

> Compiled `.class` files are excluded from version control using `.gitignore`.

---

## ⚙️ Continuous Integration

This repository uses **GitHub Actions** for basic Java CI.

The workflow:

```text
Push / Pull Request
        ↓
Checkout Repository
        ↓
Set Up Java
        ↓
Compile Java Source Files
        ↓
Pass ✅ / Fail ❌
```

CI is triggered on:

- Pushes to `main`
- Pull requests targeting `main`

The current workflow verifies that all Java source files compile successfully.

This provides practical exposure to:

- GitHub Actions
- CI workflows
- YAML configuration
- Automated compilation
- Pull request checks
- Branch-based development

---

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

---

## 🗺️ Learning Roadmap

- [x] Java fundamentals
- [x] Basic time and space complexity
- [x] Arrays
- [x] Strings
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

---

## 🔎 Next Topic — Searching & Sorting

### Searching

Planned:

- [ ] Linear Search revision
- [ ] Binary Search
- [ ] First occurrence using Binary Search
- [ ] Last occurrence using Binary Search
- [ ] Search Insert Position
- [ ] Search in Rotated Sorted Array

### Sorting

Planned:

- [ ] Bubble Sort
- [ ] Selection Sort
- [ ] Insertion Sort
- [ ] Merge Sort
- [ ] Quick Sort

The main focus will be understanding the difference between:

```text
O(n)
O(log n)
O(n²)
O(n log n)
```

and learning when each searching or sorting approach is appropriate.

---

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
9. Using branches and pull requests where appropriate
10. Running automated CI checks

---

## 📈 Progress Philosophy

This repository is not about uploading perfect solutions from day one.

It documents the actual learning process — **writing code, making mistakes, debugging, understanding edge cases, improving approaches, and gradually building stronger problem-solving skills.**

The objective is not to memorize solutions, but to develop the ability to **recognize patterns, derive solutions independently, and understand the trade-offs behind different approaches.**

> **Understand the logic. Write the code. Analyze it. Improve it. Repeat.**

---

Built with consistency and curiosity by **[Atharva Padwal](https://github.com/AtharvaPadwal2)**.
