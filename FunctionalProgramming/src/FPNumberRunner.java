import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

        public static void main(String[] args) {
            IntStream.range(1,11).map(e->e*e).forEach(e->System.out.println(e));
            List<String> words= List.of("Apple","Ant","Bat");
            words.stream().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
            words.stream().map(s->s.length()).forEach(s->System.out.println(s));
        }
    }


