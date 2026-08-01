# Exception-Handling 


Exception Handling is a mechanism in Java used to handle runtime errors without stopping the normal execution of a program. It improves the reliability and stability of applications by allowing developers to manage unexpected situations gracefully. Java provides keywords such as `try`, `catch`, `finally`, `throw`, and `throws` to implement exception handling. Proper exception handling makes code more robust, readable, and easier to maintain.
### exception is nothing. It's an abnormal situation occurred during your program.
__________________________________________________________________________________________________________________________________________________________________
### we as a developer need to make sure that there will not be any
### Abnormal situation. If abnormal situation comes, we need to handle those situations.
### We cannot avoid, but we will have the… handling mechanism.

### exception is nothing. Abnormal situation came during program execution, Java will create a particular exception object, And it will Pass to the caller. Here, who is the caller? --> JVM only, main thread, it will give to main thread only.

<img width="1640" height="740" alt="image" src="https://github.com/user-attachments/assets/6914c937-af92-40c3-be77-859fe87cb368" />


### 1.all are the exception classes developed by Sun Microsystem or Oracle.
### 2.They have already provided the… because ultimately, it need to create object and throw.

# Try-Catch Block in Java

## 📖 Introduction
A **try-catch block** is used to handle exceptions in Java. It prevents the program from terminating unexpectedly when an error occurs during execution.

## 📌 Syntax

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}


## ✅ Why Use Try-Catch?

- Prevents program crashes.
- Handles runtime exceptions gracefully.
- Allows the program to continue execution.
- Improves application reliability.

## 💻 Example

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
```

### Output

```
Cannot divide by zero.
```

## 🎯 Key Points

- The `try` block contains code that may throw an exception.
- The `catch` block handles the exception if it occurs.
- Multiple `catch` blocks can be used for different exception types.
- If no exception occurs, the `catch` block is skipped.

---

**Happy Coding! 🚀**

### // we will put the expected exception problem in try and block and throws it via catch block so there will be no abnormal termination
<img width="1822" height="481" alt="image" src="https://github.com/user-attachments/assets/6587d321-379a-4013-b0e5-e5498599d923" />

