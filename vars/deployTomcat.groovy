def call() {

    sh '''
    scp target/*.war ubuntu@172.31.10.30:/opt/tomcat/webapps/
    '''
}