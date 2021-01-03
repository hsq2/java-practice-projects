# 0. Max Heap

We've briefly covered the heap data structure in the Intro to Programming course. Heaps can be [implemented as an array](https://en.wikipedia.org/wiki/Binary_heap#Heap_implementation). Create a maven project using the command below:

`mvn archetype:generate -DarchetypeGroupId=com.thg.java -DarchetypeArtifactId=template-project`

Then define a class, `MaxHeapChecker` with a single non-static method `public boolean isMaxHeap(int[] heap)`. Write tests to capture correct behaviour of this method, then implement the method and see the tests pass.


# 1. Priority Queues

Inside the same maven project (or a new one if you prefer), define a Student POJO class with the following fields (and associated getters, but no setters):

* Name
* ID
* GPA

Read the documentation for [PriorityQueue](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/PriorityQueue.html). 

Define a class, `StudentRepo` with a constructor that takes a `List` of `Student`s and has the following two public methods

* `getStudentNamePriorityQueue()` -- this should return a new `PriorityQueue` where the order is name, ascending
* `getStudentGPAPriorityQueue()` -- this should return a new `PriorityQueue` where the order is GPA, descending

Ensure you have written tests for this class.

# 2. Special Offers

Copy the files in the `specialOffers` folder into a maven project (a new one or the one above). 

For each of the following special offer types, implement an appropriate `SpecialOfferTrigger`, `SpecialOfferAction` and `SpecialOffer` class, writing a test for each.
 
* A percentage discount
* A fixed discount

Implement `getTotalGBP()` in `Basket` and write a test for it. Make sure Basket doesn't let the total go below zero.

## Do not use `instanceof` at any stage in this exercise (or any other time)!


# Optional
* Consider how the order of application of special offers matters. Propose a design for how the order might be determined.
* Consider how `Basket` might handle special offers that did apply when the offer was intially added, but at a later date, do not apply.
* See inside the `test_demo` folder. There is a failing test. Understand why it's failing and implement the fix.

