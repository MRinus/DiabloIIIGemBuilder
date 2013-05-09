package de.holisticsystems.diablo.gembuilder;

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 26.03.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class PriceHistoryTest extends Specification {

    public void testSetHistory() throws Exception {
        when:
        def hist = new PriceHistory()
        hist.addHistory(date, value)
        then:
        hist.size() == 1
        where:
        date | value
        new Date() | 123f
        new GregorianCalendar() | 321f
    }
    public void testGetHistory() throws Exception {
        setup:
        def hist = new PriceHistory()
        def date = new Date()
        def price = 123f
        hist.addHistory(date, price)

        expect:
        hist[(date)] == price

    }

    public void testGetCurrentPrice() throws Exception {
        setup:
        def hist = new PriceHistory()
        def date = new Date()
        def dd = Integer.parseInt(date.format('dd'))
        def mm = Integer.parseInt(date.format('MM'))
        def yyyy = Integer.parseInt(date.format('yyyy'))
        def date2 = new GregorianCalendar(yyyy,mm-1,dd)
        date2.add(GregorianCalendar.DAY_OF_YEAR,1)

        def price = 123f
        def price2 = 128f
        hist.addHistory(date, price)
        hist.addHistory(date2, price2)
        expect:
        hist.size() == 2
        hist.sort().size() == 2
        hist.getCurrentPrice() == price2
    }
}
