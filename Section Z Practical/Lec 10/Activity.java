import java.util.*;
class meeting {
    int start;
    int end;
     
    meeting(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}
class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2) {
        return (o1.end - o2.end); 
    }
}
public class Activity {
    static void maxMeetings(int start[], int end[], int n) {
        ArrayList<meeting> meet = new ArrayList<>();
        int ans=1;
        for(int i = 0; i < n; i++)
            meet.add(new meeting(start[i], end[i]));
        
        Collections.sort(meet, new meetingComparator()); 
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<n;i++) {
            if(meet.get(i).start >= limit) {
                limit = meet.get(i).end; 
                ans++;
            }
        }
        System.out.println("Number of meetings will be performed is "+ans);

        
    }
    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings(start,end,n);
        
    }
}