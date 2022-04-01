// node {
// //     stage('Clone code') {
// //         git 'https://github.com/Cybertek-Internal/demo-project.git'
// //     }
//
//     stage('Run tests'){
//         bat "mvn clean test"
//         //bat "mvn verify"
//     }
//
//     stage('Generate report'){
//            cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'target/cucumber.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
//     }
// }

pipeline {
    agent any
    stages {
        stage('Run Tests') {
            steps {
                bat "mvn clean test"
            }

            post {
                always {
                    junit '**/surefire-reports/*.xml'
                }
            }
        }
    }
}
