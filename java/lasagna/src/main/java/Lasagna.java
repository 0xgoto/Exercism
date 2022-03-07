public class Lasagna {
    int total_expected_time = 40;
    public int expectedMinutesInOven()
    {
        return total_expected_time;
    }

    public int remainingMinutesInOven(int time)
    {
        return expectedMinutesInOven()-time;
    }

    public int preparationTimeInMinutes(int layers)
    {
        return 2*layers;
    }

    public int totalTimeInMinutes(int layers, int time)
    {
        return time+preparationTimeInMinutes(layers);
    }
}
