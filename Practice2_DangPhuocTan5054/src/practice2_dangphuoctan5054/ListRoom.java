package practice2_dangphuoctan5054;

import java.util.ArrayList;

public class ListRoom {
    private ArrayList<Room> listRoom = new ArrayList<>();

    public void addBedroom(BedRoom bed) {
        listRoom.add(bed);
    }

    public void addMeetingRoom(MeetingRoom meeting) {
        listRoom.add(meeting);
    }

    public void deleteRoom(String id) {
        boolean removed = listRoom.removeIf(room -> room.getIdR().equals(id));
        if (!removed) {
            System.out.println("Room not found!");
        }
    }

    public void update(String id) {
        for (Room room : listRoom) {
            if (room.getIdR().equals(id)) {
                room.update();
                return;
            }
        }
        System.out.println("Room not found!");
    }

    public double totalRoom() {
        double total = 0;
        for (Room room : listRoom) {
            total += room.rentCalculation();
        }
        return total;
    }

    public void statisticsByRoomType() {
        int countA = 0, countB = 0, countC = 0;

        for (Room room : listRoom) {
            switch (room.getLevelR()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }

        System.out.println("Grade A rooms: " + countA);
        System.out.println("Grade B rooms: " + countB);
        System.out.println("Grade C rooms: " + countC);
    }
}
