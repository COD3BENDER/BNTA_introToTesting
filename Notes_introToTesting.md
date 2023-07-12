# Notes - IntroToTesting

**Methods:**

When you create methods try to make sure it does 1 thing at a time and if you need to do 2 things try not to do it in 1 method. split it up into 2 as you can use them for code reuse.

**Testing:**

**Manual Testing** —> When you write your code and manually check if the end result is what you want it to be for example logging to console.

*constraints:*

- This is valid, but time consuming
- We would have to run all tests from the past too as its not automated, you will have so many tests

**Automated Tests** —> They are not written by the computer but you write code that will take the output of a previous written code and compare it to what it should be.

steps:

- Write Code
- Gather the output from code
- Compare results
- If all goods no problem
- If problems then give error message

**Unit test** —> tests the smallest possible unit of code.

Aggregation test —>

Integration test —>

**Coverage** —>  how many lines of your code is covered by tests. you should aim for 100% companies usually have threshold.

The context is to use other code:

Package management —> 

Testing Library —> 

**IntroToTesting (JUnitTesting):**

pom.xml —> create <dependencies> tag and add in the <dependency>

In maven you have two packages —> a main package and test package. You create test files in the test package.

You use annotations (@Test) to mark a test method for JUnitTesting

For testing you dont need a main method unless you want to write something that can be interacted with.

assertion —> is A the same as B (used a lot in manual testing).

BDD —> **Behaviour Driven Development**

as we develop our code we will see the behaviour of what we are testing.

- Given ..
- When ..
- Then ..

If your testing a class the convention is to name it as ClassNameTest

**Every test method is a void method**

The name of the test should represent what it does.

Dont run individual tests one by one when you have multiple tests in the same class run them all in one go.

A good test runs in isolation. Should be independent and not depend on the passing/conditions of previous tests.

create a setUp() method with the (@BeforeEach) annotation to create any objects that needs to be reset before every test

TDD —> **Test Driven Development**

- Writing tests first
- Then write code to pass the test

FizzBuzz Problem:

- Any number divisible by 3 should give back fizz
- Any number divisible by 5 should give back buzz
- Any number divisible by both should give back fizzbuzz
- Any number not divisible by either should give back the number itself