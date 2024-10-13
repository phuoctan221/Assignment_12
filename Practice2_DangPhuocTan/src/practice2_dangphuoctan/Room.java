package practice2_dangphuoctan;

import java.util.Date;

public abstract class Room implements IRoom {

    private String idR;
    private String levelR;
    private Date checkIn;
    private Date checkOut;

    public Room(String idR, String levelR, Date checkIn, Date checkOut) {
        this.idR = idR;
        this.levelR = levelR;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Room() {
    }

    public String getIdR() {
        return idR;
    }

    public void setIdR(String idR) {
        this.idR = idR;
    }

    public String getLevelR() {
        return levelR;
    }

    public void setLevelR(String levelR) {
        this.levelR = levelR;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public double rentCalculation() {
        long diff = checkOut.getTime() - checkIn.getTime();
        int days = (int) (diff / (1000 * 60 * 60 * 24)) + 1;

        switch (levelR) {
            case "A":
                return days * 1200000;
            case "a":
                return days * 1200000;
            case "B":
                return days * 1000000;
            case "b":
                return days * 1000000;
            case "C":
                return days * 750000;
            case "c":
                return days * 750000;
            default:
                System.out.println("Invalid room level!");
                return 0;
        }
    }

    @Override
    public abstract void update();

    @Override
    public abstract void inPut();

    @Override
    public abstract void outPut();
}
