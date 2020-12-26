# 0. Pattern Based Tic-Tac-Toe

You have coded Tic-Tac-Toe in your Intro to Programming course. Now, you need to introduce design patterns to your tic-tac-toe. 

* You need to implement three difficulty levels of tic-tac-toe: Easy, Normal, Hard. Any level should be selectable at the start of the game and you need to implement strategy pattern to strategies algorithm for each level e.g. algorithm for the hard level should not let the user win in obvious cases. The real task here is to integrate strategy pattern, not the perfect AI

* Use Singleton to preserve state of the tic-tac-toe i.e., only one instance of the game should be used to play and update the cells.

* Create a class `GameRunner` that should hold the state of a running game. It should contains current state of the board, next turn of the player (can be X or O) and game record (X number of wins VS O number of wins). You need to use a builder in this class to construct an object with all these fields. You need to save this information in a txt file and you should be able to load a game in a running session from the `GameRunner` object which can resume the game with current board, player turn and game record. (You can ask user for a new OR load game from `GameRunner` when you start the application. You can assign a key to save a running game state to a txt file via `GameRunner` object).

Design tips
* Decouple the game logic from the user interface (printing and receiving input)
* Write tests for all your classes -- you will need to use mocks in some cases
* Use an interface to abstract a `Player` -- `AIPlayer` and `HumanPlayer` should implement this.

# 1. Delivery Cost Visitor (Optional)

You need to implement visitor pattern in order to bring delivery information of goods. Goods are divided into Books and CDs. Both Book and CD POJOs should contain these attributes.

* itemName
* itemCost

If a book costs < 10£, delivery charges are 3£ whereas for books cost more than 10£, delivery is free.
For a CD costs < 5£, > 5£, >10 £, delivery charges are 3£, 2£ and 1£ respectively. 

Your visitor should be able to visit any type of items and should bring back total cost i.e., itemCost + Delivery Cost
Read about 'isInstanceOf' in Java and compare how visitor is better and why we should use it.
 


