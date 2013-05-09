package de.holisticsystems.diablo.gembuilder

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 26.03.13
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
abstract class Resource {
    enum Kind {}
    Enum kind

    enum Quality {}
    Enum quality

    PriceHistory priceHistory

    ResourceRecipe build

    Resource() {
        super()
    }

    Resource(Enum Kind) {
        super()
        this.kind = kind
    }
}
