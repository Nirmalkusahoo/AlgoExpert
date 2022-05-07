## All Program solutions in Brief

- [x] [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)
  ➡ [Reference](https://www.youtube.com/watch?v=f_F9ItFyiEg)
    * create num array and add all numbers respective to roman string to it(add 10 for X) in ascending order
    * Create String array and all roman strings . Note both int array and string array should be in descending order
    * iterate through num array and in while loop check if input number >= numArray[i] then add stringArray[i] to
      stringBuilder
    * and make num=num-numArray[i]

- [x] [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
  ➡ [Reference](https://www.youtube.com/watch?v=dlATMslQ6Uc)
    * create a map <Character,Integer> and put all roman char and respective numbers as value.
    * iterate the input strings from last char and check id number for charAt(i) < number for charAt(i+1)
    * then subtract charAt(i) number from result else add charAt(i) + result number


- [x] [135. Candy](https://leetcode.com/problems/candy/)
  ➡ [Reference](https://www.algoexpert.io/questions/Min%20Rewards)
    * Same as [Algo expert - Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)


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

- [x] [Zigzag Traverse](https://www.algoexpert.io/questions/Zigzag%20Traverse)
    * first find the row and col value at which direction is changing
    * while(row and col values are in boundry)
    * while going up col==0 || row==maxRow; again if(row==maxRow) col++ else row++;
    * while goingDown row==0 || col=== maxCol ; again if(col==maxCol) row++ else col++
    * Also you need boolean isGoingDown=true and need to update

- [x] [Smallest Difference](https://www.algoexpert.io/questions/Smallest%20Difference)
    * it can be solved by sorting two array and having two pointer for two array and increase pointer for smallest array
      element
    * Post sorting run while loop till pointer1<arrOne.length && pointer2<arrTwo.length
    * firstNum = arrOne[pointer1]  ,secondNum=arrTwo[pointer2]  whichever array element is smaller increase its pointer.
    * if currentDiff<diff then diff=currentDiff and int[] pair={firstNum, secondNum}

- [x] [Move Element To End](https://www.algoexpert.io/questions/Move%20Element%20To%20End)
    * Can be done with two pointer L ,R while(L<R);
    * in nested while(L<R && array.get(R) == elementToBeMoved) R--;
    * then if(array.get(L) == toMove) swap (L,R) and L++;

- [x] [Monotonic Array](https://www.algoexpert.io/questions/Monotonic%20Array)
    * With two boolean variable isIncreasingOrder=true , isInDecreasingOrder=true it can be done
    * Either arr[i]< arr[i+1] always(then isInDecreasingOrder=false;) OR arr[i]> arr[i+1] always (then
      isIncreasingOrder=false)
    * and return isIncreasingOrder || isInDecreasingOrder;
  

  
