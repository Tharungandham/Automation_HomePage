pipeline{
    agent any
    tools{
        maven 'mvn'
        java 'java'
    }
    parameters{
        choice(name:'BROWSER',choices:['chrome','Edge','safari'],description:'Browser Selection')
        choice(name:'TAGS',choices:['@smoke','@regression','@sanity'],description: 'Cucumber tag selection')
        choice(name: 'ENV',choices: ['qa','Uat'])
    }
    stages{
        stage('Checkout code'){
            steps{
                checkout scm
            }
        }
        stage('Build and Test'){
            steps{
                sh """
                mvn clean test\
                -Dcucumber.filter.tags=${params.TAGS}\
                -Dbrowser=${params.BROWSER}\
                -Denv=${params.ENV}
                """
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/cucumber-reports/*.json', fingerprint: true
        }
        failure {
            echo '❌ Test execution failed. Please check logs.'
        }
        success {
            echo '✅ Test execution completed successfully.'
        }
    }
}
