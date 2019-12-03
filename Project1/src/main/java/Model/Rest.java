package Model;

public class Rest extends Travel {
    private String HotelName;
    private int HotelStars;

    public Rest(Transport tr, int cost, int days, Food fd, String hotelName, int hotelStars) {
        super(tr, cost, days, fd);
        this.HotelName = hotelName;
        this.HotelStars = hotelStars;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public int getHotelStars() {
        return HotelStars;
    }

    public void setHotelStars(int hotelStars) {
        HotelStars = hotelStars;
    }
}
