package Lesson3;

import java.util.Arrays;

public class Park {
    private String name;

    private Attraction[] attractions;

    public Park(String name, Attraction[] attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public Park() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", attractions=" + Arrays.toString(attractions) +
                '}';
    }

    public class Attraction {
        private String name;

        private String startTime;

        private String endTime;

        private double ticketPrice;

        public Attraction(String name, String startTime, String endTime, double ticketPrice) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.ticketPrice = ticketPrice;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public double getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(double ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startTime='" + startTime + '\'' +
                    ", endTime='" + endTime + '\'' +
                    ", ticketPrice=" + ticketPrice +
                    '}';
        }
    }
}
