package de.holisticsystems.diablo.gembuilder

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 26.03.13
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
class PriceHistory extends HashMap<Date,Float>{
    //public HashMap<Date,Float> history = new HashMap<Date,Float>()

    PriceHistory() {
        this = new HashMap<Date,Float>()
        assert this.size() == 0
    }

    PriceHistory(HashMap<Date, Float> history) {
        this = history
    }

    HashMap<Date, Float> getHistory() {
        return history
    }

    @Override
    public Float getAt(Date date) {
        this.getAt(date.format('dd.MM.yyyy'))
    }

    void addHistory(Calendar date, Float price) {
        def oldSize = this.size()
        assert this.size() >= 0
        def day = date.get(Calendar.DAY_OF_MONTH)
        def month = date.get(Calendar.MONTH)+1
        def year = date.get(Calendar.YEAR)
        this.putAt("$day.$month.$year",price)
        assert this.size() >= oldSize
    }

    void addHistory(Date date, Float price) {
        assert this.size() >= 0
        def oldSize = this.size()
        this.putAt(date.format('dd.MM.yyyy'),price)
        assert this.size() >= oldSize
    }

    void setHistory(HashMap<Date, Float> history) {
        this = history
    }


    public Float getCurrentPrice() {
        return this[(this.keySet().sort().last())]
    }



}
