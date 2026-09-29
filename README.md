# Unit 2 - Assignment 2: Breadcrumb Follower

## Overview
In this assignment, you will program a robot to follow a winding trail of "breadcrumbs" (beepers) placed throughout the world. The trail can turn left, turn right, or continue straight, but it will eventually end. Your goal is to write a recursive `travel()` method that navigates the entire trail and turns off when the end of the trail is reached.

---

## World Setup
This project uses a custom world file named `BreadCrumbs.kwld`. Make sure `BreadCrumbs.kwld` is located in the root directory of your project folder alongside your `.java` files.

---

## How to Compile and Run

You can run this project using either the VS Code GUI or the integrated terminal.

### Option 1: VS Code GUI (Recommended)
1. Open `Driver.java`.
2. Click the **Play Icon** in the top-right corner, or press `F5`.

### Option 2: Integrated Terminal (Windows)
Because `KarelJRobot.jar` resides in the `lib/` folder, you must explicitly include the classpath (`-cp`) flag when compiling and running from the command line.

Open the integrated terminal in VS Code (`Ctrl + ~`) and run:

```cmd
javac -cp "lib/*;." BreadCrumbFollower.java Driver.java
java -cp "lib/*;." Driver
```

---

## Your Task

Complete the `travel()` method (and create helper methods as needed) in `BreadCrumbFollower.java`. 

### Key Behaviors:
1. **Look-Ahead:** At any given corner, the robot must check if a breadcrumb exists on the corner directly in **front**, to the **left**, or to the **right**.
2. **Advance on Trail:** If a breadcrumb is detected in one of those three directions, the robot should advance to that corner and recursively continue traveling.
3. **Backtracking:** If the robot checks a direction and finds no beeper, it must restore its original position and orientation before checking a different direction.
4. **Base Case:** When no breadcrumbs are found in front, to the left, or to the right, the robot has reached the end of the trail and should stop.

---

## Constraints & Rules

* **Strictly No Loops:** You may **not** use `while` or `for` loops anywhere in your implementation. All trail-following logic must be recursive.
* **Orientation Preservation:** Your look-ahead helper methods must leave the robot facing its original direction if a tested path turns out to be a dead end.
* **Do Not Pick Up Beepers:** The robot is following the breadcrumbs, not collecting them!

---

## Troubleshooting & Known Artifacts

* **`FileNotFoundException` for `BreadCrumbs.kwld`:** Ensure `BreadCrumbs.kwld` is placed in the main workspace folder, not inside `lib/` or `.vscode/`.
* **Closing the GUI Window:** Closing the Karel GUI window after execution finishes may produce a harmless `java.lang.UnsupportedOperationException` in the terminal referencing `Thread.stop()`. This is a legacy artifact of the library on modern Java runtimes and can be safely ignored.