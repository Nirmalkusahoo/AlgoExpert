## All Program solutions in Brief

- [x] [845. Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Longest%20Peak)
    * Same as [Algo expert - Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)




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

- [x] [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
  ➡ [Reference](https://www.youtube.com/watch?v=CABaqOkWbgQ)
    * It's a simple matrix traversal program using BFS where we need to find next 8 direction positions.
    * Add first node -> queue.offer(new int[]{0, 0, 1}), here third value is node/path count and make first node as
      visited by marking grid[0][0] = 1;
    * now while loop thorough queue and again in inner while loop through size.
    * Take row and col value if (r == height - 1 && c == width - 1) return path;
    * count 8 direction nodes int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
    * Add it to queue only if if (row >= 0 && row < height && col >= 0 && col < width && grid[row][col] == 0)
    * If condition true then queue.add(new int[]{row, col, path + 1}), don't forget to decrease the path/node count.
    * And also don't forget to mark the node as visited. grid[newRow][newCol] = 1; And at the end of return -1;





- [x] [Boggle Board](https://www.algoexpert.io/questions/Boggle%20Board)
    *

- [x] [329. Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)
  ➡ [Reference](https://www.youtube.com/watch?v=WiEqhI7v2FY)
    * Its is simple matrix traversal problem. Its just that we need memorise the value to improve TC.
    * see at each node the path value =1, and if we go to next node then it will be prev path+ current path.
    * So the whole logic depends on this only. Do matrix traversal get the adjacent nodes and if adjacent nodes >
      currentNode
    * then call dfs on that node . Since a node can go in to 4 direction we need to save max among all 4 direction.

- [x] [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=nZSXWXzn1aM)
    * Its not that complex. Basic fundamental logic is for each position find how many ways are there to reach.And at the end you
      will have value for reaching the bottom right position.
    * Find the ways to reach for first column and row values in if condition
    * and then using these values you can get other values position obstacleGrid[i][j] = obstacleGrid[i - 1][j] +
      obstacleGrid[i][j - 1];

- [x] [Rectangle Mania](https://www.algoexpert.io/questions/Rectangle%20Mania)
  * Boom it is also one of the simplest algo but looks complex.
  * Store each coordinate in a Set in String format.
  * Now for(nested for loop) each coordinate check whether it has upperRight coordinate.
  * then if both upperCoordinate and rightCoordinate exist increase the count

- [x] [32. Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/)
  ➡ [Reference:1](https://www.youtube.com/watch?v=VdQuwtEd10M) [Reference:2](https://www.youtube.com/watch?v=qC5DGX0CPFA)
  * Since its parenthesis problem then yehh Stack will be coming.  stack.push(-1);
  ```
  for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) { stack.push(i);
                } else { maxLength = Math.max(maxLength, i - stack.peek()); } }
        } 

- [x] [Generate-div-tags](https://www.algoexpert.io/questions/generate-div-tags)
  * It's an easy to remember recursive solution.
  ```
  generate("", numberOfTags, numberOfTags, list);
  public static void generate(String str, int open, int close, ArrayList<String> list) {
        if (open > 0) { String newStr = str + "<div>"; generate(newStr, open - 1, close, list) }
        if (open < close) { String newStr =  str + "</div>"; generate(newStr, open, close - 1, list) }
        if (close == 0) { list.add(str) }
    }
