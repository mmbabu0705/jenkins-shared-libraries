def call() {
    echo "Running SonarQube Scan..."
    sh 'mvn sonar:sonar'
}
