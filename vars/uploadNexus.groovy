def call() {

    nexusArtifactUploader(
        artifacts: [[
            artifactId: '01-maven-web-app',
            classifier: '',
            file: "${WORKSPACE}/target/maven-web-app.war",
            type: 'war'
        ]],
        credentialsId: 'nexus_cred',
        groupId: 'in.teksit',
        nexusUrl: '43.205.231.9:8081',
        nexusVersion: 'nexus3',
        protocol: 'http',
        repository: 'teksit-snapshot-repository',
        version: '1.0-SNAPSHOT'
    )
}