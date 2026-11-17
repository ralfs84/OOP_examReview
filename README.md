# OOP Coding Test — Review and Reflection
## 1. My Original Examination Grade

### Task 1 — /40
**My mark:** \
10 + 10 + 10 +10 - 10 = 30/40

**Why I awarded this mark:**\
task 1.1 was implemented fully as there was a class created with a private string , private int and
private hashset.\
task 2.2 was implemented fully as there was a constructor that initialized name and capacity.  
task 2.3 was implemented fully as main contained scanner sc that read user inputs for workshop
name,capacity and there contained a workshop object named 'workshop'. \
deducted marks due to final code not compiling.
### Task 2 — /40
**My mark:** \
8 + 10 + 5 + 10 - 5 = 28/40

**Why I awarded this mark:** \
Task 2.1 was mostly implemented but had a small bug (counter set to 0 not 1 or the while loop 
being '<=' instead of '<') which caused an extra attempt than expected.\
2.2 was implemented correctly so awarded full marks.\
Task 2.3 was partly implemented but had a similar bug to task 2.1 and another bug due to not using else ifs,
this caused IDs to be registered regardless if the workshop is full. \
task 2.4 was implemented correctly.

### Task 3 — /20
**My mark:**\
5 + 0 + 0 + 2 = 7/20

**Why I awarded this mark:** \
Task 3.1 was fully implemented as all registered students are displayed after registration loop.\
Tasks 3.2 and 3.3 were not attempted so awarded no marks.\
Task 3.4 was had a relevant attempt as there contained a check for blank IDs in addStudentID()
but scanner would not accept a blank input and did not count towards attempts and would have
been added to hashset regardless due to not using an if else statement in the check.

**Total self-assessed grade:** 65/100

## 2. Corrections and Improvements

Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now. 

One problem I identified in my original code was using multiple if statements  in the
method AddStudentID in the Workshop class, this caused an issue where IDs were added to
the hash set regardless of the top 2 if statement. I changed two if statements to if else 
statements, this works as the else is applied to all 3 checks not just the last one.

Another problem I identified was not being able to enter a blank inputs into the terminal. I solved
this by using 'sc.nextline' instead of 'sc.next'. This created a bug which caused an empty input 
to be entered before the user was prompted to enter an ID, I resolved this by consuming the remaining 
newline after prompting for an int input by using sc.nextLine() after sc.nextInt().

## 3. Reflection

**What did you understand during the examination
but struggle to implement?** 

I understood how to show the total accepted and rejected registrations attempts and the remaining  workshop places but 
struggled to implement due to spending too much time on implementing the hashset.

**What was the most important thing you learned
from correcting your code?** 

By correcting my code I learnt how to better approach coding problems.

**What would you do differently in your next
coding test?** \
In my next coding test I would read over the test questions multiple times as tasks 3.2 and 3.3 would have
been worth the attempt to implement. Also, I would have not attempted to make big changes in the last 5 to 10 minutes as it caused to me to run out
of time and go from code that compiles to code that does not.

---

## Review lab assessment and mark recovery

The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.

