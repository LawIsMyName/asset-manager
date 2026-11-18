# Abstract Classes and the Cash Class

## What went wrong with Cash?
When I created the Cash class and extended Asset, Java required me to implement the abstract getValue() method. This happened because Cash was a concrete class, and all concrete subclasses must implement inherited abstract methods.

## What were my options?
could make Cash an abstract class, which would mean I couldn't create Cash objects directly. My other option was to override getValue() and give Cash its own implementation.

## Which option did I choose and why?
I chose to override getValue() because I wanted to create Cash objects in my program. Since cash doesn't depreciate like a vehicle, I made the method return its original value. This keeps the value of Cash the same over time.