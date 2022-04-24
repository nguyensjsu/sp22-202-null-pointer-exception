## **Null Pointer Exception Sprint #2**

### **Team Member Name (Individual)**<br>

Anshul Kumar Shandilya

### **What have I been working on?**

For this week, we first implemented the base code to work on. I took on the classes relating to Ball, Brick and the main BrickBreaker class. For the Ball, the file consists of the location handling for the Ball, various states for the ball, movement for the Ball and the sprite for the ball which is loaded into the game. The brick breaker class handles the current implementation of the GUI frame. It is the main class for the entire game and contains functions like initUI which is the point where the gui elements are initialized. For the Brick class, similar to the Ball class, consists of various aspects that relate to the brick. Features that relate to this class are creating and maintaining the sprite for each initialized brick present in the game, health for the brick (each brick has to be hit multiple times to break), handle damage taken and destruction for the brick, and also if the brick contains a powerup (not yet implemented).

### **What I plan to do today/this week?**

What we plan to do for the next week is to properly refactor the code. What this refactoring consists of is making sure that design patterns are implemented to the code and the code becomes more loosely coupled. For example, we can make various classes like GameObject, which contains characteristics of a game object, irregardless of what it is. This would be the base class. Then we can extend (possibly creating abstract classes) called Fixed and Movable. These both classes can implement interfaces called IFixed and IMovable. Then depending on what the game object is, we can extend Movable and Fixed game object classes respectively. To add more functionality, I can also create an interface called ISteerable, which would contain necessary stuff to implement steer or player movement capability for the Ball racket in our game. These are still to be made concrete, but I do have a clear idea of what I need to do in the case of refactoring. The first step is going to be creating a UML class diagram of what the structure is going to look like, and then sharing it with the team, (needs to be brought up in meetings) and then make sure everyone follows that UML diagram for implementations. 

### **What are my blockers?**

For this sprint, I had no blockers for me.

### **Core XP value - (Communication)**

The communication aspect fthis week went way better for us than it did in the last sprint. At every implementation state for our team members, we are effectively communicating what our state is throughout the whle process. This is not something that is being enforced or being told about, the team members are doing it completely on their own. My understanding is that every team member cares about what they are doing and are commited to maintaining quality. If one of the team members complete a feature, they immediately let us all know in the team chat, so that he can either move on with the next task and also if others were waiting on his task, then they would be notified and they can move on with other stuff.