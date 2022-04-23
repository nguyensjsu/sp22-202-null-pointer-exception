# Week 1 Journal
<b>Team Member: Rafic Roy Hasbini</b> 
<br>

<b>What have I been working on?</b> 
<br>
For the first week, the primary objective has been to decide on a project to implement for the project. It was decided that the team would move forward with the implementation of a BrickBreaker game. This lead to our first task of finding a good base for a game to derive our own version. An open source BrickBreaker game was found to serve as the foundation. Each member was tasked with becoming familiar with the code and come up with ways to refactor the code in a manner to implement design patterns and make the code more friendly for adding features. This step included understanding the various components which made up the UI, as well as the back-end elements which made up each component of the BrickBreaker game such as bricks, the ball, paddle, and the gameplay flow. A shared document was also created to serve as a hub for brainstormed ideas where members could add potential features that may be added to the game. 

<b>What I plan to do today/this week?</b>
<br>
For this week, I plan on running the original source-code game to test the full flow and become more familiar with the rules already implemented, as well as identify potential areas for game-flow change. Each page in the app was visited to see what features already existed and how they may be changed/enhanced. Once I am familar with the source implementation and flow, I plan to contribute to the total refactoring of the code to reduce coupling of different components and reduce the probabilty of breaking other areas of code if a change is made. Specifically looking at changing one gameflow rule for the ball touching the top border. Currently, when the ball touches the top border, the game counts that as a loss and one life is deducted from the player. I plan on changing this rule to make the ball bounce when it touches the top boder like it would for the side borders, instead of counting it as a loss. I also plan on contributing in discussions for design pattern implementation.

<b>What are my blockers?</b>
<br>
Since this specific week has been focused on the conceptual aspects of the project and setting up the administrative tasks and roles, there are currently no blockers faced.

<b>Core XP value - (Simplicity)</b>
<br>
Simplicty refers to the administrative roles of the project as well as the physical code implementation for the game.
Simplicity in administrative tasks:
  By having a clear and defined set of tasks for each person we are able to reduce confusion and increase productivity. 
  Documentation and following a set plan is key.
Simplicity in implemenatation:
  Refactoring code to reduce coupling of components will help produce a more simple implentation which is easier to work with and expand.
  By reducing coupling, we aim to have more java classes and files based on each object/game element to allow for easier and more straight forward implementation of features.
