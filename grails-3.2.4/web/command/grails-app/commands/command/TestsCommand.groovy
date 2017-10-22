package command

import grails.dev.commands.GrailsApplicationCommand

import grails.core.GrailsApplication

class TestsCommand implements GrailsApplicationCommand {

    GrailsApplication grailsApplication

    boolean handle() {
        println 'TestsCommand.handle'
        println 'args:'+args
        def domainClass = grailsApplication.getDomainClass(args[0])
		println 'domainClass:'+domainClass
        true
    }

    List<String> getArgs() {
        executionContext.commandLine.remainingArgs
    }

}