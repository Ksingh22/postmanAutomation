pipeline{
    agent any
    parameters{
            choice(name: 'ENV', choices: ['QA, DEV'])
    }
    stages{
        stage("get secrets from aws"){
            steps{
                script{
                        sh (script: "aws secretsmanager get-secret-value --region us-east-2 --secret-id postmankey")
                echo "building on ${ENV}"
                        }
                }
        }
    }
}
