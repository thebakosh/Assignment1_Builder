I successfully created a program using the Builder pattern to build cars step by step. The code is clear, easy to read, and can be easily changed or extended.



-	Car – Stores car data (model, year, color) and provides a readable output.
-	CarBuilder – Interface defining methods to build a car step by step.
-	ConcreteCarBuilder – Implements CarBuilder and creates Car objects.
-	CarDirector – Controls the building process for specific car types.
-	Main – Runs the program, builds cars, and prints them.
