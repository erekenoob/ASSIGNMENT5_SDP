# ASSIGNMENT5_SDP
# Student Study Session - Strategy Design Pattern

## Overview
This project is developed as part of **Assignment #5**. It demonstrates the practical application of the **Strategy Design Pattern**.

Instead of relying on conditional statements (`if-else` or `switch`) to manage student learning routines, the system encapsulates each activity into an interchangeable strategy object. The **`StudySessionContext`** delegates execution polymorphically, allowing dynamic strategy switching at runtime.

---

## Project Structure & Architecture

The project is organized into clean packages to separate responsibilities:

```text
strategy-study-session/
├── src/
│   ├── Main.java
│   ├── context/StudySessionContext.java
│   └── strategy/
│       ├── StudyStrategy.java
│       ├── SmokeBreakPacedStudyStrategy.java
│       ├── CoffeeFueledStudyStrategy.java
│       ├── OrganizedDeskStudyStrategy.java
│       ├── DeepFocusStudyStrategy.java
│       └── PowerNapStudyStrategy.java
└── README.md
