TDD 练习

# 1 hangman game
The word to guess is represented by a row of dashes, representing each letter of the word. In most variants, proper nouns, such as names, places, and brands, are not allowed. Slang words, sometimes referred to as informal or shortened words, are also not allowed. If the guessing player suggests a letter which occurs in the word, the other player writes it in all its correct positions. If the suggested letter or number does not occur in the word, the other player draws one element of a hanged man stick figure as a tally mark.

The player guessing the word may, at any time, attempt to guess the whole word. If the word is correct, the game is over and the guesser wins. Otherwise, the other player may choose to penalize the guesser by adding an element to the diagram. On the other hand, if the other player makes enough incorrect guesses to allow his opponent to complete the diagram, the game is also over, this time with the guesser losing. However, the guesser can also win by guessing all the letters or numbers that appears in the word, thereby completing the word, before the diagram is completed.

# 2 tennis game results

Tennis has a rather quirky scoring system, and to newcomers it 
can be a little difficult to keep track of. The local tennis club has
some code that is currently being used to update the scoreboard
when a player scores a point. They has recently acquired
two smaller tennis clubs, and they two each have a similar piece of code.

You have just been employed by the tennis club, and your job 
is to refactor all three codebases until you are happy to
work with any of them. The future is uncertain, new features may
be needed, and you want to be thoroughly on top of your game when
that happens.

Summary of Tennis scoring:
1. A game is won by the first player to have won at least four points 
in total and at least two points more than the opponent.
2. The running score of each game is described in a manner peculiar 
to tennis: scores from zero to three points are described as “love”, 
“fifteen”, “thirty”, and “forty” respectively.
3. If at least three points have been scored by each player, and the 
scores are equal, the score is “deuce”.
4. If at least three points have been scored by each side and a player
has one more point than his opponent, the score of the game is “advantage” for the player in the lead.

