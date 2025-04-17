# Assignment 6 – Trees and Heaps

## Deadline: Wednesday, April 16, 2025, 9:59 PM

## Objectives:

- Familiarize yourself with the **Tree** and **Heap** data structures.
- Implement real-time systems using binary trees and max heaps.

---

## Instructions:

- Problems marked as **(code)** require Java programs.
- Problems marked as **(text)** require written answers in prose, algorithms (pseudo-code or code), proofs, or mathematical equations.
- **Algorithm-based answers** (pseudo-code or code) will be assessed based on logic rather than compilation.

---

## Problems:

### **(text) Problem 1: Type of Tree [10 points]**

Build a **Binary Search Tree (BST)** by inserting elements in the given order from 4 arrays. After constructing each tree, determine the height of the resulting tree.

---

### **(text) Problem 2: BST Traversal [10 points]**

Apply the operation `node.data += left.data + (right.data * 2)` to each node using **preorder** and **inorder** traversals. Answer the following:
- Are the resulting trees still BSTs?
- Are the resulting trees AVL trees?

---

### **(code) Problem 3: Heap-based Election System [30 points]**

Implement a real-time election system using a **Max Heap** to manage candidate vote counts.

#### Classes:

- **Election**
  - `initializeCandidates(LinkedList<String> candidates)`
  - `castVote(String candidate)`
  - `castRandomVote()`
  - `rigElection(String candidate)`
  - `getTopKCandidates(int k)`
  - `auditElection()`

- **ElectionSystem**
  - Simulates election activity using the `Election` class.

#### Example:

---

### **(ZyBook) Problem 4: Book Labs [40 points]**

Complete the following ZyBook Labs:

- **7.13 LAB:** BST validity checker [10 points]
- **8.11 LAB:** AVL tree Nth largest operation [15 points]
- **8.12 LAB:** Red-black tree Nth largest operation [15 points]

---

### **(text) Problem 5: Algorithm Analysis [5 points]**

Analyze the **time** and **space** complexity for each method in the Election system using **Big-O notation**.

---

### **(optional) Extra Credit: [10 points]**

Modify the `ElectionSystem` so that:
- The number of candidates is randomized.
- Candidate names are randomized.
- Number of electorate votes is randomized.

Use Java’s `Random` class to implement.

---

## **Grading Rubric:**

| Item                  | Points  |
| --------------------- | ------- |
| Type of Tree          | 10      |
| BST Traversal         | 10      |
| Heap Election System  | 30      |
| ZyBook Lab 7.13       | 10      |
| ZyBook Lab 8.11       | 15      |
| ZyBook Lab 8.12       | 15      |
| Algorithm Analysis    | 5       |
| **Total**             | **100** |

---

## **Author:**

**Author:** Jayden Cruz  
**Course:** CSC 3130: Intro to Algorithms\
**University:** Belmont University
