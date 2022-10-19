
# Data Structure

Data Structure is a way to organized data in such a way that it can be used efficiently. Following terms are foundation terms of a data
structure.

• Interface − Each data strucure has an interface. Interface represents the set of operations that a datastructure supports.An interface
only provides the list of supported operations, type of parameters they can accept and return type of these operations.

• Implementation − Implementation provides the internal representation of a data structure. Implementation also provides the defination
of the alogrithms used in the opreations of the data structure


## Characteristics of a Data Structure
• Correctness − Data Structure implementation should implement its interface correctly.

• Time Complexity − Running time or execution time of operations of data structure must be as small as possible.

• Space Complexity − Memory usage of a data structure operation should be as little as possible

## Need for Data Structure
As applications are getting complex and data rich, there are three common problems applications face now-a-days.

• Data Search − Consider an inventory of 1 million(106
) items of a store. If application is to search an item. It has to search item in 1
million(106
) items every time slowing down the search. As data grows, search will become slower.

• Processor speed − Processor speed although being very high, falls limited if data grows to billon records.

• Multiple requests − As thousands of users can search data simultaneously on a web server,even very fast server fails while
searching the data.
To solve above problems, data structures come to rescue. Data can be organized in a data structure in such a way that all items may not be
required to be search and required data can be searched almost instantly

## Execution Time Cases
There are three cases which are usual used to compare various data structure's execution time in relative manner.

• Worst Case − This is the scenario where a particular data structure operation takes maximum time it can take. If a operation's worst
case time is ƒ(n) then this operation will not take time more than ƒ(n) time where ƒ(n) represents function of n.

• Average Case − This is the scenario depicting the average execution time of an operation of a data structure. If a operation takes ƒ(n)
time in execution then m operations will take mƒ(n) time.

• Best Case − This is the scenario depicting the least possible execution time of an operation of a data structure. If a operation takes
ƒ(n) time in execution then actual operation may take time as random number which would be maximum as ƒ(n).

## Local Environment Setup
If you are still willing to setup your environment for Java programming language, then this section guides you on how to download and set up
Java on your machine. Please follow the following steps to set up the environment.

Java SE is freely available from the link Download Java. So you download a version based on your operating system.

Follow the instructions to download java and run the .exe to install Java on your machine. Once you installed Java on your machine, you
would need to set environment variables to point to correct installation directories:

### Setting up the path for windows 2000/XP
Assuming you have installed Java in c:\Program Files\java\jdk directory:

• Right-click on 'My Computer' and select 'Properties'.

• Click on the 'Environment variables' button under the 'Advanced' tab.

• Now alter the 'Path' variable so that it also contains the path to the Java executable. Example, if the path is currently set to
'C:\WINDOWS\SYSTEM32', then change your path to read 'C:\WINDOWS\SYSTEM32;c:\Program Files\java\jdk\bin'.

#### Setting up the path for windows 95/98/ME
Assuming you have installed Java in c:\Program Files\java\jdk directory −

Edit the 'C:\autoexec.bat' file and add the following line at the end:
'SET PATH=%PATH%;C:\Program Files\java\jdk\bin'

#### Setting up the path for Linux, UNIX, Solaris, FreeBSD:
Environment variable PATH should be set to point to where the java binaries have been installed. Refer to your shell documentation if you
have trouble doing this.

Example, if you use bash as your shell, then you would add the following line to the end of your '.bashrc: export PATH=/path/to/java:$PATH'

#### Popular Java Editors
To write your java programs you will need a text editor. There are even more sophisticated IDE available in the market. But for now, you can
consider one of the following:

• Notepad − On Windows machine you can use any simple text editor like Notepad (Recommended for this tutorial), TextPad.

• Netbeans −is a Java IDE that is open source and free which can be downloaded from https://www.netbeans.org/index.html.

• Eclipse − is also a java IDE developed by the eclipse open source community and can be downloaded from https://www.eclipse.org/.


#### What is Next ?

Next chapter will teach you how to write and run your first java program and some of the important basic syntaxes in java needed for
developing applications


#### Algorithm concept
Algorithm is a step by step procedure, which defines a set of instructions to be executed in certain order to get the desired output. In term of
data structures, following are the categories of algorithms.

