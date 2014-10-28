target(default: "The description of the script goes here!") {

    println 'Init protractor dir structure'
    ant.mkdir(dir: "${basedir}/test/protractor/e2e/spec")


    println 'Create sample protractor conf file'
    ant.copy(file: "${protractorRunnerPluginDir}/grails-app/conf/conf.js",
            todir: "${basedir}/test/protractor/e2e")

    println 'Create sample protractor spec'
    ant.copy(file: "${protractorRunnerPluginDir}/grails-app/conf/example-spec.js",
            todir: "${basedir}/test/protractor/e2e/spec")

    println 'Done'
}