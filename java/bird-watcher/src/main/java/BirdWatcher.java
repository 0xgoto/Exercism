
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length == 0)
        return 0;
        else
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<7;i++)
        {
            if(birdsPerDay[i] == 0)
            return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i=0; i<7 ; i++)
        {
            if(i==numberOfDays)
            break;
            count = count + birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<7;i++)
        {
            if(birdsPerDay[i]>=5)
            count++;
        }
        return count;
    }
}
