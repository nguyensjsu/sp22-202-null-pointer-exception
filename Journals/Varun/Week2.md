# Null Pointer Exception Week #2

### **Team Member Name (Individual)**<br>

Varun Teja Maguluri

### **Overview:**
The main tasks that I have worked on for this week is to design and implement the paddle that will be a key component in our game and also the position maintainence and keep tracking of each and every UI component that will be involved in the game development. To achieve this, I have used java geom.Rectangle2D package and java swing package. So, for paddle to move left and right, I have imported java keyEvent package. And also designed the paddle images with small, medium and larger lengths. So, I will be explaining the flow and logic that I have implemented during this week below.

### **Design and Implementation:**
First thing that I have planned to do is to design and develop the paddle and implement the logic for it to be able to move from left to right or viceversa by the direction in which the user is making it to go. So, to do that I have choosen java awt package and java swing packages. And then I have taken 3 types of images to implement the paddle logic which were of different sizes because these different sizes will be implemented according to the functionality and execution of game. Then I have imported these images into my project and have retrieved their dimensions. Because these dimensions are very useful to keep track of and the final design will be relying on these dimensions for each and every UI component. Then I have  implemented the code in such a way that the initial paddle that will be used by the user is a small one. But once the player hits a special brick, and catches a red ball, then the paddle size is set to medium one. And similarly if the player hits another red ball, then I have written logic to change the paddle to large one.

Then to move the paddle to left and right, I need to validate the keys pressed by the player and based on that I need to enable the motion to the paddle. So, to achieve this I have imported and used the java events package. So, whenever the user hits the left arrow, the coding logic that I have written will be validating the key pressed by the player and moves the paddle into that appropriate direction. And similarly for the right arrow, if the user hits the right arrow, the coding logic that I have written will be validating the key pressed by the player and moves the paddle into the right side. And finally if the user loses one life, then the paddle position will be reset to default position which is into the middle.

The next feature that I have worked on is the positioning of each and every UI component in the game screen. To keep track of every movement of each component I have imported and used java geom.Rectangle2D package. So, using this at first I have tracked the game screen width, height, starting X coordinates and Y coordinates. Then I accessed the imageWidth and imageHeight of each and every UI element that is presented on the screen. So, whenever there will be a movement between the UI elements their positions will be monitored accurately. The next feature that I have designed and developed is to enable a button to go back to main menu. And also initialized the button boundaries on the screen. For this, I have implemented JButton functionality. Then based on the movements of the components a focus method is created and this focus method will be setting the focus on a particular UI component based on the game utilities. Now to enable this button to perform some action, I have used actionListener to handle this task. So, if the player hits the back menu, the button's action will be revalidated and color of the button will be changed and the action will be performed to navigate to next screen.

And also based on the player's standard of game, the score of the player and lives of the player will be calculated and will be shown on the screen. The score will be validated based on the number of bricks the player hits. And by default the player will be having 3 lives at the start of the game. Then I have also implemented the logic to change the project background according to the players choice. And the features that I am trying to implement in the upcoming weeks are to include background music to the game and also the slower and faster modes of the game.

### **Roadblocks Encountered:**
The first roadblock that I have encountered in this application is to make paddle move in directions that the player wanted to. So, at the starting, it was a bit of roadblock, but I have managed to cope up with this problem and used java keyEvent package which made my work easy to implement this scenario in our application. Then, the second roadblock that I have came across is to keep track of X coordinates, Y coordinates, Widths and Heights of each and every UI element. This was a bit challenging task for me at the start, but after my research, I managed to find a solution for this issue. The third and final roadblock that I have encountered is to create a button and make that button actionb enabled. So, for this task I have used java ActionListener and java ActionEvent packages. Apart from these three problems, there were no roadblocks for me in this total week of my work. 

### **Core XP value - (Feedback):**
The core XP value that I have choosen for my project development is Feedback. So, for this week I have executed constant feedback about the previous week efforts of which features were implemented in our game, and I have processed which modules were unnecessary for this game and have discarded them. Feedback also supported me to  simplify designs as well as complex designs and elevates them in a timely manner in my game. And particularly for this week, at first I have implemented 5 paddles for my game, but after my analysis, I have decided to discard these 5 paddles and decided to go for 3 paddles. By this feedback, the work load for me was greatly reduced and the game's functionality was not effected much. And I was able to simplify my game's performance.


### **Coding Screenshots:**

<img width="1029" alt="Screen Shot 2022-04-23 at 12 53 54 AM" src="https://user-images.githubusercontent.com/98674002/164885961-eabd9b7b-e977-4dd6-b813-f86578cba88a.png">

<img width="1012" alt="Screen Shot 2022-04-23 at 12 54 17 AM" src="https://user-images.githubusercontent.com/98674002/164885964-9b0fe0d6-0ee1-45a7-9c1e-29774fd1f861.png">

<img width="1013" alt="Screen Shot 2022-04-23 at 12 54 28 AM" src="https://user-images.githubusercontent.com/98674002/164885965-81c102ad-e877-4723-9362-f86dac814691.png">





