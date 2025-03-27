# Class Loading in JVM

Class loading is the process by which the JVM loads classes into memory. Here's how it works:

## 1. **Classloaders**
   - The JVM uses classloaders to dynamically load classes. There are three primary types:
     - **Bootstrap Classloader**: Loads essential Java core libraries.
     - **Extension Classloader**: Loads classes from the extension directory.
     - **System/Application Classloader**: Loads classes from the application's classpath.

## 2. **Class Loading Process**
   - **Loading**: The class is located by the classloader and loaded into memory.
   - **Linking**: The class is checked for dependencies, and those dependencies are resolved.
   - **Initialization**: The static variables are initialized when the class is first accessed.

## 3. **Custom Classloaders**
   - Developers can create custom classloaders to load classes from non-standard locations, such as a remote server or from encrypted files.

## Conclusion
   - Understanding the class loading process can help optimize application startup time and memory usage. Custom classloaders can be used in advanced scenarios for enhanced flexibility.
