package org.raul.lesson_4.nestedclasses;

import java.time.LocalTime;

/* 7.Создать класс Park с внутренним классом, с помощью объектов
которого можно хранить информацию об аттракционах, времени их
работы и стоимости.*/
public class Park {
    private ParkAttractions[] attractions;
    private int arraySize;
    private int totalAttractions;

    public Park(int totalAttractions) {
        this.totalAttractions = totalAttractions;
        this.attractions = new ParkAttractions[totalAttractions];
        this.arraySize = 0;
    }

    public int getArraySize() {
        return arraySize;
    }

    public ParkAttractions[] getAttractions() {
        return attractions;
    }

    public void addNewAttraction(String attractionName, LocalTime openingTime, LocalTime closingTime, float ticketPrice) {
        if (arraySize < totalAttractions) {
            attractions[arraySize] = new ParkAttractions(attractionName, openingTime, closingTime, ticketPrice);
            arraySize++;
        } else {
            System.out.println("The array size is limited.");
        }
    }

    public static class ParkAttractions {
        private String attractionName;
        private LocalTime opening;
        private LocalTime closing;
        private float price;

        public ParkAttractions(String attractionName, LocalTime openingTime, LocalTime closingTime, float ticketPrice) {
            this.attractionName = attractionName;
            this.opening = openingTime;
            this.closing = closingTime;
            this.price = ticketPrice;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public LocalTime getOpening() {
            return opening;
        }

        public LocalTime getClosing() {
            return closing;
        }

        public float getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "attractionName:'" + attractionName + '\'' +
                    ", opening: " + opening +
                    ", closing:" + closing +
                    ", price:" + price;
        }
    }
}
