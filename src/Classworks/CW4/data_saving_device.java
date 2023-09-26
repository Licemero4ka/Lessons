package Classworks.CW4;

public class data_saving_device {
    String name;
    String type;
    int capacity;
    String dimension;


    public data_saving_device(String name, String type, int capacity, String dimension) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.dimension = dimension;
    }

    public data_saving_device(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public data_saving_device(String name) {
        this.name = name;
    }

    public data_saving_device() {};



    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public void Info() {
        System.out.println("It is " + name + " his type is " + type + " and his capacity is " + capacity + dimension);
    }

    public void IncreaseCapacity(int numberofincrease){
        capacity +=numberofincrease;


    }

}