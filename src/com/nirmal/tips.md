## All Program solutions in Brief

- [x] [135. Candy](https://leetcode.com/problems/candy/)
  ➡ [Reference](https://www.algoexpert.io/questions/Min%20Rewards)
    * Same as [Algo expert - Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)
    * create rewards array with value 1 in all. Array.fill(rewards,1).
    * in for (int i=1;i<len-1;i++) if(arr[i]>arr[i-1]) then rewards[i]=rewards[i-1]+1
    * in second for loop need to iterate in reverse
    * for(int i=len-2;i>=0;i--) if(arr[i]>arr[i+1]) rewards[i]= Math.max(arr[i],arr[i+1]+1)
    * and next return sum of rewards array

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


- [x] [Longest Range](https://www.algoexpert.io/questions/Largest%20Range)
    * Create a map and store all number with boolean true map.put(num,true)
    * Iterate through num array and check if num is not visited then assign currentLength=1
    * then left=num-1 and right=num+1
    * in while loop check if left is present in map then currentLength++; map.put(left,false); left-- and do same for
      right
    * update the if currentLength> largest then update int[] bestRange={left+1 , right-1}


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

- [x] [Minimum Area Rectangle](https://www.algoexpert.io/questions/Minimum%20Area%20Rectangle)
    * One of the easiest solution which looks complex
    * Create a HasSet(pointSet) from int[][] points input using X,Y of coordinates. set.add(String.valueOf(x) + ":" +
      String.valueOf(y))[convert method]
    * run two for loop and get int p1x = points[firstIdx][0]; int p1y = points[firstIdx][1]; int p2x =
      points[secondIdx][0]; int p2y = points[secondIdx][1];
    * check any coordinates shouldn't be in same axis . boolean isPointMatches = p1x == p2x || p1y == p2y; if (
      isPointMatches) { continue;}
    * Then find opposite/diagonal points
    * boolean isOppositeToP1Exist = pointSet.contains(convert(p1x, p2y)); boolean isOppositeToP2Exist =
      pointSet.contains(convert(p2x, p1y));
    * if(isOppositeToP1Exist && isOppositeToP2Exist) then find the area=Math.abs(p1x - p2x)* Math.abs(p1y - p2y); and
      store minArea


- [x] [Line Through Points](https://www.algoexpert.io/questions/Line%20Through%20Points)
  ➡ [Reference](https://www.algoexpert.io/questions/Line%20Through%20Points)
    * Run two for loop and take point1 and point2; and create map inside first for loop
    * find slope by using gcd(the greatest common divisor). then rise=slope[0], run=slope[1];
    * Now make ket using rise and run and store it in map and out side the second for loop find the currentMax
    * and store maxPointsInALine = Math.max(currentMax, maxPointsInALine);

- [x] [Permutations](https://www.algoexpert.io/questions/Permutations) [/ LeetCode - Permutations](https://leetcode.com/problems/permutations/)
  ➡ [Reference](https://www.youtube.com/watch?v=f2ic2Rsc9pU)
  ➡ [Reference](https://www.algoexpert.io/questions/Permutations)
    * Two ways present using backtracking. 1. using Has Map 2. Not using hasmap to avoid space
  ```
   public static void getPermutations(int i, int[] array, List<List<Integer>> list) {
        if (array.length - 1 == i) {
            List<Integer> finalList = new ArrayList<Integer>();
            for (int num : array) { finalList.add(num);}  list.add(finalList);
        } else {
            for (int j = i; j < array.length; j++) {
                swap(i, j, array);
                getPermutations(i + 1, array, list);
                swap(i, j, array);
            }
        }
    }

- [x] [Cycle in Graph](https://www.algoexpert.io/questions/Cycle%20In%20Graph)
    * Using int[] array and color code it will be solved. int WHITE = 0, GRAY = 1, BLACK = 2;
    * int[] colors = new int[numberOfNodes]; Arrays.fill(colors, WHITE);
    * Need to iterate through all nodes and if its color[node] ==WHITE
    * boolean containsCycle = traverseAndColorNodes(node, edges, colors); if (containsCycle) { return true }
    * and traverseAndColorNodes , change node color to GRAY and find neighbours
    * iterate through neighbours and while iterating if found gray then return true. If BLACK then continue
    * OtherWise,( WHITE) again call do DFS by calling traverseAndColorNodes(neighbour, edges, colors)
    * if it returns true then return true else make colors[node] = BLACK; and return false

- [x] [1302. Deepest Leaves Sum](https://leetcode.com/problems/deepest-leaves-sum/)
  ➡ [Reference](https://www.youtube.com/watch?v=hM9tzzlRcnM)
    * We need the deepest leaves sum which means basically we need last level element sum.
    * Do a level order traversal using Queue and find sum of elements at each level.
    * levelSum value should be reset to 0 before eachLevel loop starts
    * return level sum which basically last level sum


- [x] [Minimum Passes Of Matrix](https://www.algoexpert.io/questions/Minimum%20Passes%20Of%20Matrix)
    * It is simple problem with extra variable i.e. passes and you need to return passes-1 as ans;
    * iterate over the matrix and get all positive numbers in to a queue;
    * and the while (!queue.isEmpty()) { int size = queue.size(); while (size > 0) {
    * get the individual position and get there neighbour elements .If any neighbour <0 make them positive and it to
      queue
    * and then size-- and also passes++ at then end return passes-1. because last iteration will always iterate only
      through positive integers.
    * And then check if matrix contains Negatives value then return -1 otherwise passes;

- [x] [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
  ➡ [Reference](https://www.youtube.com/watch?v=CABaqOkWbgQ)
    * It's a simple matrix traversal program using BFS where we need to find next 8 direction positions.
    * Add first node -> queue.offer(new int[]{0, 0, 1}), here third value is node/path count and make first node as
      visited by marking grid[0][0] = 1;
    * now while loop thorough queue and again in inner while loop through size.
    * Take row and col value if (r == height - 1 && c == width - 1) return path;
    * count 8 direction nodes int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
    * Add it to queue only if if (row >= 0 && row < height && col >= 0 && col < width && grid[row][col] == 0)
    * If condition true then queue.add(new int[]{row, col, path + 1}), don't forget to increase the path/node count.
    * And also don't forget to mark the node as visited. grid[newRow][newCol] = 1; And at the end of return -1;

- [x] [1290. Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
  ➡ [Reference](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/629087/Detailed-explanation-Java-%3A-faster-than-100.00)
  * Its just based on a easy formula binary -> decimal
  * int sum = 0;
       while (head != null)
       sum = sum * 2;  sum = sum + head.val;  head = head.next;
       return sum;
       

- [x] [2016. Maximum Difference Between Increasing Elements](https://leetcode.com/problems/maximum-difference-between-increasing-elements/)
  ➡ [Reference](https://leetcode.com/problems/maximum-difference-between-increasing-elements/discuss/1486323/JavaPython-3-Time-O(n)-space-O(1)-codes-w-brief-explanation-and-a-similar-problem.)
  ```
         int min = nums[0]; int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) { maxDiff = Math.max(maxDiff, nums[i] - min) }
            min = Math.min(min, nums[i]);
        }
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
