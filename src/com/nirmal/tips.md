## All Program solutions in Brief

- [x] [845. Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Longest%20Peak)
    * Same as [Algo expert - Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)


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


- [x] [Dijkstra's Algorithm](https://www.algoexpert.io/questions/dijkstra's-algorithm)
    * DijkstrasAlgorithim

- [x] [1268. Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)
  ➡ [Reference](https://www.youtube.com/watch?v=D4T2N0yAr20)
    * Can be done using two pointer.
    * Points :(list[L].length <= i || list[L].charAt(i) != c) , maxWindow= R-L + 1; upperBound = Math.min(maxWindow, 3)
  
- [x] [745. Prefix and Suffix Search](https://leetcode.com/problems/prefix-and-suffix-search/)
  ➡ [Reference](https://www.youtube.com/watch?v=3JVlE66WxW0&t=0s)
  ➡ [Reference](https://www.youtube.com/watch?v=X630KoSDkeQ)
  * Create all the possible strings with prefix + # + suffix and store it in Map. 
  * and then check if exist return else return -1;

- [x] [1642. Furthest Building You Can Reach](https://leetcode.com/problems/furthest-building-you-can-reach/)
  ➡ [Reference](https://www.youtube.com/watch?v=wAxhnUhXvHE)
  * Can be done using PriortiyQueue. PriortiyQueue.size shoule be always smaller then ladders
  * Store height difference in PriortiyQueue if slot available(pq.size() < ladders)
  * if not then check diff > pq.peek() then br = pq.remove(); pq.offer(diff);
    * if (bricks - br >= 0) {
       bricks = bricks - br;
       }
- [x] [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
  ➡ [Reference](https://www.youtube.com/watch?v=ockS2ZKh7j8&t=316s)
  * Three solutions - 1. Sorting 2.using MinHeap 3. Quick sort
  * First Solution: Sort the array and return kth element from end
  * Crate Min Heap , Iterate the input array and store till heap.size> k , so that it will always store largest k numbers
  * and then return heap.poll(), so it will return the min number
  * 3: Using quick sort(not explored in details)

- [x] [43. Multiply Strings](https://leetcode.com/problems/multiply-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=rUVg2Vewbo8)
  * Anhha need to remember the logic a bit.
```
  int[] result = new int[n + m];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product = product + result[i + j + 1];
                result[i + j + 1] = product % 10;
                result[i + j] = result[i + j] + product / 10;
            }
        }
```
- [x] [630. Course Schedule III](https://leetcode.com/problems/course-schedule-iii/)
  ➡ [Reference](https://www.youtube.com/watch?v=ey8FxYsFAMU)
  * ITs a simple problem ,can be solved by sorting and then using priorityQueue
  * Sort the array based on last days. Create max heap which will return the course with max duration.
  * if consumed time is less than last day then insert in PQ or else peek from PQ(don't forget time-pq.poll()) and exchange
  * Arrays.sort(courses, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
      PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
  
- [x] [346. Moving Average from Data Stream](https://leetcode.com/problems/moving-average-from-data-stream/)
  * Simple problem can be solved using Deque. store in Dqueue till the size given if crosee then remove from begining 
  * and by this you can keep on finding average. Pont  return (sum * 1.0) / Math.min(size, count);

- [x] [2096. Step-By-Step Directions From a Binary Tree Node to Another](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/)
  ➡ [Reference](https://www.youtube.com/watch?v=gtsZqtdA6Lc&t=583s)
  * There were two ways 1.using Graph with BFS but gave TLE(Simple solution)
  * 2.way- using recursion 
