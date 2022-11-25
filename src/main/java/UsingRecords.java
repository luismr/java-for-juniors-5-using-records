import java.util.stream.Stream;

public final class UsingRecords {

    private static record Country(String code, String name, String currency){};

    private static Stream<Country> countries = Stream.of(
            new Country("BR", "Brazil", "BLR"),
            new Country("AR", "Argentina", "ARP"),
            new Country("UR", "Uruguay", "URP")
    );

    public static void main(final String [] args) {
        recordRegularUsage1();
        recordRegularUsage2();
    }

    private static void recordRegularUsage2() {
        countries.forEach( c -> System.out.println(c.name) );
    }

    private static void recordRegularUsage1() {
        Country c1 = new Country("BR", "Brazil", "BLR");
        Country c2 = new Country("AR", "Argentina", "ARP");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.name);
        System.out.println(c2.name());
    }

}
