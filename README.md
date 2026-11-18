# Abstract Classes and the Cash Class

## What went wrong with Cash?
When I created the Cash class and extended Asset, Java required me to implement the abstract getValue() method. This happened because Cash was a concrete class, and all concrete subclasses must implement inherited abstract methods.

## What were my options?
could make Cash an abstract class, which would mean I couldn't create Cash objects directly. My other option was to override getValue() and give Cash its own implementation.

## Which option did I choose and why?
I chose to override getValue() because I wanted to create Cash objects in my program. Since cash doesn't depreciate like a vehicle, I made the method return its original value. This keeps the value of Cash the same over time.
# AI prompt used 
**Context:** I am a beginner Java developer learning object-oriented programming, inheritance, abstract classes, and BigDecimal. I am building an Asset Manager application with an abstract Asset class and a House child class.

**Task:** Review both classes as a senior Java developer. Identify potential bugs, logic problems, readability issues, and opportunities to improve maintainability.

**Constraints:** Do not rewrite my code or provide corrected versions of entire methods. Keep suggestions appropriate for my current Java knowledge. Explain what needs improvement and why, so I can implement the changes myself.

**Format:** For each suggestion, identify the class and method, explain the issue, why it matters, and how to approach fixing it. Prioritize the most important issues. Include two things I did well.