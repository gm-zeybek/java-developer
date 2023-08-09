package task.taskEg;

public class AppleRedColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return  apple.getColor().equals(Color.RED);
    }
}
