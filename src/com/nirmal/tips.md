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


- [x] [Dijkstra's Algorithm](https://www.algoexpert.io/questions/dijkstra's-algorithm)
    * DijkstrasAlgorithim

- [x] [disk-stacking](https://www.algoexpert.io/questions/disk-stacking)
    * Its not that complex, but just that simple logic u need to remember.
    * Sort the array based on height. disks.sort((disk1, disk2) -> disk1[2].compareTo(disk2[2]));
    * Create height array fill with all disk initial height.
    * now iterate and store the maxHeight if (heights[i] <= heights[j] + currentDisk[2]) in height array if condition
      satisfies.
    * and also you need to store last max height index sequences[i] = j;
    * and while building sequence you need to use sequences array.

- [x] [1691. Maximum Height by Stacking Cuboids](https://leetcode.com/problems/maximum-height-by-stacking-cuboids/)
    * Some confusion is there but its similar to
      aLogExpert [disk-stacking](https://www.algoexpert.io/questions/disk-stacking)

- [x] [maximize-expression](https://www.algoexpert.io/questions/maximize-expression)
    * Again a simple problem which looks complex ,but post explanation it looks awsome.
    * You just need to count the last maximum value while iterating through the array.
    * Since its a-b+c-d ,4 expression ,so you need to do in 4 for loop to find out last expression max value for 4
      different expression

- [x] [numbers-in-pi](https://www.algoexpert.io/questions/numbers-in-pi)
    * See solution code is simple , you just need to map the recursion call and there closing conditions and retrun
      value.
    * And from the return value calculate ur logic. that's it. But still since its first time ..so bit unhappy.

- [x] [539. Minimum Time Difference](https://leetcode.com/problems/minimum-time-difference/)
  ➡ [Reference](https://www.youtube.com/watch?v=c5ecNf7JM1Q) [Solution from ](https://leetcode.com/problems/minimum-time-difference/discuss/100640/Verbose-Java-Solution-Bucket)
    * It's a very interesting problem. You need to rember this simple logic.
    * convert all time to boolean array times[ hr * 60 + min]=true;
    * iterate array and find first = Math.min(first, i), last = Math.max(last, i) and min = Math.min(min, i - prev);
      store prev =i always.
    * at the end return min = Math.min(min, 1440 - last + first);

- [x] [All kinds of node depths](https://www.algoexpert.io/questions/all-kinds-of-node-depths)
    * Create stack insert each node and on pull call nodeDepthRecursive() method and keep on adding returned value.
    * recursive method logic=> return depth + findDepth(root.left, depth + 1) + findDepth(root.right, depth + 1);
