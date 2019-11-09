package practice_java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class CarMethodReference {
    public static CarMethodReference create(final Supplier<CarMethodReference> supplier ) {
        return supplier.get();
    }
    public static void collide( final CarMethodReference carMethodReference) {
        System.out.println( "Collided " + carMethodReference.toString() );
    }
    public void follow( final CarMethodReference another ) {
        System.out.println( "Following the " + another.toString() );
    }
    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }

    public static void main(String[] args) {

        final CarMethodReference carMethodReference = CarMethodReference.create( CarMethodReference::new );
        final List<CarMethodReference> carMethodReferences = Collections.singletonList(carMethodReference);

        carMethodReferences.forEach( CarMethodReference::collide );
        carMethodReferences.forEach( CarMethodReference::repair );

        final CarMethodReference police = CarMethodReference.create( CarMethodReference::new );
        carMethodReferences.forEach( police::follow );
    }
}
