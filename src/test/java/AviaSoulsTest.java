import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class AviaSoulsTest {

    @Test

    public void SortFewTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,23,13);
        Ticket ticket2 = new Ticket("MSK","LA",1_000,13,23);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",6_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",3_000,3,13);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] actual = aviaSouls.search("MSK","LA");
        Ticket[] expected = {ticket2, ticket1, ticket9, ticket8};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test

    public void SortOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,23,13);
        Ticket ticket2 = new Ticket("MSK","LA",4_000,13,23);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",3_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",6_000,3,13);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] actual = aviaSouls.search("LA","MSK");
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test

    public void SortNonTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,23,13);
        Ticket ticket2 = new Ticket("MSK","LA",4_000,13,23);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",3_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",6_000,3,13);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] actual = aviaSouls.search("LA","LA");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected,actual);

    }


    @Test

    public void SortFewTicketComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,13,8);
        Ticket ticket2 = new Ticket("MSK","LA",1_000,23,22);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",6_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",3_000,13,10);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.searchAndSortBy("MSK","LA", comparator);
        Ticket[] expected = {ticket2, ticket9, ticket1, ticket8};


        Assertions.assertArrayEquals(expected,actual);

    }

    @Test

    public void SortOneTicketComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,23,13);
        Ticket ticket2 = new Ticket("MSK","LA",4_000,13,23);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",3_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",6_000,3,13);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.searchAndSortBy("LA","MSK", comparator);
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test

    public void SortNonTicketComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK","LA",2_000,23,13);
        Ticket ticket2 = new Ticket("MSK","LA",4_000,13,23);
        Ticket ticket3 = new Ticket("SPB","MSK",1_000,11,13);
        Ticket ticket4 = new Ticket("SPB","LA",8_000,9,21);
        Ticket ticket5 = new Ticket("MSK","SPB",500,8,10);
        Ticket ticket6 = new Ticket("MSK","SPB",800,23,1);
        Ticket ticket7 = new Ticket("LA","MSK",10_000,5,19);
        Ticket ticket8 = new Ticket("MSK","LA",3_000,20,10);
        Ticket ticket9 = new Ticket("MSK","LA",6_000,3,13);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.searchAndSortBy("LA","LA", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected,actual);

    }

}