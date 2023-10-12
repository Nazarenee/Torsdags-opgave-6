
public class Cinema {
    String[][] seatss;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seatss = new String[rows][seats];
        //bytter om
         //looper igennem rows + seats for at sætte værdi til 0
       for (int i = 0; i < rows ; i++) {
           for (int j = 0; j < seats; j++) {
               seatss[i][j] = "O";
           }
           }
        seatss[0][0] = "X";
       }


    public int getRows() {
        return seatss.length;
    }

    public int getSeats() {
        return seatss[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        //erstat o med 0
        if (seatss[row-1][seat-1].equals("O")) {
            seatss[row-1][seat-1] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        //erstatter lille x med Stort
        //sætter -1
        if (seatss[row-1][seat-1].equals("X")) {
            seatss[row-1][seat-1] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        //ændrer vi fra null
        String result = "";
        for (int i = 0; i < seatss.length; i++) {
            result += "|";
            for (int j = 0; j < seatss[i].length; j++) {
                result += seatss[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
