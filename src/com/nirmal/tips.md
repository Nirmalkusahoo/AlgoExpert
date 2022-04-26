## All Program solutions in Brief

- [x] [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)
  ➡ [Reference](https://www.youtube.com/watch?v=f_F9ItFyiEg)
    * create num array and add all numbers respective to roman string to it(add 10 for X)
    * Create String array and all roman strings . Note both int arrat and string array should be in descending order
    * iterate through num array and in while loop check if input number >= numArray[i] then add stringArray[i] to
      stringBuilder
    * and make num=num-numArray[i]

- [x] [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
  ➡ [Reference](https://www.youtube.com/watch?v=dlATMslQ6Uc)
    * create a map <Character,Integer> and put all roman char and respective numbers as value.
    * iterate the input strings from last char and check id number for charAt(i) < number for charAt(i+1)
    * then subtract charAt(i) number from result else add charAt(i) + result number

- [x] [99.RecoverBinarySearchTree](https://leetcode.com/problems/recover-binary-search-tree/)
  ➡ [Reference](https://www.youtube.com/watch?v=ZWGW7FminDM)
    * four variables prev=Integer.MIN_VALUE,first=middle=last=null
    * if adjacent node then fist and middle , if distance node then first and last
    * Do inorder ,while doing find if current is smaller than prev
    * if yes- then store in first=prev and middle=current and cont.
    * again if current<prev then last=current
    * then at the end swap first and last OR first and middle
- [x] [135. Candy](https://leetcode.com/problems/candy/)
  ➡ [Reference](https://www.algoexpert.io/questions/Min%20Rewards)
    * Same as [Algo expert - Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)


- [x] [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * two solution are there 1. using stack with O(M+N) space , 2.using while loop with O(1)
    * iterate over string ->toCharArray() -> if !='#' insert into stack else stack.pop()
    * at the end compare two stacks ->if equals return true;
    * In Second approach create two pointers from end of strings and check

- [x] [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)
  ➡ [Reference](https://www.youtube.com/watch?v=-1jxt_DPl48)
    * its a game of max heap,add all stones maxheap(in java new PriorityQueue<>(Comparator.reverseOrder()))
    * Run a while loop till heap size>1 , fetch top two weights and if both weight are not equal then add difference to
      heap
    * if heap.isEmpty() return 0 , else return heap.remove()

- [x] [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * Same as [Algo expert - Validate Subsequence](https://www.algoexpert.io/questions/Validate%20Subsequence)
    * in while  (sequenceIdx<sequence.size() && arrIdx < array.size()
    * if (sequence.get(seqIdx) == array.get(arrIdx)) then seqIdx++
    * arrIdx++; at the end return seqIdx==sequence.size();

- [x] [792. Number of Matching Subsequences](https://leetcode.com/problems/number-of-matching-subsequences/)
    * to params given 1. String[] words and 2. String match
    * for(String word:words) check if word.IsSubsequecne.OF(match) the count ++
    * to check word is subsequence of match for(char c:word.toCharArray) int index= match.indexOf(c);
    * if(index==-1) return false else index= index+1; and at the end return true

- [x] [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * Same as [Algo expert - Sorted Squared Array](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * tricky parts is when array is [-9,2,4,6]. so two with pointers it can be solved. int
      smallerIdx=0,largerIdx=length-1
    * for(int i=length-1;i>=0;i--) if(valueAtSIndex > valueAtLIndex) then result[i]=valueAtSIndex * valueAtSIndex ;
      smallerIdx++
    * else arr[i]=valueAtLIndex * valueAtLIndex; largerIdx--;

- [x] [845. Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Longest%20Peak)
    * Same as [Algo expert - Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)

### AlgoExpert

- #### Array
- [x] [Longest Range](https://www.algoexpert.io/questions/Largest%20Range)
    * Create a map and store all number with boolean true map.put(num,true)
    * Iterate through num array and check if num is not visited then assign currentLength=1
    * then left=num-1 and right=num+1
    * in while loop check if left is present in map then currentLength++; map.put(left,false); left-- and do same for
      right
    * update the if currentLength> largest then update int[] bestRange={left+1 , right-1}

- [x] [Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)
    * create rewards array with value 1 in all. Array.fill(rewards,1).
    * in for (int i=1;i<len-1;i++) if(arr[i]>arr[i-1]) then rewards[i]=rewards[i-1]+1
    * in second for loop need to iterate in reverse
    * for(int i=len-2;i>=0;i--) if(arr[i]>arr[i+1]) rewards[i]= Math.max(arr[i],arr[i+1]+1)
    * and next return sum of rewards array

- [x] [Non-Constructible Change](https://www.algoexpert.io/questions/Non-Constructible%20Change)
    * Sort coin array. int totalChangeCreated=0
    * for(int coin:coins) if(coin>totalChangeCrated +1) then return totalChangeCreated +1
    * else totalChangeCreated=totalChangeCreated+coin;

- [x] [Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)
    * i=1; while(i<arr.length-1) if(array[i - 1] < array[i] && array[i] > array[i + 1]) booelan isPeak=true;
    * if(!isPeak)= i++ ;continue
    * left=i-2; right=i+2; while(left >= 0 && array[left] < array[left + 1)   left=left-1; similarly for while( right <
      array.length && array[right - 1] < array[right])
    * int currenLength=right-left-1 and compare with maxLength and store. new i=right and after intital while loop
      return maxLength;

- [x] [Merge Overlapping Intervals](https://www.algoexpert.io/questions/Merge%20Overlapping%20Intervals)
    * create List<int[]> merged; int[]currentInterval=intervals[0]; merged.add(currentInterval)
    * iterate in intervals ; for(int[] nextInterval:intervals) if(currentEnd>nextStart) then currentEnd=Math.max(
      currentEnd,nextEnd)
    * else merged.add(nextInterval); currentInterval=nextInterval;

    - [x] [Four Number Sum](https://www.algoexpert.io/questions/Four%20Number%20Sum)
        * create Map<Integer,List<Integer[]> and List<Integer[]> fourNumberSum
        * two for loop inside one for parent for loop
      ```
      for (int i = 1; i < array.length - 1; i++) {
              for (int j = i+1; j < array.length; j++) {
                  int currentSum = array[i] + array[j]; int diff = targetSum - currentSum;
                  if (allPairSum.containsKey(diff)) {
                      for (Integer[] pair : allPairSum.get(diff)) {
                          Integer[] fourSum = {pair[0], pair[1], array[i], array[j]}; fourSumList.add(fourSum);
              } }}
  
              for (int k = 0; k < i; k++) {
                  int currentSum = array[i] + array[k]; Integer[] pair = {array[i], array[k]};
                  if (!allPairSum.containsKey(currentSum)) {
                      List<Integer[]> pairGroup = new ArrayList<>(); pairGroup.add(pair); allPairSum.put(currentSum, pairGroup);
                  } else  { allPairSum.get(currentSum).add(pair) };
              }
          }
   
