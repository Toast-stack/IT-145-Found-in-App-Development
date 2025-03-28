# IT-145-Foundations-in-App-Development

## Overview

This repository contains Java projects developed for the IT-145: Foundations in Application Development course at Southern New Hampshire University (SNHU). The course focuses on fundamental programming concepts, including object-oriented programming, conditionals, and data structures.

## Projects

The repository includes the following Java projects:

- **Pet Class**: A class representing a pet, specifically a dog. The project covers basic object-oriented principles like constructors, getters, setters, and data encapsulation.
  
- **Paint Calculator**: A simple program that calculates the amount of paint needed to cover a wall based on user input for wall height and width.

- **Paint Calculator with Cans**: An enhancement to the previous paint calculator program. It calculates not only the amount of paint needed but also the number of paint cans required to cover the wall, rounding up to the nearest whole can if necessary.

## Module 2: Pet Management System

The Module 2 project focuses on creating a `Pet_class` in Java to manage pet-related data. This class includes attributes such as `dogSpaceNumber`, `dogWeight`, and `grooming`, along with their respective getter and setter methods.

### Key Features

- **Attributes**:
  - `dogSpaceNumber`: Represents the space number assigned to a dog.
  - `dogWeight`: Stores the weight of the dog.
  - `grooming`: Indicates whether the dog requires grooming services.

- **Constructors**:
  - A default constructor that initializes a new instance of the `Pet_class`.
  - A parameterized constructor that allows setting initial values for `dogSpaceNumber`, `dogWeight`, and `grooming`.

- **Methods**:
  - Getter and setter methods for each attribute, enabling controlled access and modification.

**Note**: The `main` method currently creates an instance of the `Pet_class` but does not include functionality for user interaction or data processing.

## Module 3: Paint Calculator

The Module 3 project is a simple paint calculator program designed to calculate the amount of paint needed for a wall based on its dimensions. The program uses user input for wall height and width, calculates the total area of the wall, and then calculates how many gallons of paint are needed to cover the wall.

### Key Features

- **User Input**: The program prompts the user to enter the height and width of the wall. It ensures the inputs are valid, and prompts the user again if an invalid input is provided (e.g., non-numeric values or negative numbers).
  
- **Wall Area Calculation**: The program calculates the area of the wall by multiplying the height and width to determine the square footage.

- **Paint Calculation**: The program calculates how much paint is needed in gallons, using the total wall area and the known coverage area of one gallon of paint (350 square feet).

### How it Works:

1. **Input Validation**: The program uses `do-while` loops to ensure that the user inputs valid, positive values for the wall's height and width. If invalid input is detected, the user is prompted again.

2. **Area and Paint Calculation**: Once valid inputs are received, the area is calculated and printed, followed by the required amount of paint in gallons.

3. **Output**: The program outputs the wall's area in square feet and the amount of paint needed in gallons. The constant `350.0` is used to represent the coverage area of one gallon of paint.

### Example Output:
Enter wall height (feet): 10
Enter wall width (feet): 20
Wall area: 200.0 Square Feet
Paint needed: 0.5714285714285714 gallons


## Module 4: Paint Calculator with Cans

The Module 4 project is an enhancement to the previous paint calculator program. In addition to calculating the gallons of paint needed for a wall, this program now also calculates the number of paint cans required to cover the wall. The program takes into account the wall's dimensions (height and width) and outputs the required number of paint cans, rounding up to the nearest whole can if necessary.

### Key Features

- **User Input**: The program prompts the user to enter the height and width of the wall. The inputs are used to calculate the total area of the wall.
  
- **Wall Area Calculation**: The program calculates the area of the wall by multiplying the height and width to determine the square footage.

- **Paint Calculation**: The program calculates how much paint is needed in gallons, using the total wall area and the known coverage area of one gallon of paint (350 square feet).

- **Cans Calculation**: Based on the gallons of paint needed, the program calculates the number of cans required to paint the wall, rounding up to the nearest integer to ensure enough paint is available.

### How it Works:

1. **Input**: The program prompts the user to input the wall height and width.
2. **Area Calculation**: Once the inputs are provided, the program calculates the total area of the wall.
3. **Paint Calculation**: It then calculates how many gallons of paint are needed to cover the wall area.
4. **Cans Calculation**: The program calculates the number of cans required to cover the wall, rounding up to ensure enough paint.

5. **Output**: The program outputs:
   - Wall area in square feet
   - Gallons of paint required
   - Number of cans required (rounded to the nearest whole number)

### Example Output:
Enter wall height (feet): 10
Enter wall width (feet): 20
Wall area: 200.0 Square Feet
Paint needed: 0.5714285714285714 gallons
Cans needed: 1 can(s)

## Getting Started
To run the Java projects locally:
1. **Clone the Repository**:

       '''bash
       git clone https://github.com/Toast-stack/IT-145-Found-in-App-Development.git
2. **Navitage to the Project Directory**:

       '''bash
       cd IT-145-Found-in-App-Development/Java Projects

3. Compile and Run a Java Program:

         '''bash
         javaac ProgramName.java
         java programName
Replace `ProgramName` with the name of the Java file you wish to run

