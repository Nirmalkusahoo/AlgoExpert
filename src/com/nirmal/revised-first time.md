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
