
# Null Pointer Exception Week #3

### **Team Member Name (Individual)**<br>

Varun Teja Maguluri

### **OVERVIEW :**
The main coding functionalities that I have worked on for this was to add new features to our application and refactor the code to maintain a good coding structure. The main new features that I have implemented for this week are paddle sizes, background sounds for ball when it hits bricks and paddle and finally changing background colors manually according to player's wish. So, let's dig deep into the new features that I ahve implemented in this application and also the functionalities of each added feature.


### **Code Implementation for New Features:**
For the week 3, I have been totally working on implementing new features into the game and also code refactoring. So, upto now I have implemented the paddle motion and execution of paddle direction to left or right according to the player wish. Now, there is an added feature to this game which I have implemented and that is to show some special bricks in different levels. Before explaining this scenario, I want to elaborate one thing. Basically, in the game we will be having 3 paddle sizes. "Small", "Medium" and "Large". Based on the game rules and player's achievements, the paddle sizes will be increased.By default the paddle size will be "Medium". The main cause of these special bricks is whenever the player hits these special bricks with ball, then a red ball will be released. If the user with the paddle managed to hit the red ball, then the paddle size will be increased to large size.

But there is a small caution in this feature. After getting one redball in the game, if the player again hits a special brick and catches the red ball with paddle, then the paddle size will be changed to small. So, this will surprise any player if he plays this game for the first time. If the player loses his life, then the paddle size will be reset to medium. This is the one new feature that I have implemented during this week. And the next new feature that I have implemented is the sound when the player hits the brick with his ball. And also th implement the sound when the ball touches the paddle. The other feature that I have implemented was the player can select the background color to whatever he needs before playing the game. So, these are the some of the new features that were implemented during this week sprint. I am planning to implement some new features into this application to include some GIFs into the game. If everything goes as per schedule, will finish that in the following week.


### **ENCOUNTERED ROADBLOCKS :**
The first road block that I have encountered during this week while implementing the new features is changing the paddle sizes. I have a plan to change the paddles sizes from the starting of the development, but have no idea where to implement this logic. So, it took some time to figure out a way to apply this. But after a long discussion with my team, I have came up with a plan to initialize a special brick concept in our game. So, I have implemented this logic there. Then the second roadblock that I encountered was adding the background sounds for each and every utility that is in motion during the game. So, after some research, I figured out a way to implement this feature using java audio stream packages. Apart from these two roadblocks, everything went smooth during this week's work.

### **Core XP value - (Feedback):**
For week3, regarding some features that were included in the game. So, as my responsibility for this project is to review the output and performance of the application and analyze it and try to remove any unwanted features from the application to make it work more effectively. So, I did reported to my team on this and suggested them to remove some of the unwanted features from the game as they were effecting the game's performance. And this feedback helped me and my team to remove complex situations and use the simple and effective solutions to speed up the game without crashing it. Every iteration of commitment will be taken seriously for delivering a working game. The game in the coming weeks should be undergoing a lot of testing and feedback is taken so that necessary changes can be made if needed. The value of the feedback is a continuously running system that delivers information about the game in a reliable way.

### **CODING SCREENSHOT FOR PADDLE IMPLEMENTATION :**

<img width="1200" alt="Screen Shot 2022-04-30 at 11 48 45 PM" src="https://user-images.githubusercontent.com/98674002/166135442-cc0a234d-f23a-4d60-82f0-cd3c39062f2b.png">

### **IMPLEMENTATION TO CHANGE BACKGROUND COLOR OF GAME :**

<img width="1201" alt="Screen Shot 2022-04-30 at 11 50 17 PM" src="https://user-images.githubusercontent.com/98674002/166135496-2ad52948-c49b-43b4-b865-416c994f2237.png">
