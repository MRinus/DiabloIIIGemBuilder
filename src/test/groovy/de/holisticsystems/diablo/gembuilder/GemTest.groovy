package de.holisticsystems.diablo.gembuilder

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 27.03.13
 * Time: 09:30
 * To change this template use File | Settings | File Templates.
 */
class GemTest extends Specification {
    def "can NOT create new undefined Gem"() {
        when:
        def gem = new Gem()

        then:
        thrown(AssertionError)
    }

    def "can NOT create new Gem without <quality>"() {
        when:
        def gem = new Gem(kind as Gem.Kind)

        then:
        thrown(AssertionError)

        where:
        kind              | dummy
        Gem.Kind.EMERALD  | 1
        Gem.Kind.AMETHYST | 2
        Gem.Kind.TOPAS    | 3
        Gem.Kind.RUBY     | 4
    }

    def "can create new GEMs when Kind and Quality are given"() {
        when:
        def gem = new Gem(kind, quality)

        then:
        gem != null
        gem.kind == kind
        gem.quality == quality

        where:
        kind              | quality                   | dummy
        Gem.Kind.EMERALD  | Gem.Quality.CHIPPED       | 1
        Gem.Kind.AMETHYST | Gem.Quality.FLAWED        | 2
        Gem.Kind.TOPAS    | Gem.Quality.FLAWLESS_STAR | 3
        Gem.Kind.RUBY     | Gem.Quality.MARQUISE      | 4
    }
}
