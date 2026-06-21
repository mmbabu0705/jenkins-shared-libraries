def call() {

    withSonarQubeEnv('sonarqube') {

        sh '''
        mvn sonar:sonar \
        -Dsonar.projectKey=flipkart \
        -Dsonar.projectName=flipkart
        '''
    }
}