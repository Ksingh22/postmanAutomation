pipeline{
    agent any
    parameters{
            choice(name: 'ENV', choices['QA, DEV'])
    }
    stages{
        stage("get secrets from aws"){
            steps{
                script{
                         apikey=  apikey = sh (script: "aws secretsmanager get-secret-value --region us-east-2 --secret-id postmankey | jq -r .SecretString | jq -r .postmankey", returnStdout: true)
                echo "building on ${ENV}"
                }
               
            }
        }
    }
}