package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        while(counter <= chars.length - 1){
            System.out.print(chars[counter]);
            counter++;
        }


    }
}
