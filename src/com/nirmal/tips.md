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


- [x] [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)
    * traverse first one and store in set then traverse second one.
    * if found in set then return that.

- [x] [1197. Minimum Knight Moves](https://leetcode.com/problems/minimum-knight-moves/)
  ➡ [Reference](https://www.youtube.com/watch?v=XhYVY6PQSxs)
  ➡ [Reference](https://leetcode.com/problems/minimum-knight-moves/discuss/401580/Clean-Java-BFS-solution)
    * Again same graph/matrix traversal using BFS.
    * Points to note int[][] directions {{2, 1},{2, -1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}};
    * x = Math.abs(x); y = Math.abs(y);
    * and while add neighbour nodes condition should be if (newRow >= -1 && newCol >= -1) to move from (0,0) to (1,1) we
      need to start from (-1,2) or (1,-1)

- [x] [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
  ➡ [Reference](https://www.youtube.com/watch?v=C4oBXLr3zos)
    * Whenever it comes to array creation on sorted array it is wise to start from end.
    * So again it's a game of two pointer and for loop started from end index.
    * If you simply consider one element each at a time from the two arrays and insert it and decrease the respective
      pointer then it's done

- [x] [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)
  ➡ [Reference-Actual Solution](https://www.youtube.com/watch?v=rkLDDxOcJxU)
  ➡ [Reference- concept](https://www.youtube.com/watch?v=KE8MQuwE2yA)
  * get column sum and row sum. left most will hold the sum value of square/rectangele.
  * remove the left column(dp[row2][col1 - 1]) and above row value(dp[row1 - 1][col2]) and plus (r1-1,c1-1) since its duplicated.
  * and return dp[row2][col2]

- [x] [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
  ➡ [Reference](https://www.youtube.com/watch?v=M_dpZ8IS_70)
  * Concept is similar to levestein distance problem.
  * The difference is you need to find the common subsequence while traversing in the 2D array.
  *  if (text1.charAt(i - 1) == text2.charAt(j - 1)) { dp[i][j] = 1 + dp[i - 1][j - 1];
     } else { dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); }

- [x] [583. Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=VSrsUkoG0bk)
  * Again Concept is similar to levestein distance problem.
  * The difference is you need to find the number of char you need to delete  while traversing in the 2D array.
  * if (i == 0 || j == 0) => dp[i][j] = i + j;
    else if (word1.charAt(i - 1) == word2.charAt(j - 1)) =>  dp[i][j] = dp[i - 1][j - 1];
    else => dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
