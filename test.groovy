List<String> projectNames = ["project01", "project02", "project03"]

listView("My Projects") {
    // add the three projects to the view
    projectNames.each { name ->
        job(name) {
            // set the project description to be the same as the project name
            description(name)
        
            // configure the job here
            // for example:
            scm {
                git("https://github.com/myorg/myrepo.git")
            }
            steps {
                shell("mvn clean install")
            }
        }
    }
}
