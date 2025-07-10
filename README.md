# JAVA Project

This project demonstrates a variety of classic Data Structures and Algorithms implemented in Java. It includes exercises and implementations for Binary Search Trees, Graph Algorithms (Dijkstra, Euler Cycle, Traversal), Linked Lists, Queues, and more.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code for easier code navigation

## Installation

1. **Clone the repository** (if not already downloaded):
   ```sh
   git clone <repository-url>
   cd Data-Structures-and-Algorithms-main
   ```
2. **Compile the source code:**
   Each exercise/module contains its own `src` directory with Java files. For example, to compile the Binary Search Tree exercise in `BSTree-Exercise/Person`:
   ```sh
   cd BSTree-Exercise/Person
   javac -d bin src/*.java
   ```
   This will compile the Java files in the `src` directory and place the `.class` files in the `bin` directory (create `bin` if it does not exist).

## How to Run

After compiling, run the main class for the desired module. For example, to run the BSTree-Exercise/Person module:

```sh
cd BSTree-Exercise/Person
java -cp bin Main
```

Repeat similar steps for other modules (e.g., DijkstraGraph-Exercise, EulerCycle-Exercise, etc.).

## Project Structure

```
Data-Structures-and-Algorithms-main/
├── BSTree-Exercise/
│   ├── bal/
│   ├── BSTree1/
│   ├── Delete-By-Copy/
│   ├── Person/
│   └── Rotate/
├── DijkstraGraph-Exercise/
├── DoubleLinkedList-Exercise/
├── EulerCycle-Exercise/
├── LinkedList-Exercise/
├── Queue/
├── TraversalGraph-Exercise/
├── README.md
└── ... (project and build configuration files)
```

- Each main folder contains:
  - `src/`: Java source code for the specific data structure or algorithm.
  - `bin/`: (You may create this) Compiled `.class` files after building.
  - `nbproject/`, `build.xml`, `manifest.mf`: Project and build configuration files (for NetBeans or similar IDEs).

## Learn More

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [How to Compile and Run Java](https://www.oracle.com/java/technologies/javase/codeconventions-137265.html)
- For questions or contributions, please open an issue or pull request.
