includeTargets << grailsScript("_GrailsClean")
includeTargets << grailsScript("_GrailsRun")
includeTool << gant.tools.Execute

target(default: "The description of the script goes here!") {

    depends(clean, checkVersion, compile, configureProxy, parseArguments, packageApp)

    runApp()
    println 'Executing RUN-APP...'

//    def process = "../test/protractor/e2e/conf.js".execute()
    def process = execute.shell("protractor ./test/e2e/conf.js --baseUrl=http://localhost:8080")

//    process.waitFor()

//    println process
//    println process.exitValue()
//    println process.in.text
//    println process.err.text

    println 'Shutting down the server...'
    stopServer()

    execute.shell("grails clean")
    print 'done'
}