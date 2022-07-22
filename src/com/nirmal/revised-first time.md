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

- [x] [Largest range](https://www.algoexpert.io/questions/largest-range)
    * put all the number in Map<Integer, Boolean> as Map.put(num, true);
    * visit all num if it is not false in map. and do folowing things
    * make numMap.put(num, false); currentLength = 1; left = num - 1; right = num + 1;
    * run two while loop ,increase the length and store the number as false and then count the max length.

- [x] [Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)
    * i=1; while(i<arr.length-1) if(array[i - 1] < array[i] && array[i] > array[i + 1]) booelan isPeak=true;
    * if(!isPeak)= i++ ;continue
    * left=i-2; right=i+2; while(left >= 0 && array[left] < array[left + 1)   left=left-1; similarly for while( right <
      array.length && array[right - 1] < array[right])
    * int currenLength=right-left-1 and compare with maxLength and store. new i=right and after intital while loop
      return maxLength;

- [x] [Monotonic Array](https://www.algoexpert.io/questions/Monotonic%20Array)
    * With two boolean variable isIncreasingOrder=true , isInDecreasingOrder=true it can be done
    * Either arr[i]< arr[i+1] always(then isInDecreasingOrder=false;) OR arr[i]> arr[i+1] always (then
      isIncreasingOrder=false)
    * and return isIncreasingOrder || isInDecreasingOrder;

- [x] [Move Element To End](https://www.algoexpert.io/questions/Move%20Element%20To%20End)
    * Can be done with two pointer L ,R while(L<R);
    * in nested while(L<R && array.get(R) == elementToBeMoved) R--;
    * then if(array.get(L) == toMove) swap (L,R) and L++;
- [x] [Line Through Points](https://www.algoexpert.io/questions/Line%20Through%20Points)
  ➡ [Reference](https://www.algoexpert.io/questions/Line%20Through%20Points)
    * Run two for loop and take point1 and point2; and create map inside first for loop
    * find slope by using gcd(the greatest common divisor). then rise=slope[0], run=slope[1];
    * Now make ket using rise and run and store it in map and out side the second for loop find the currentMax
    * and store maxPointsInALine = Math.max(currentMax, maxPointsInALine);

- [x] [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=nZSXWXzn1aM)
    * Its not that complex. Basic fundamental logic is for each position find how many ways are there to reach.And at
      the end you will have value for reaching the bottom right position.
    * Find the ways to reach for first column and row values in if condition
    * and then using these values you can get other values position obstacleGrid[i][j] = obstacleGrid[i - 1][j] +
      obstacleGrid[i][j - 1];
  ```
  if (obstacleGrid[i][j] == 1 ||
      (i != 0 && obstacleGrid[i - 1][j] == 0) || (j != 0 && obstacleGrid[i][j - 1] == 0)) {
      obstacleGrid[i][j] = 0;
      } else {
      obstacleGrid[i][j] = 1;
      }
  ```
- [x] [disk-stacking](https://www.algoexpert.io/questions/disk-stacking)
    * Its not that complex, but just that simple logic u need to remember.
    * Sort the array based on height. disks.sort((disk1, disk2) -> disk1[2].compareTo(disk2[2]));
    * Create height array fill with all disk initial height.
    * now iterate and store the maxHeight if (heights[i] <= heights[j] + currentDisk[2]) in height array if condition
      satisfies.
    * and also you need to store last max height index sequences[i] = j;
    * and while building sequence you need to use sequences array.
- [x] [maximize-expression](https://www.algoexpert.io/questions/maximize-expression)
    * Again a simple problem which looks complex ,but post explanation it looks awsome.
    * You just need to count the last maximum value while iterating through the array.
    * Since its a-b+c-d ,4 expression ,so you need to do in 4 for loop to find out last expression max value for 4
      different expression
