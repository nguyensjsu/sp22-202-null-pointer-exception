##  **Null Pointer Exception Week** #4

### **Team Member Name (Individual)**<br>

Boteng Yuan

### **What have I been working on?**

For this week, I was working on implementing the two players mode and imporving the logic of how the racket response to pressed keys to make the movement of racker much more smoothly. Also, I helped my team members to fixed some bugs about bricks.

For the two players mode, I decided to using the lambda function inside of the **GameBoard.java** because it's more easier to implement, and I don't need to create multiple java files. The logic of game will change if the two players mode is selected.

For the movement of rackets, the original code donesn't will stuck if multiple keys was pressed at the same time. I created a set in the **Racket.java** class, which will record what keys was pressed but not released yet. So the racket will response to the last pressed key, and when the last key was released, the racket will look into which key was pressed but not released and responses to that. If all the keys was released, the racket will stop moving. Using this logic of movement, the racket is moving much more smoothly than before.

### **What I plan to do today/this week?**

Since this is the last week for this project, I don't have a plan for next week. However,
we will keep working testing and fixing bugs.

### **What are my blockers?**

I didn't encounter any blockers for this sprint.

### **Core XP value - (Courage)**

The courage value of this sprint was well maintained for this week. I didn't feel any hesitation from my team members when they pointing out bugs of the code and when they encounter some blockers of features that they want to implement. 
