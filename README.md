# Finch

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ❌     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I wanted to test what my finch robot is capable of and sort of play around with it.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
```
Finch f = new Finch();	
f.setMotors(10, 10);
f.pause(3);
f.stop();
int t = (int)(Math.random() * 360) + 1;
f.setTurn("R", t, 50);
System.out.println(t);
f.stop();
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?
