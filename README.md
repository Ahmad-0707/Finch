# Finch
---
## Devlopment Checklist


## Design Cycle
The design cycle helped me break the project into manageable steps. First, I explored the Finch robot to understand its sensors, movement, and lights. Then, I designed the robot’s behavior, planning for it to move randomly, make sounds, and change colors. I built and tested the program, making adjustments as I went to fix issues and improve the interaction. Finally, I evaluated the robot’s performance, refining it based on feedback. This process allowed me to develop and improve the project step by step, ensuring the robot was engaging and fun to interact with.



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
bird.disconnect();

```

---

## Questions
### What Did You Learn?
I learned a lot through this project:Movement Control: I learned how to make the Finch move forward, backward, and turn by random angles. I also understood how to adjust its speed and make it stop.LED Control: I learned how to change the colors of the Finch’s beak and tail to give it visual feedback. For example, I made it show different colors during movement.Sound Feedback: I figured out how to make the Finch play sounds at certain points in the program, giving it a more interactive and fun feel.Randomness: I learned how to use random values to make the Finch turn at random angles and behave unpredictably, which makes the program feel more dynamic.




