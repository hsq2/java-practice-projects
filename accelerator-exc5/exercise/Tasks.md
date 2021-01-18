# Streams

 Use the [data.txt](https://gitlab.io.thehut.local/accelerator20/teaching-material/java/-/blob/master/week5/exercise/Helping_Material/Task3/data.txt) in your helping material folder for this task. You need to extract the contents of the stated file and need to save them in a data structure of your choice. The data type of the data structure should be String for firstName and lastName and double for the salary (Hint: needs a POJO). You need to print the following on terminal using streams.

  *	Contents of data.txt in sorted order based on the first name of every person
  *	Contents of data.txt in sorted order based on the surname of every person
  *	Contents of data.txt in sorted order based on the salary of every person
  *	Use streams to sum all of the salaries from question 1 with a 10% bonus added to staff members whose first names beginning with a-m. Does it perform faster or slower when you use parallel streams?

# Generics

Implement the interface `MiniList<E>` in the `generics` folder with a name and algorithm of your choice. Your implementation should be generic.

You can either:
* Wrap an existing data structure
* Write your own from scratch

Make sure you have written tests for it. 


# Exceptions and Logging

You need to go back to your pattern based Tic-Tac-Toe and need to add exception handling and logging in your game. Use appropriate exception classes as needed. You need to write an appender for logging with following characteristics.

 * FileAppender at error level that should roll by size
 * Max five zipped files, after which files should be replaced
 * 3KB max file size and 1MB total space for logging
 * Either log and handle exceptions OR wrap and re-throw. Don't do both (we will cover this in the lectures)
 * Write unit tests to describe which scenarios exceptions should be thrown in.
 
# Code Smells (optional)
* Find out if there are any code smells in your Tic-Tac-Toe code. Follow the code smell classification and try to identify which code smells are there and how to fix them (you can also fix them along with the identification if you have enough time).





