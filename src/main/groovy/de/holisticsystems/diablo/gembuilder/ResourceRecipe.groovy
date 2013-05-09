package de.holisticsystems.diablo.gembuilder

/**
 * A RecourceRecipe is a Recipe describing how a certian Resource can be obtained by building it.
 * User: Michael
 * Date: 27.03.13
 * Time: 09:08
 */
class ResourceRecipe extends HashMap {
    int price
    HashMap <Page,Integer> pages
    HashMap <Resource,Integer> resources

    ResourceRecipe(int i, float v, int price, HashMap<Page, Integer> pages, HashMap<Resource, Integer> resources) {
        super(i, v)
        this.price = price
        this.pages = pages
        this.resources = resources
    }

    ResourceRecipe(int i, int price, HashMap<Page, Integer> pages, HashMap<Resource, Integer> resources) {
        super(i)
        this.price = price
        this.pages = pages
        this.resources = resources
    }

    ResourceRecipe(int price, HashMap<Page, Integer> pages, HashMap<Resource, Integer> resources) {
        this.price = price
        this.pages = pages
        this.resources = resources
    }

    ResourceRecipe(Map map, int price, HashMap<Page, Integer> pages, HashMap<Resource, Integer> resources) {
        super(map)
        this.price = price
        this.pages = pages
        this.resources = resources
    }
}
