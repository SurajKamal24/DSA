# Arrays and Strings

Array questions and string questions are often interchangeable.

- **Hash tables**
    
    A hash table is a data structure, that maps keys to values for highly efficient lookup.
    
- **ArrayList and resizable arrays**
    
    In some languages, arrays are automatically resizable. The array or list will grow as you append items. In other languages, like Java, arrays are fixed length. The size is defined when you create the array. When you need an array like data structure that offers dynamic resizing, you would usually use an ArrayList. An ArrayList is an array that resizes itself as needed.
    
    ```java
    ArrayList<String> merge(String[] words, String[] more){
    	ArrayList<String> sentence = new ArrayList<String>();
    	for(String w : words) sentence.add(w);
      for(String m : words) sentence.add(m);
    	return sentence;
    }
    ```
    
- **StringBuilder**
    
    ```java
    String joinWords(String[] words){
    	String sentence = "";
    	for(String w : words){
    		sentence = sentence + w;
    	}
    	return sentence;
    }
    ```
    
    On each concatenation, a new copy of the string is created, and the two strings are copied over, character by character. The first iteration requires us to copy x characters. The second iteration requires copying 2x characters. The third iteration requires 3x, and so on. The total time therefore is O(x + 2x + … + nx). This reduces to O(xn^2).
    
    StringBuilder can help you avoid this problem. StringBuilder simply creates a reusable array of all the strings. copying them back to a string when necessary.
    
    ```java
    String joinWords(String[] words){
    	StringBuilder sentence = new StringBuilder();
    	for(String w : words){
    		sentence.append(w);
    	}
    	return sentence.toString();
    }
    ```
    
- **Interview questions**
    - **Is unique:** Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
        - **Assumptions**
            
            We will assume for simplicity the character set is ASCII. IF this assumption is not valid, we would need to increase the storage size.
            
        - **Solution 1**
            
            One solution is to create an array of Boolean values, where the flag at index i indicates whether character i in the alphabet is contained in the string. The second time you see this character you can immediately return false. We can also immediately return false if the string length exceeds the number of unique characters in the alphabet. After all, you can’t form a string of 280 unique characters out of a 120-character alphabet.
            
            ```java
            boolean isUniqueChars(String str) {
            	if(str.length() > 128) return false;
            	boolean[] char_set = new boolean[128];
            	for(int i = 0; i < str.lenght(); i++) {
            		int val = str.charAt(i);
            		if(char_set[val]) {
            			return false;
            		}
            		char_set[val] = true;
            	}
            	return true;
            }
            ```
            
        - **Other solutions**
            
            If we can’t use additional data structures, we can do the following
            
            - Compare every character of the string to every other character of the string. This will take O(n^2) time and O(1) space
            - If we are allowed to modify the input string, we could sort the string in O(n log(n)) time and then linearly check the string for neighboring characters that are identical.
    - **Check permutation:** Given two strings, write a method to decide if one is a permutation of the other
        - **Assumptions**
            
            We will assume for this problem that the comparison is case sensitive and whitespace is significant. So “god     ” is different from “dog”.
            
        - **Solution 1**
            
            If two strings are permutations, then we know that they have the same characters, but in different orders. Therefore, sorting the strings will put the characters from two permutations in the same order. We just need to compare the sorted versions of the strings.
            
            ```java
            String sort(String s) {
            	char[] content = s.toCharArray();
            	java.util.Arrays.sort(content);
            	return new String(content);
            }
            boolean permutation(String s, String t) {
            	if (s.length() != t.length()) {
            		return false;
            	}
            	return sort(s).equals(sort(t));
            }
            ```
            
        - **Solution 2**
            
            We can also use the definition of a permutation - two words with the same character counts - to implement this algorithm. We simply iterate through this code, counting how many times each character appears. The afterwards, we compare the two arrays.
            
            ```java
            boolean permutation(String s, String t) {
            	if(s.length() != t.length()) {
            		return false;
            	}
            	int[] letters = new int[128];
            	char[] s_array = s.toCharArray();
            	for(char c : s_array) {
            		letters[c]++;
            	}
            	for(int i = 0; i < t.lenght(); i++) {
            		int c = (int) t.charAt(i);
            		letters[c]--;
            		if(letters[c]<0) {
            			return false;
            		}
            	}
            	return true;
            }
            ```
            
    - **URLify:** Write a method to replace all spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the “true” length of the string.
        - **Solution**
            
            A common approach in string manipulation problems is to edit the string starting from the end and working backwards. This is useful because we have an extra buffer at the end, which will allow us to change characters without worrying about what we’re overwriting. We will use this approach in this problem. The algorithm employs a two-scan approach. In the first scan , we count the number of spaces. By tripling this number, we can compute how many extra characters we will have in the final string. In the second pass, which is done in reverse order, we actually edit the string. When we see a space, we replace it with %20. If there is no space, then we copy the original character.
            
            ```java
            void replaceSpaces(char[] str, int trueLenght) {
            	int spaceCount = 0, index, i = 0;
            	for (i = 0; i < trueLength; i++) {
            		if (str[i] == ' ') {
            			spaceCount++;
            		}
            	}
            	index = trueLength + spaceCount * 2;
            	if (trueLength < str.length()) str[trueLenght] = '\0';
            	for (i = trueLength - 1; i >= 0; i--) {
            		if (str[i] == ' ') {
            			str[index - 1] = '0';
            			str[index - 2] = '2';
            			str[index - 3] = '%';
            			index = index - 3;
            		}
            		else {
            			str[index] = str[i];
            			index--;
            		}
            	}
            }
            ```
            
    - **Palindrome permutation:**
        
        
    - **String rotation:**