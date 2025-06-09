# Finch-Robot
---
## Devlopment Checklist

| Completion | Task |
| -------------| -------------|
| Familiarize | - Connected to the Finch, controlled lights and sounds, used basic Java features like loops and random numbers |
| Connect & Setup | - Connected robot to the computer and downloaded the software needed to program it |
| Develop Code | - Wrote a Java program to move the Finch, play notes, flash lights, turn randomly | 

## Design Cycle
The design cycle helped me organize the project into clear steps. I started by connecting to the Finch robot and experimenting with its basic features like lights, sound, and movement. Then, I planned the robot’s behavior to include moving forward, turning at random angles, changing tail light colors, and playing different notes. I wrote and tested the code, using loops and random values to make the robot's actions more dynamic. During testing, I adjusted timing, motor speed, and light settings to improve how the robot responded. Finally, I evaluated the program's performance, added finishing touches like messages and color changes, and ensured everything worked smoothly. This process made it easier to build an engaging and interactive robot experience step by step.

---

### Code to Highlight

```java
Finch bird = new Finch();

bird.setBeak(100, 0, 0);
bird.playNote(60, 0.5);

bird.setMove("F", 10, 50);
bird.pause(1);

for (int i = 0; i < 5; i++) {
    int t = (int)(Math.random() * 360) + 1;
    bird.setTurn("R", t, 50);
    bird.playNote(60 + (i * 5), 0.3);
    bird.setMotors(-100, 100);
    bird.setTail(1, (i * 20) % 100, (i * 30) % 100, (i * 40) % 100);
    bird.pause(1);
}

bird.print("Exploring!");
bird.playNote(72, 1.0);
bird.setBeak(0, 100, 0);

bird.stopAll();

```

---
## Questions
### What Did You Learn?
I learned a lot through this project:Movement Control: I learned how to make the Finch move forward, backward, and turn by random angles. I also understood how to adjust its speed and make it stop.LED Control: I learned how to change the colors of the Finch’s beak and tail to give it visual feedback. For example, I made it show different colors during movement.Sound Feedback: I figured out how to make the Finch play sounds at certain points in the program, giving it a more interactive and fun feel.Randomness: I learned how to use random values to make the Finch turn at random angles and behave unpredictably, which makes the program feel more dynamic.
### What was your motivation?
Motivation:I wanted to explore and understand the Finch robot better. Instead of just using it in a simple way, I wanted to experiment and see how I could control its movements, lights, and sounds. The idea was to learn how the Finch responds to commands and how I can make it do interesting things like turning randomly, changing colors, and playing music.
### What Problem Does it Solve?
This project doesn’t aim to solve a specific problem, but it serves as a learning tool for me. By working with the Finch robot, I was able to practice controlling its motors, lights, and sounds. It helped me get familiar with how the robot works and how I can program it to do different things, setting a foundation for future projects where I might want the Finch to interact with the environment in more complex ways.




