List<String> projectNames = ["project1", "project2", "project3"]

projectNames.each { name ->
    job(name) {
        description(name)
			scm {
				git("https://github.com/anshulc55/Jenkins_Upgradev3.git", 'master')
			}
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
    }
}
