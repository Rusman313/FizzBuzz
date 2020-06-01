# **TESTING DAY 1**

-  Open up VS Code, press ctrl shift p, settings.json. download link and move to same place as java folder... add snipit to Json File. 
- https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.6.2/junit-platform-console-standalone-1.6.2.jar

```
"java.project.referencedLibraries": [
    "lib/**/*.jar",
    "C:\\Program Files\\Java\\junit-platform-console-standalone-1.6.2.jar"
  ]
```

The jar file that was just downloaded is a java library -   we're essentially loading in our own library so that we can run imports etc. 

What is TDD?

	-  writing texts for ourself before you actually write any code
	-  approach of programming which gives instructiosn to developers to write new code only when a test has failed

Why TDD?

- avoid duplication of code
- makes our code clearer, simpler, and bug-free

TDD Process (simplified)

1. Write unit test for one small step of functionality
2. Run that test - it obviously fails because we haven't written the code to add that functionality yet!
3. Write the minimum amount of code needed for that test to pass
4. run the test -  did it pass?
5. Passed( Great! Go Back to step 1) || Failed(Refactor your code from step 3)

Trying it out -  make a folder for today, and inside of that a HelloWorld.java, and a HelloWorldTest.java -  
In HelloWorld Test we are going to add @Test -  which should automatically import  org.junit.test;

```java
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetMessage(){
        HelloWorld hw = newHelloWorld();
        //assertion  - making sure our expected behavior matches the actual behavior
        // First param - expected behavior, Second param  - actual behavior
        assertEquals("Hello, World!", hw.getmessage());
    }
}
```

The test will fail when run. 

Once we go back and create the methods in HelloWorld.js

```java
public class HelloWorld {
    public String getMessage(){
        return "Hello, World!";
    }
    
}
```

Define Refactor: "to change a section of code with out changing its actual functionality" - restructuring an existing body of code

Second Test 

```java
 @Test
    public void testGetMessageWithName(){
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Rafeena!", hw.getMessage("Rafeena"));
    }
```

###Levels of TDD

1. Aceceptance TDD (ATDD)
   - Used to  be called Bahavioral Driven Development (BDD)
   - Write a single test that tests the end goal of your program 
2. Developer TDD (TDD)
   - Write a single unit test for every step of the process adding functionality to our program 





Fizz BUZZ
This is a super classic developer interview problem/;question/test/etc.

- if divisible by 3, instead of returning number, return "FIZZ"
- if divisible by 5, instead of returning number return "BUZZ"
- if divisible by 3 and 5 (15), instead of returning number, return "FIZZ BUZZ"

Input [1,2,3,5,....]
Expected Output [1,2, fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, ......]

TDD Requirements:

-  don't write any production code without a failing test first
- make each step as small and simple as possible
- commit immediately when our test passes