• __Search__ − Algorithms to search an item in a datastrucure.

• __Sort__ − Algorithms to sort items in certain order

• __Insert__ − Algorithm to insert item in a datastructure

• __Update__ − Algorithm to update an existing item in a data structure

• __Delete__ − Algorithm to delete an existing item from a data structure


### Algorithm analysis
Algorithm analysis deals with the execution time or running time of various operations of a data structure. Running time of an operation can
be defined as no. of computer instructions executed per operation. As exact running time of any operation varies from one computer to
another computer, we usually analyze the running time of any operation as some function of n, where n is the no. of items processed in that
operation in a datastructure.

### Asymptotic analysis

Asymptotic analysis refers to computing the running time of any operation in mathematical units of computation. For example, running time of
one operation is computed as f(n) and of another operation as g(n2
). Which means first operation running time will increase linearly with the
increase in n and running time of second operation will increase exponentially when n increases. Similarly the running time of both
operations will be nearly same if n is significantly small.


### Asymptotic Notations
Following are commonly used asymptotic notations used in calculating running time complexity of an algorithm.

• Ο Notation

• Ω Notation

• θ Notation

Big Oh Notation, Ο

The Ο(n) is the formal way to express the upper bound of an algorithm's running time. It measures the worst case time complexity or longest amount of
time an algorithm can possibly take to complete. For example, for a function f(n)

Ο(f(n)) = { g(n) : there exists c > 0 and n0 such that g(n) ≤ c.f(n) for all n > n0. }

Big Oh notation is used to simplify functions. For example, we can replace a specific functional equation 7nlogn + n - 1 with Ο(f(nlogn)).
Consider the scenario as follows:

7nlogn +n - 1 ≤ 7nlogn + n  
7nlogn +n - 1 ≤ 7nlogn + nlogn  
for n ≥ 2 so that logn ≥ 1  
7nlogn +n - 1 ≤ 8nlogn  

It demonstrates that f(n) = 7nlogn + n - 1 is within the range of outout of O(nlogn) using constants c = 8 and n0 = 2.

__Omega Notation__, Ω

The Ω(n) is the formal way to express the lower bound of an algorithm's running time. It measures the best case time complexity or best
amount of time an algorithm can possibly take to complete.

For example, for a function f(n)

        Ω(f(n)) ≥ { g(n) : there exists c > 0 and n0 such that g(n) ≤ c.f(n) for all n > n0. }

__Theta Notation__, θ

The θ(n) is the formal way to express both the lower bound and upper bound of an algorithm's running time. It is represented as following.

     θ(f(n)) = { g(n) if and only if g(n) = Ο(f(n)) and g(n) = Ω(f(n)) for all n > n0. }    


# DSA using Java - Data Structures
Data Structure is a way to organized data in such a way that it can be used efficiently. Following terms are basic terms of a data structure

__Data Definition__

Data Definition defines a particular data with following characteristics.
• Atomic − Defition should define a single concept

• Traceable − Definition should be be able to be mapped to some data element.

• Accurate − Definition should be unambiguous.

• Clear and Concise − Definition should be understandable

__Data Object__

Data Object represents an object having a data.

__Data Type__

Data type is way to classify various types of data such as integer, string etc. which determines the values that can be used with the
corresponding type of data, the type of operations that can be performed on the corresponding type of data. Data type of two types −

• _Built-in Data Type_

•_Derived Data Type_

___Built-in Data Type___

Those data types for which a language has built-in support are known as Built-in Data types. For example, most of the languages provides
following built-in data types.

• Integers

• Boolean (true, false)

• Floating (Decimal numbers)

• Character and Strings

___Derived Data Type___

Those data types which are implementation independent as they can be implemented in one or other way are known as derived data types.   
These data types are normally built by combination of primary or built-in data types and associated operations on them. For example −

• List

• Array

• Stack

• Queue


 ## DSA using Java - Arrays

__Array Basics__    
Array is a container which can hold fix number of items and these items should be of same type. Most of the datastructure make use of array
to implement their algorithms. Following are important terms to understand the concepts of Array

____Element____ − Each item stored in an array is called an element.

• ____Index____ − Each location of an element in an array has a numerical index which is used to identify the element.

