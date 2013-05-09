package de.holisticsystems.diablo.gembuilder

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 27.03.13
 * Time: 09:11
 * To change this template use File | Settings | File Templates.
 */
class GemBuilder {
    static def pages = new HashMap()
    static def gems  = new HashMap()

    public static void main(String[] args) {
        Gem.Kind.each {Gem.Kind kind ->
            println ">" + kind
            pages += [(kind): new TreeMap()]
            def workOn = pages[(kind)]
            Gem.Quality.each {Gem.Quality quality ->
                println ">>"+quality
                //pages[(kind)] += [(quality): new HashMap()]
                workOn += [(quality): new HashMap()]
            }
            pages[(kind)] = workOn
        }

        println pages.sort()
    }
}
