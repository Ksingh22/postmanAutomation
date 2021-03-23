def gv

pipeline{
    agent any

    environment{
        DEV = ""
        QA = "Trello.postman_environment.json"
        COLLECTION = "Trello.postman_collection.json"
    }
    parameters{
            choice(name: 'ENV', choices: ['QA', 'DEV'])
            booleanParam(name: 'InstallDependencies', defaultValue: false , description: 'install newman, npm and node by ')
    }
    stages{
        stage("init")
        {
            steps
            {
                script
                {
                    gv  = load "script.groovy" 
                }
            }
        }
        stage("check npm, node and newman version ")
        {   steps{
            script{
                gv.checknpm()
            }
        }

        }
        stage("Intall node, npm, newman"){
            when{
                expression{
                    params.InstallDependencies
                }
            }
            steps{
                script{
                    gv.installdependencies()
                }
            }
        }
        stage("run postman collection"){
            steps{
                script{
                    gv.runPostmanCollection()
                }
            }
        }
    }
}
