## All Program solutions in Brief

- [x] [135. Candy](https://leetcode.com/problems/candy/)
  ➡ [Reference](https://www.algoexpert.io/questions/Min%20Rewards)
    * Same as [Algo expert - Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)


- [x] [845. Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Longest%20Peak)
    * Same as [Algo expert - Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)

- [x] [456. 132 Pattern](https://leetcode.com/problems/132-pattern/)
  ➡ [Reference](https://leetcode.com/problems/132-pattern/solution/)
    * create a min array by using condition min[i]= Math.min(nums[i],min[i-1])
    * Solution is based on mono stack(elements are stored in ascending order from top to bottom).
  ``` for (int j = nums.length - 1; j >= 0; j--) {
      while (!stack.isEmpty() && nums[j] > stack.peek()) {
      if (stack.peek() > min[j])  return true;
      stack.pop();
      }
      stack.push(nums[j]);


- [x] [1470. Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
    * its game of two pointer
    * first pointer 2*i and second 2*i + 1
  ```
  for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
  ```
  
- [x] [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=GSJuwQzKSnI)
  * You have two pointer in between which you need to reverse. left and right
  * iterate(while left>1) and reach at left and then currentNode= left pointer node and prevNode=left-1 pointer node; left--; right--
  * in above loop right-- is required because while reversing you will require right in while loop.
  * now connectionNode=prevNode and tailNode=currentNode
  * Now do reverse linked list logic till right>0 and also do right--
  * at the end connectionNode.next=prev and tail.next=currentNode and return head



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

- [x] [Calendar Matching](https://www.algoexpert.io/questions/Calendar%20Matching)
    * This problem looks like huge code ,but logically its very simple. You need two type of objects
    * StringMeeting(String start; String end) and Meeting { int start; int end}
    * First append daily bounds to respective calendar. ["0:00", dailyBound.start], [dailyBound.end, "23.59"] and
      convert StringMeeting to Meeting
    * Then mergeCalender
  ```while (i < calender1.size() && j < calender2.size()) {
      Meeting meeting1 = calender1.get(i);Meeting meeting2 = calender2.get(j);
      if (meeting1.start < meeting2.start) { merged.add(meeting1); i++;
      } else {merged.add(meeting2);j++;}}
  ```
    * Then flattenCalender
  ```flattenedCalender.add(calender.get(0));
        for (int i = 1; i < calender.size(); i++) {
            Meeting previousMeeting = flattenedCalender.get(flattenedCalender.size() - 1); Meeting currentMeeting = calender.get(i);
            if (previousMeeting.end > currentMeeting.start) {
                Meeting newPreviousMeeting = new Meeting(previousMeeting.start, Math.max(previousMeeting.end, currentMeeting.end));
                flattenedCalender.set(flattenedCalender.size() - 1, newPreviousMeeting);
            } else { flattenedCalender.add(currentMeeting);}}
  ```
    * Then getAvailabilities(flattenedCalender, meetingDuration)
  ```for (int i = 1; i < meetings.size(); i++) {
            int start = meetings.get(i - 1).end;  int end = meetings.get(i).start;
            int difference = end - start;
            if (difference >= meetingDuration) { availableTimes.add(new StringMeeting(minutesToTime(start), minutesToTime(end)));}} 
  ```
    * minutesToTime method will be
  ```
      int hour = time / 60; int min = time % 60;
      String hoursToString = Integer.toString(hour);
      String minToString = min < 10 ? "0" + Integer.toString(min) : Integer.toString(min);
      return hoursToString + ":" + minToString;
  ```
    - [x] [Waterfall Streams](https://www.algoexpert.io/questions/Waterfall%20Streams)
        * Iteration of two rows will lead us to solution. rowAbove=array[0], rowAbove[source]=-1;
      ```
      for (int row = 1; row < array.length; row++) {
            double[] currentRow = array[row];
            for (int idx = 0; idx < rowAbove.length; idx++) {
                  double valueAbove = rowAbove[idx]; boolean hasWater = valueAbove < 0; boolean hasBlock = currentRow[idx] == 1.0;
                  if (!hasWater) { continue;}
                  if (!hasBlock) { currentRow[idx] = currentRow[idx] + valueAbove;continue;}
                  double splitWater = valueAbove / 2;

                  int rightIdx = idx;
                  while (rightIdx + 1 < rowAbove.length) {
                      rightIdx = rightIdx + 1;
                      if (rowAbove[rightIdx] == 1.0) {break;}
                      if (currentRow[rightIdx] != 1.0) { currentRow[rightIdx] = currentRow[rightIdx] + splitWater; break; } }
  
                  int leftIdx = idx;
                  while (leftIdx - 1 >= 0) {
                      leftIdx = leftIdx - 1;
                      if (rowAbove[leftIdx] == 1.0) { break; }
                      if (currentRow[leftIdx] != 1.0) { currentRow[leftIdx] = currentRow[leftIdx] + splitWater; break; }}
              }
              rowAbove = currentRow;
          }
          
       double[] finalValue = new double[rowAbove.length];
        for (int i = 0; i < rowAbove.length; i++) {
            double value = rowAbove[i];
            if (value == 0) { finalValue[i] = value;} 
            else { finalValue[i] = -100 * value;}}
        return finalValue;

```  

  
