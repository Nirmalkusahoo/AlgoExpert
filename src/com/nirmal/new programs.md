## All Program solutions in Brief

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

- [x] [Dijkstra's Algorithm](https://www.algoexpert.io/questions/dijkstra's-algorithm)
    * DijkstrasAlgorithim

- [x] [Merge linked lists](https://www.algoexpert.io/questions/merge-linked-lists)
    * its not that complex to remember .Again 3 pointer and need to merge in one linkedList
  ```
          while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                p1Prev = p1;
                p1 = p1.next;
            } else {
                if (p1Prev != null) {
                    p1Prev.next = p2;
                }
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }
        if (p1 == null) {
            p1Prev.next = p2;
        }
        return headOne.value < headTwo.value ? headOne : headTwo;
  ```
- [x] [LRU cache](https://www.algoexpert.io/questions/lru-cache)
    * LRU cache- Create Map<String, DoublyLinkedListNode> cache and DoublyLinkedList mostRecentList with maxSize

- [x] [Max subset sum no adjacent](https://www.algoexpert.io/questions/max-subset-sum-no-adjacent)
    * simple formula int maxArr[i] = Math.max(maxArr[i-1], maxArr[i-2] + maxArr[i]);

- [x] [198. House Robber](https://leetcode.com/problems/house-robber/)
  ➡ [Reference:1](https://www.youtube.com/watch?v=VdQuwtEd10M)
    * Similar to [Max subset sum no adjacent]- Algo Expert

- [x] [Number of ways to make change](https://www.algoexpert.io/questions/number-of-ways-to-make-change)
    * simple formula ways[targetAMount] = ways[targetAMount] + ways[targetAMount - coin];

- [x] [Min number of coins for change](https://www.algoexpert.io/questions/min-number-of-coins-for-change)
    * remember the logic or revisit the video
- [x] [Levenshtein distance](https://www.algoexpert.io/questions/levenshtein-distance)
    * the target string should be in column
    * formula
    ```
   if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
       matrix[row][col] = matrix[row - 1][col - 1];
   } else {
       matrix[row][col] = 1 + Math.min(matrix[row - 1][col - 1], Math.min(matrix[row - 1][col], matrix[row][col - 1]));
   }
  ```
- [x] [Max sum increasing subsequence](https://www.algoexpert.io/questions/max-sum-increasing-subsequence)
    * store max value of two num(currentNum and otherNum) in maxArray and store the index in sequence array

- [x] [longest common subsequence](https://www.algoexpert.io/questions/longest-common-subsequence)
    * Similar to levesnstein distance problem
    * but while making sequence you need to send column string from matrix

- [x] [Min number of jumps](https://www.algoexpert.io/questions/min-number-of-jumps)
    * Yes simple interesting logic needs to remember till sometime :)

  ```
        int jumps = 0;
        int maxReach = array[0];
        int steps = array[0];
        for (int i = 1; i < array.length; i++) {
            maxReach = Math.max(maxReach, array[i] + i);
            steps--;
            if (steps == 0) {
                steps = maxReach - i;
                jumps++;
            }
        }
        return jumps + 1;
  ```
- [x] [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
    * Simple logic maxWater = Math.max(maxWater, Math.min(height[leftIdx], height[rightIdx]) * (rightIdx - leftIdx));
-
- [x] [longest increasing subsequence](https://www.algoexpert.io/questions/longest-increasing-subsequence)
    * Two Approach- 1.Binary search , 2. Regular subsequence DP approach
    * Regular subsequence DP approach us clear and revised
    * Binary search still need practise


- [x] [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
  ➡ [Reference:1](https://www.algoexpert.io/questions/longest-increasing-subsequence)
    * Similar to [longest increasing subsequence]- Algo Expert

- [x] [Min heap construction](https://www.algoexpert.io/questions/min-heap-construction)
    * Very easy interesting, but practise needed.

- [x] [Continuous median](https://www.algoexpert.io/questions/continuous-median)
    * Create two Queue add half largest nums in min heap and smallest in max
    * PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    * PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
    * after adding balance two heaps if size difference is 2;
    * to find median if size equals the (max.peek() + min.peek())/2;
    * if size not equal then which ever is greater size peek from there

- [x] [295. Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)
  * Similar to [Continuous median](https://www.algoexpert.io/questions/continuous-median) from AlgoExpert
