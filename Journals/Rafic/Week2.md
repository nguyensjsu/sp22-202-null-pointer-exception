# Week 2 Journal
<b>Team Member: Rafic Roy Hasbini</b>
<br>

<b>What have I been working on?</b> 
<br>
This week I have been actively working to change the gameplay rules for a ball bouncing on the top border. This included becoming familiar with the Ball.java class and Gameboard.java class to dictate the condition if the ball hits the top border. To make this change, I have removed the condition to stop the game if the ball hits the top in Gameboard.java class, and have implemented a new condition in the move method of the ball class to change reverse the x-direction of the ball touches the top border. Images of the updated code for the ball and gameboard is attached below: 
<br>
<img width="360" alt="BallMoveMethod" src="https://user-images.githubusercontent.com/98677825/164889564-6aac2d99-c3e4-4301-bb1c-d48fc324dc32.png">
<br>
In the Gameboard.java class, the following line was removed to allow for the new ball.move() implementation to dictate condition of ball hitting top border.
    if(ball.getRect().getMaxY() < Configurations.TOP_EDGE){stopGame();}

A separate branch was created in the repo to commit these changes, before they can be carried into the master branch. The changes was also tested and works as intended.

<b>What I plan to do today/this week?</b>
<br>
For my tasks this week, I plan to come up with a design to implement two new levels. So far I have brainstormed ideas for using a state pattern design to implement a state machine. Three states (one for each level) will be created, and the transition between levels will occur once all bricks have been destroyed (when the max score for each level has been reached). Once the max score has been reached at a level, the machine will transition to the next state. If the player runs out of lives, the state will change back to the first level state. I also plan to implement a decorator pattern to implement the screen brick layout for each level. I still need to come up with the design for this implementation as well as discuss with Varun on an appoach since he is doing the UI. 

<b>What are my blockers?</b>
<br>
Initially I ran into a blocker where I could not test new changes to code. When the app was launched with a bug, the system home screen buttons would not function, therefore I could not select "Start Game" button and procceed with the game. This is due to the code being closely coupled. We are still working on a solution to refactor the code to prevent such scenarios from happening, as well as reduce the complexity of the code. 

<b>Core XP value - (Simplicity)</b>
<br>
Adhering to the core value of simplicity: I implemented what was assigned to me in by editing the current code without having to add or create additional functions and make things more complicated. By doing so I was able to complete the task at hand quickly and move on to brainstorming an approach to implement levels.  
