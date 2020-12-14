pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('docparser-app-projects') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/javakishore-veleti/DocParser.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}