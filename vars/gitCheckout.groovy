def call() {
    checkout scmGit(
        branches: [[name: '*/master']],
        extensions: [],
        userRemoteConfigs: [[url: 'https://github.com/mmbabu0705/maven-web-app.git']]
    )
}