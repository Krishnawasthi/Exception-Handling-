<img width="606" height="320" alt="image" src="https://github.com/user-attachments/assets/ee1fd5a9-8e74-445e-a78e-8b5145b24f22" />


<img width="560" height="304" alt="image" src="https://github.com/user-attachments/assets/51fa91de-ad20-4f22-a14c-8ad42ce9949a" />


# Throw and Throws in Java

`throw` and `throws` are two important keywords in **Java Exception Handling**. While they have similar names, they serve different purposes.

---

# What is `throw`?

The `throw` keyword is used to **explicitly throw an exception** from a method, constructor, or block of code.

## Syntax

```java
throw new ExceptionType("Exception Message");
```

## Features

- Used to throw an exception manually.
- Followed by an exception object.
- Throws only one exception at a time.
- Can throw both checked and unchecked exceptions.
- Execution stops immediately after the exception is thrown.

## Example

```java
public class ThrowExample {

    public static void main(String[] args) {

        int age = 16;

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote.");
        }

        System.out.println("Eligible to vote.");
    }
}
```

### Output

```
Exception in thread "main" java.lang.ArithmeticException: You are not eligible to vote.
```

---

# What is `throws`?

The `throws` keyword is used in a **method declaration** to specify that the method may throw one or more exceptions.

It passes the responsibility of handling the exception to the calling method.

## Syntax

```java
returnType methodName() throws ExceptionType {
    // code
}
```

## Features

- Used in method declarations.
- Can declare multiple exceptions.
- Mainly used with checked exceptions.
- Does not throw an exception itself.
- Informs the caller about possible exceptions.

## Example

```java
import java.io.IOException;

public class ThrowsExample {

    static void readFile() throws IOException {
        throw new IOException("File not found.");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Output

```
File not found.
```

---

# Difference Between `throw` and `throws`

| Feature | `throw` | `throws` |
|----------|---------|----------|
| Purpose | Explicitly throws an exception | Declares possible exceptions |
| Used In | Method body | Method declaration |
| Followed By | Exception object | Exception class names |
| Number of Exceptions | One | One or more |
| Responsibility | Throws the exception | Passes responsibility to caller |
| Mainly Used For | Checked & Unchecked Exceptions | Mostly Checked Exceptions |

---

# Using `throw` and `throws` Together

```java
import java.io.IOException;

public class Demo {

    static void validateAge(int age) throws IOException {

        if (age < 18) {
            throw new IOException("Age must be 18 or above.");
        }

        System.out.println("Validation Successful.");
    }

    public static void main(String[] args) {

        try {
            validateAge(15);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Output

```
Age must be 18 or above.
```

---

# When to Use `throw`

Use `throw` when you want to:

- Validate user input.
- Throw custom exceptions.
- Stop program execution when invalid data is found.
- Enforce business rules.

### Example

```java
if (quantity <= 0) {
    throw new IllegalArgumentException("Quantity must be greater than zero.");
}
```

---

# When to Use `throws`

Use `throws` when:

- Performing file operations.
- Working with databases.
- Using networking APIs.
- A method cannot handle the exception itself and wants the caller to handle it.

### Example

```java
public void saveFile() throws IOException {
    // File handling code
}
```

---

# Interview Questions

### Can we use `throw` without `throws`?

Yes. If you're throwing an unchecked exception (`RuntimeException` and its subclasses), `throws` is optional.

Example:

```java
throw new IllegalArgumentException("Invalid Input");
```

---

### Can `throws` throw an exception?

No.

It only declares that a method **may throw** an exception.

---

### Can `throws` declare multiple exceptions?

Yes.

```java
public void process() throws IOException, SQLException {
    // code
}
```

---

### Can we throw custom exceptions?

Yes.

```java
throw new InvalidAgeException("Age is not valid.");
```

---

# Summary

- **`throw`** is used to explicitly throw an exception.
- **`throws`** is used to declare exceptions that a method may throw.
- `throw` is written inside the method body.
- `throws` is written in the method signature.
- `throw` creates and throws an exception object.
- `throws` delegates exception handling responsibility to the caller.
- Both keywords are commonly used together in Java exception handling.

---

## Author

**Krishna Mohan Awasthi**

Learning Java one concept at a time 🚀

