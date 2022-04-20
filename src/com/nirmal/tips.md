## All Program solutions in Brief
- [x] [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/) ➡ [Reference](https://www.youtube.com/watch?v=f_F9ItFyiEg)
  * create num array and add all numbers respective to roman string to it(add 10 for X)
  * Create String array and all roman strings . Note both int arrat and string array should be in descending order
  * iterate through num array and  in while loop check if input number >= numArray[i] then add stringArrat[i] to stringbuilder 
  * and make num=num-numArray[i]
  
- [x] [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/) ➡ [Reference](https://www.youtube.com/watch?v=dlATMslQ6Uc)
  * create a map <Character,Integer> and put all roman char and respective numbers as value.
  * iterate the input strings from last char and check id number for charAt(i) > number for charAt(i+1)
  * then subtract  charAt(i) number from result else add charAt(i) + result number

- [x] [99.RecoverBinarySearchTree](https://leetcode.com/problems/recover-binary-search-tree/) ➡ [Reference](https://www.youtube.com/watch?v=ZWGW7FminDM)
    * four variables prev=Integer.MIN_VALUE,first=middle=last=null
    * if adjacent node then fist and middle , if distance node then first and last
    * Do inorder ,while doing find if current is smaller than prev
    * if yes- then store in first=prev and middle=current and cont. 
    * again if current<prev then last=current
    * then at the end swap first and last OR first and middle

- [x] [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) ➡ [Reference](https://www.youtube.com/watch?v=-1jxt_DPl48)
  * its a game of max heap,add all stones maxheap(in java new PriorityQueue<>(Comparator.reverseOrder()))
  * Run a while loop till heap size>1 , fetch top two weights and if both weight are not equal then add difference to heap
  * if heap.isEmpty() return 0 , else return heap.remove()

