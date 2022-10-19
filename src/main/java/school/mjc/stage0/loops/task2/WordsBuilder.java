package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 7;
        char mySymbol = '#';
        System.out.println(String.format("%" + count + "c", ' ').replaceAll("\\ ", "\\" + mySymbol));
    }
}
