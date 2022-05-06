## **Null Pointer Exception Sprint #4**

### **Team Member Name (Individual)**<br>

Anshul Kumar Shandilya

### **What have I been working on?**

For the final week of the sprint (week #4), I initially planned to implement Iterator design pattern for the game objects that exist in the game. But I soon realized that my team-mates had already implemented a lot of stuff over the existing implementation for the game board and the objects. Me changing the implementation would require a huge refactoring for the code. So I decided to not go with it. Instead, I implemented other features. 

One of the features that I implemented was the health brick. It is a brick present in the game that if destroyed, will give you an extra life. I have made it so that there is 1% chance of the health brick appearing in the game. It has a green sprite. Also, there can only be a single health brick during a level game play. 

Another feature that I implemented, is that I implemeneted Observer pattern for implementing the information on the game screen. On the game screen where you play the game itself, at the bottom, there is an information screen that shows the player various information like the current speed of gameplay, amount of lives left and the score. I made the variables for the info. as subjects, and then created respective observers for them. Then in the gameBoard class, wherever I need the information extracted, I call the getter method for the subject. Thus creating a loosely coupled dependency. 

Another pattern that I implemented was the strategy pattern for initializing the various bricks that existed in game. In the brick class, I created various lambdas for implementing the strategy pattern. Since each brick as a different image file loaded for the sprite, and some of them have different strategies of initializing the bricks, I made it so the strategy for initializing various types of bricks is decided in Brick class where the chances are defined for creating various bricks using random function. 

Apart from the above, I also created a button for the game that is visible while playing game. This button toggles the music on and off. 

### **What I plan to do today/this week?**

Since this is the last sprint, there isn't any planned work to do. But after this week, if we do find any bugs, or more necessary changes come up, then that will be carried out.

### **What are my blockers?**

For this sprint, I had no blockers for me.

### **Core XP value - (Communication)**

The communication aspect for this week went better than any other week. The team mmebers were quick to point out any bugs, and on the other hand, people were pretty quick to solve the bugs in an efficient manner. As mentioned before, we use a common chat group for all communication. This also enabled us to share various files that we felt like we needed to share for approval or feedback without commiting to github first. 