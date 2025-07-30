public class Train {
    private int trainId;
    private String name;
    private String source;
    private String destination;

    private int totalSeats;

    private int availableSeats;

    public Train(int trainId, String name, String source, String destination, int totalSeats) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean bookSeats(int count)
    {
        if(count<=availableSeats)
        {
            availableSeats-=count;
            return true;
        }
        return false;
    }

    public void cancelSeats(int count)
    {
        availableSeats +=count;
    }

    @Override
    public String toString()
    {
        return trainId + " | "+name+" | "+source+ " -> "+destination+" Seats Available: "+availableSeats;
    }

}
