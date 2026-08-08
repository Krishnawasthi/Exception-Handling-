<img width="1078" height="426" alt="image" src="https://github.com/user-attachments/assets/bdf45acf-9ee1-4dab-84e2-a152f7043aa3" />

### this is to understand the class cast exception.

<img width="725" height="276" alt="image" src="https://github.com/user-attachments/assets/025a806d-6d38-45d8-abbd-6c15d4a9fd99" />


# Try-With-Resources
### try(auto closable statement)
### {
#####  Business Logic
### }
1. Try-with-resources is a feature used to automatically close resources.

2. It was introduced in Java 7 to simplify resource management.

3. It works with classes that implement the `AutoCloseable` interface.

4. Resources are declared inside the `try` statement.

5. The resource is automatically closed when the `try` block finishes.

6. It also closes the resource when an exception occurs.

7. This helps prevent resource leaks and improves code safety.

8. Multiple resources can be declared in a single `try` statement.

9. Common examples include `BufferedReader`, `FileInputStream`, and JDBC `Connection`.

 <img width="887" height="403" alt="image" src="https://github.com/user-attachments/assets/c4341228-ed3c-4de0-8cac-bea54ba99dc8" />
 
## Only those classes you can use inside try block(...........) which are inherit from Closeable or AutoCloseable.

<img width="927" height="126" alt="image" src="https://github.com/user-attachments/assets/ee596a97-7ba9-4625-ba75-eeb89f27aad6" />

<img width="867" height="105" alt="image" src="https://github.com/user-attachments/assets/89f46db2-8bdf-4ca2-aea8-ee6b323077d1" />

### you can not write inside try block other than closable or Autoclosable
<img width="722" height="100" alt="image" src="https://github.com/user-attachments/assets/4e15d55f-66e1-4f40-acd5-0abc4eac4dd7" />





