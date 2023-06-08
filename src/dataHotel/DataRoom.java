package dataHotel;

public class DataRoom {
    private String room;
    private String type;
    private Double price;
    private String status;

    public DataRoom(String room, String type, Double price, String status) {
        this.room = room;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
