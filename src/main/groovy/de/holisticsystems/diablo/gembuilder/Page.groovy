package de.holisticsystems.diablo.gembuilder
/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 26.03.13
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */
class Page extends Resource {
    static enum Kind {
        BLACKSMITHING, JEWELCRAFTING
    }
    static enum Quality {
        PAGE,TOME,TOME_OF_SECRETS
    }

    Page(){
        super()
    }

    Page(Enum kind){
        super(kind)
    }
    //build = [gold: 10, [JEWELCRAFTING: [PAGE: 10]]]
    //build = [gold: 10, [JEWELCRAFTING: [TOME: 10]]]
}
