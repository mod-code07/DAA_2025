import java.util.*;

class Activity {
    int start, end;
    
    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class ActivityComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity a1, Activity a2) {
        return a1.end - a2.end;
    }
}

public class ActivitySelection {
    static void selectActivities(int start[], int end[], int n) {
        ArrayList<Activity> activities = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }
        
        Collections.sort(activities, new ActivityComparator());
        
        int count = 1;
        int lastEnd = activities.get(0).end;
        
        System.out.print("Selected Activities: (" + activities.get(0).start + ", " + activities.get(0).end + ")");
        
        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= lastEnd) {
                System.out.print(", (" + activities.get(i).start + ", " + activities.get(i).end + ")");
                lastEnd = activities.get(i).end;
                count++;
            }
        }
        
        System.out.println("\nMaximum number of activities that can be performed: " + count);
    }

    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};
        int n = start.length;
        selectActivities(start, end, n);
    }
}
