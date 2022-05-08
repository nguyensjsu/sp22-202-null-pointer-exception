
# Null Pointer Exception Week #4

### **Team Member Name (Individual)**<br>

Varun Teja Maguluri

## **Overview**<br>
For week4, my main focus was on refactoring the code and implementing the new features that helps the game to enhance more. And also removing any unwanted code or logic implementations from the code to reduce complexity for the game. And also altering the paddle images with small, medium and larger lengths. Because the screen size configurations has been modified. So, I will be explaining the flow and logic that I have implemented and also the design patterns that I have implemented during this week below.

### **Design and Implementation:**<br>
The first thing that I had worked on for week 4 is the resizing the images to a bigger ones. Because the code that we have worked on earlier has small screen configurations. So, to exlcude ambiguity and clear the user confusion, I have increased the screen congigurations to a bigger level. So, to support my screen size all components should be resized to fix with the screen. So, had done this as my first priority because the UI is the key point for any game. The next thing that I had worked on for this week is to remove any unwanted code or unwanted feature from my game. Because keeping this type of feature will make no sense for the game and also increase the complexity for the players. I was only concentrating on the features that were needed minimal for the game application. So, I have removed them. The next thing was to remove any commented code from the project. So have done it.

The next module that I have worked on was to implement the design patterns for the code. To do this, I need to refactor the code and select the components that I need to apply design patterns. So, I have selected the Audio module and images module to implement the design patterns. The first module that I ahve chosen is audio for background. So, for this I have implemented the Strategy pattern. So, by default the strategy was set to game music class and it plays the music. But whenever the player loses his game, the strategy was set to stop the music and then a new audio will be set as strategy and it will be played in the background. Similarly, if the player wins the game, thn the strategy is changed to stop music and then a new strategy called victory is set and that particular music will be played in the background. The next feature that I have chosen to implement design pattern was image display for win and lose for each game. So, here I have implemented Observer pattern for this particular task. So, if the user fails to win the game, then the observer will call the game over image and similarly if the user wins the game, then victory image will be called and set on screen.

### **Roadblocks Encountered:**
The  roadblock that I have encountered in this application is to make the UI changes for almost all of the images in the game which is a hectic work but needs to be done. So, it took a lot of time for me to do that but managed to finish it. This is the one and only roadblock that I have came across for this week. 

### **Core XP value - (Feedback):**
The core XP value that I have choosen for my project development is Feedback. As it is our last week to design this game, we have gone through a in depth meeting and marked down which were important for the game and which were not. So, for this week 4 I have executed constant feedback about the previous week efforts of which features were implemented in our game, and I have processed which modules were unnecessary for this game and have discarded them. Feedback also supported me to  simplify designs as well as complex designs and elevates them in a timely manner in my game. And particularly for this week, we have successfully reviewed the final output of our game and made sure everything is in place. 
