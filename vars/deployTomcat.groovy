def call() {

    deploy(
        adapters: [
            tomcat9(
                credentialsId: 'tomcat_cred',
                path: '',
                url: 'http://3.111.30.231:8085/'
            )
        ],
        contextPath: null,
        war: '**/*.war'
    )
}