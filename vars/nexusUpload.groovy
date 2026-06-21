def call() {

    nexusArtifactUploader(
        nexusVersion: 'nexus3',
        protocol: 'http',
        nexusUrl: '172.31.10.20:8081',
        groupId: 'com.flipkart',
        version: "${BUILD_NUMBER}",
        repository: 'maven-releases',
        credentialsId: 'nexus-creds',
        artifacts: [
            [
                artifactId: 'flipkart',
                classifier: '',
                file: 'target/*.war',
                type: 'war'
            ]
        ]
    )
}