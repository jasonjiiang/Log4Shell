# Log4Shell
Intentionally vulnerable application that explores the Log4Shell zero-day vulnerability in Log4J, a popular Java logging framework. With this vulnerability known under "remote code execution" (RCE) otherwise known as "arbitrary code execution". This vulnerability is also known as CVE-2021-44228 which was on older versions of Java such as Java 8u202 or earlier.

This vulnerability works through Log4J using the lookup features that allows a perpetrator to use a reverse shell to execute commands remotely, which impacted billions of devices ranging from databases to games like Minecraft and of course Java-based applications.

The primary cause of this vulnerability is using Java 8u202 or earlier that has the Log4J logger with the version as 2.14.1. So, a way to resolve this issue would be to either update the Java version or Log4J. As well as a potential cause such as improper input validation.

