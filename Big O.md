# Big O

Big O is the way of measuring how efficient your code

Time complexity - Not measured in time. It is measured in the number of operations that it takes to complete something

Space complexity - 

What is space complexity is our main priority? 

omega, theta and O

Looping through an array. 

1 2 3 4 5 6 7

Best case - 1 - Omega

Average case - 4 - Theta

Worst case - 7 - O

- One for loop -It had n numbers and took n operations. It’s going to be straigth line (propotional). **O(n)**

```java
public static void printItems(int n) {
	for (int i = 0; i < n; i++) {
		System.out.println(i);
	}
}
```

- Two Indepedent for loops - In case, It had n numbers but took n+n (2n) operations. **O(2n)** after dropping constant **O(n)**

```java
public static void printItems(int n) {
	for (int i = 0; i < n; i++) {
		System.out.println(i);
	}
	for (int j = 0; j < n; j++) {
		System.out.println(j);
	}
}
```

- One for loop inside another for loop - It took n * n (n^2) operations. From time complexity perspective, it is less efficient. **O(n^2)**

```java
public static void printItems(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.println(i + " " +j);
		}
	}
}
```

- Nested for loops and another standalone for loop - Nested for loop ran n * n times. i.e. O(n^2). Independent for loop ran n times. i.e. O(n). O(n^2 + n). n gets larger then n^2 grows much faster than n. n^2 is the dominant term and the n is the non-dominant term. So we just n. Now it becomes . **O(n^2)**

```java
public static void printItems(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.println(i + " " +j);
		}
	}
	for (int k = 0; k < n; k++) {
		System.out.println(k);
	}
}
```

- **O(1)** - Constant time. Flat and Most efficient one. There is only one operation. Earlier as n grows, the number of operations grow. But in the case, as n grows, the number of operations will stay the same.
    
    n + n = O(1)
    
    n + n + n = O(2) → O(1)
    

```java
public static int addItems(int n) {
	return n+n;
}
public static int addItems(int n) {
	return n+n+n;
}
```

- **O(log n) -** Flat and efficient but not as efficient as O(1)

Take a sorted array. Find a particular value in a sorted array. 1 2 3 4 5 6 7 8. Check for 1. Quickest way is to cut the array in half and see if the value is in the first half or the seconf half. Not in second half. So we have to check in the first half. Then repeat the step again. To get 1 it took 3 steps (3 operations). 2^3 = 8 → log 2 8 =3. Take 8 and divide repeatedly by 2 after 3 times, it will become 1. 

- **O(n log n) -** For some sorting algorithms
- Different terms for inputs

**O(a + b)**

```java
public static void printItems(int a, int b) {
	for (int i = 0; i < a; i++) {
		System.out.println(a);
	}
	for (int j = 0; j < b; j++) {
		System.out.println(b);
	}
}
```

**O(a * b)**

```java
public static void printItems(int a, int b) {
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			System.out.println(i + " " + j);
		}
	}
}
```

- **Big O of array lists**

O(1) - Add/remove at the end of the array. No need to reindex

O(n) - Add/remove at the begining of the array. Need to reindex

O(1/2 n) → O(n) because big O measures worst and not average case - Add/remove in the middle of the array. Need to reindex

O(n) - Looking for an item by value

O(1) - Looking for an item by index

O(n^2) - Loop within a loop

O(n) - Propotional

O(log n) - Divide and conquer

O(1) - Constant

[Big-O Algorithm Complexity Cheat Sheet (Know Thy Complexities!) @ericdrowell (bigocheatsheet.com)](https://www.bigocheatsheet.com/)