package booktest

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */

import geb.Module
import geb.Page



@Integration
class BookSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }


    void "test something"() {
        when:"The home page is visited"
        go "/"


        then:"The title is correct"

        assert withConfirm(true) { $("input", name: "showConfirm").click() } == "Do you like Geb?"





    }



}
