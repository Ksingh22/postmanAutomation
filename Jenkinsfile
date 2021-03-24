def gv


pipeline{
    agent any
    parameters{
            choice(name: 'ENV', choices: ['QA', 'DEV'])
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
        stage("Install npm ")
        {   steps{
            script{
                gv.checknpm()
            }
        }

        }
    }
}
