package de.holisticsystems.diablo.gembuilder
/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 26.03.13
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */
class Gem extends Resource {
    protected enum Kind {
        AMETHYST, EMERALD, RUBY, TOPAS
    }
    protected enum Quality {
        CHIPPED, FLAWED, NORMAL, FLAWLESS, PERFECT, RADIANT, SQUARE, FLAWLESS_SQUARE, PERFECT_SQUARE, RADIANT_SQUARE, STAR, FLAWLESS_STAR, PERFECT_STAR, RADIANT_STAR, MARQUISE
    }
    private Gem(){
        assert 1 == 0, "Creating an undefined GEM is BLASPHEMY!"
    }

    Gem(Kind kind){
        assert 1 == 0, "Creating an undefined GEM is BLASPHEMY!"
        //assert kind != null, "Creating an undefined GEM is BLASPHEMY!"
        //super(kind)
        //this.kind = kind
    }

    Gem(Kind kind, Quality quality){
        assert kind != null, "Creating an undefined GEM is BLASPHEMY!"
        assert quality != null, "Creating an GEM without QUALITY is INSULTING!"

        this.kind = kind
        this.quality = quality
    }

    //build = [gold: 30000, [EMERALD: [FLAWLESS_SQUARE: 3]]]
    //Map build = new Map()

}
