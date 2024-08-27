package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int j;
        for(int i = 1; i < 11; i++){
            j = i * numberTableToPrint;
                System.out.println(i + " " + "x" + " " + numberTableToPrint + " " + "=" + " " + j);

        }
    }
}
