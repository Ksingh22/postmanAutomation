def gv


pipeline{
    agent any
    parameters{
            choice(name: 'ENV', choices: ['QA', 'DEV'])
            booleanParam(name: 'InstallDependencies', defaultValue: false)
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
                    params.InstallDependencies == false
                }
            }
            steps{
                script{
                    gv.installdependencies()
                }
            }
        }
    }
}
