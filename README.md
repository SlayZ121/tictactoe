# tictactoe

#Requirements
Board-define size of board(n x n)
2 players(A, B)

#rules
If any row, column, diagonal or anti-diagonal is filled with same symbol of a player, considered as winner
Alternative turn of players
X or O symbol

#Outcomes
Player 1 wins
Player 2 wins
Tie

#Classes
1.Board class : int size, char matrix(n x n), default characters
->function to fill it with default characters
->function to print board configurations

2.Player class
->name of player
->age and restrictions
->address of the player
->Player contact number
->Player mail id
->Player symbol
->Initialise(constructor) : function -> set : setting props of the player
->function -> get : return details of a player

3.Game class
->implementation of the game
->Player details
->Board
->int turn: allow us to know which player's turn 
0->Player 1
1-> Player 2
->int moves
->boolean gameover