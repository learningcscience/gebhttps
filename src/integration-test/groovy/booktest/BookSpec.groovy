package booktest

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */

import geb.Module
import geb.Page
import org.springframework.boot.test.context.SpringBootTest


@Integration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class BookSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }


    void "test something"() {
        when:"The home page is visited"
        go "/"


        Thread.sleep(10000)

        then:"The title is correct"

        assert withConfirm(true) { $("input", name: "showConfirm").click() } == "Do you like Geb?"





    }



}
