package assignment_1;
//2. Write a program that will count number of notes from given array
//[1000,500,200,100,50,20,10,5,2,1]
public class Task2 {
    public static void countNotes(int amount, int[] notes){
        int count = 0;
        for(int i = 0; i<notes.length; i++) {
            count = amount/notes[i];
            if(count != 0){
                System.out.println(notes[i]+" "+count);
            }
            amount = amount%notes[i];
        }
    }

    public static void main(String[] args){
        int [] notes = {1000,500,200,100,50,20,10,5,2,1};
        int amount = 562;

        countNotes(amount, notes);


    }
}
