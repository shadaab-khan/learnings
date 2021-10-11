package fundamentals.skills.practice_java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsFeature {

    private enum Status {
        OPEN, CLOSED
    }
    private static final class Task {
        private final Status status;
        private final Integer points;
        Task( final Status status, final Integer points ) {
            this.status = status;
            this.points = points;
        }
        public Integer getPoints() {
            return points;
        }
        public Status getStatus() {
            return status;
        }
        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }
    public static void main(String[] args) {

        final Collection< Task > tasks = Arrays.asList(
                new Task( Status.OPEN, 5 ),
                new Task( Status.OPEN, 13 ),
                new Task( Status.CLOSED, 8 )
        );

        final long totalPointsOfOpenTasks = tasks
                .stream()
//                .parallel()
                .filter( task -> task.getStatus() == Status.OPEN )
                .mapToInt( Task::getPoints )
                .sum();
        System.out.println( "Total points: " + totalPointsOfOpenTasks );

        final Map<Status, List<Task>> statusListMap = tasks
                .stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(statusListMap);

        final Collection<String> perCollection = tasks
                .stream()
                .mapToLong(Task::getPoints)
                .mapToDouble(point -> point / 26.0)
                .boxed()
                .mapToLong(weight -> (long) (weight * 100))
                .mapToObj(per -> per + "%")
                .collect(Collectors.toList());
        System.out.println(perCollection);
    }
}
