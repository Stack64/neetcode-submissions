/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer> qq=new PriorityQueue<>();
        for(int i=0;i<intervals.size();i++){
            Interval curr=intervals.get(i);
            if(!qq.isEmpty() && curr.start >= qq.peek()) qq.poll();
            qq.offer(curr.end);
        }
        return qq.size();
    }
}
