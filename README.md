## CoffeeMachine

**Language:** Java
**Source:** Hyperskill.org (Educational Project)

### Project Description

This project implements a simulation of a coffee machine in Java. The goal was to create an application that handles various operations related to coffee preparation, such as buying coffee, filling ingredients, taking out money, and displaying the current state of supplies. The project was developed in several stages, with each stage adding new functionalities and requiring code refactoring.

### Project Structure

The project is divided into the following classes:

* **CoffeeMachine:** The main class that runs the application.

* **Ingredients:** This class manages the inventory of ingredients required to make coffee (water, milk, coffee beans, cups). It provides methods to check the availability of ingredients and adjust their quantities.

* **CoffeMaker:** This class is responsible for the coffee preparation process. It communicates with the `Ingredients` class to verify the availability of ingredients and adjust their quantities. It supports the preparation of three types of coffee.

* **UserInterface:** This class handles communication with the user through the console. It is responsible for validating user input and calling the appropriate methods based on the user's choices.

### Functionalities

The coffee machine supports the following actions:

* **Buy:** Allows the user to choose from three types of coffee. Checks the availability of ingredients and prepares the selected type of coffee.

* **Fill:** Allows the user to replenish the coffee machine's supplies (water, milk, coffee beans, cups).

* **Take:** Allows the user to withdraw money from the coffee machine.

* **Clean:** Cleans the coffee machine. This action is mandatory after every 10 coffee preparations. The user cannot perform other actions until the machine is cleaned.

* **Remaining:** Displays the current status of the coffee machine's supplies (water, milk, coffee beans, money, cups).

* **Exit:** Terminates the program.

### Usage

1.  Run the `CoffeeMachine` application.

2.  A list of available actions will be displayed.

3.  Enter the number corresponding to the desired action.

4.  Follow the on-screen instructions.

### Implementation Notes

* The program is structured with an emphasis on modularity and adherence to the single-responsibility principle. Each class has clearly defined tasks.

* The code was refactored at various stages of development to improve its readability and maintainability.

* User input is validated to prevent errors.

* Methods are designed to perform a single specific task, which improves code clarity.
